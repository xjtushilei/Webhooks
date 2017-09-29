package com.xjtushilei.webhooks.repository;

import com.xjtushilei.webhooks.entity.CommandInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommandInfoRepository extends JpaRepository<CommandInfo, Long> {

        CommandInfo findByName(String name);

}