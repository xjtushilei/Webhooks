package com.xjtushilei.webhooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author shilei
 * @Date 2017/9/29.
 */
@Entity
public class CommandInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String command;

    public CommandInfo() {
    }

    public CommandInfo(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}

