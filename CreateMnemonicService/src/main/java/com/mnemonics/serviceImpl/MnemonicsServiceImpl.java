package com.mnemonics.serviceImpl;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;

import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.crypto.MnemonicException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mnemonics.dao.MnemonicsDao;
import com.mnemonics.dto.MnemonicsDto;
import com.mnemonics.model.MnemonicsModel;
import com.mnemonics.service.MnemonicsService;

@Service
public class MnemonicsServiceImpl implements MnemonicsService{
	

	private static final int ENTROPY_BITS = 256; 
	
	@Autowired
	private MnemonicsDao mnemonicsDao;
	
	@Override
	public ResponseEntity<Object> createMnemonics() throws IOException {
		byte[] entropy = generateEntropy(ENTROPY_BITS);
        List<String> words = generateMnemonic(entropy);
        String mnemonicPhrase = joinMnemonic(words);

        MnemonicsModel mnemonicsModel = new MnemonicsModel();
        mnemonicsModel.setMnemonicString(mnemonicPhrase);
        mnemonicsModel.setCreatedTimeDate(new Date());
        mnemonicsDao.save(mnemonicsModel);
        return new ResponseEntity<>("Your mnemonics: "+ mnemonicPhrase,HttpStatus.OK);
	}
	private byte[] generateEntropy(int bits) {
        byte[] entropy = new byte[bits/8];
        new SecureRandom().nextBytes(entropy);
        return entropy;
    }

    private List<String> generateMnemonic(byte[] entropy) throws IOException {
        try {
            MnemonicCode mnemonicCode = new MnemonicCode();
            return mnemonicCode.toMnemonic(entropy);
        } catch (MnemonicException e) {
            throw new RuntimeException("Error generating mnemonic phrase", e);
        }
    }

    private String joinMnemonic(List<String> words) {
        return String.join(" ", words);
    }
	

}
