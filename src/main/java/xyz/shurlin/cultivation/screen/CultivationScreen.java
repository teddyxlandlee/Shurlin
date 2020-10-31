package xyz.shurlin.cultivation.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import xyz.shurlin.cultivation.CultivationRealm;

public class CultivationScreen extends HandledScreen<CultivationScreenHandler> {
    private CultivationRealm realm = handler.realm;

    public CultivationScreen(CultivationScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {

    }
}
