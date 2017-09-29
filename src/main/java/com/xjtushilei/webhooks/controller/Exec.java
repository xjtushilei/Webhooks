package com.xjtushilei.webhooks.controller;

import com.xjtushilei.webhooks.entity.CommandInfo;
import com.xjtushilei.webhooks.repository.CommandInfoRepository;
import com.xjtushilei.webhooks.utils.Cmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shilei
 * @Date 2017/9/29.
 */
@RestController
public class Exec {
    @Autowired
    private CommandInfoRepository commandInfoRepository;

    @RequestMapping(value = "/execLinux/{name}", method = RequestMethod.POST)
    public String execLinuxCommand(@PathVariable String name) {

        CommandInfo command = commandInfoRepository.findByName(name);
        String result =Cmd.execLinuxCmd(command.getCommand());
        return result;
    }

    @RequestMapping(value = "/execWin/{name}", method = RequestMethod.POST)
    public String execWinCommand(@PathVariable String name) {

        CommandInfo command = commandInfoRepository.findByName(name);
        String result =Cmd.execWindowsCmd(command.getCommand());
        return result;
    }

    @RequestMapping(value = "/test")
    public String test(@RequestParam(value = "hi", defaultValue = "nihao") String hi) {

        return "test(@RequestParam(value = \"hi\", defaultValue = \"nihao\")："+hi;
    }
}
