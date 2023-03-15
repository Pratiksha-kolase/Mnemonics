package com.mnemonics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnemonics.model.MnemonicsModel;

public interface MnemonicsDao extends JpaRepository<MnemonicsModel, Long>{

}
