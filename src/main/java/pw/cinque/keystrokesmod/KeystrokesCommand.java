// Generated by delombok at Tue Feb 02 13:58:02 CET 2021
package pw.cinque.keystrokesmod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

class KeystrokesCommand extends CommandBase {
    private final KeystrokesMod keystrokesMod;

    @Override
    public String getCommandName() {
        return "keystrokesmod";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        keystrokesMod.openGui();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @java.lang.SuppressWarnings("all")
    public KeystrokesCommand(final KeystrokesMod keystrokesMod) {
        this.keystrokesMod = keystrokesMod;
    }
}
