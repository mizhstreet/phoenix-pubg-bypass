package com.mb.darkphoenix;

import java.util.ArrayList;

public class Command extends ExecuteAsRootBase {
    @Override
    protected ArrayList<String> getCommandsToExecute() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("rm -rf /data/data/com.tencent.ig/files");
        commands.add("rm -rf /data/data/com.microvirt.installer");
        commands.add("rm -rf /data/data/com.pubg.krmobile/files");
        commands.add("rm -rf /data/data/com.vng.pubgmobile/files");
        commands.add("rm -rf /data/data/com.microvirt.market");
        return commands;
    }
}
