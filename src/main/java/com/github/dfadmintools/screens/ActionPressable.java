package com.github.dfadmintools.screens;

import com.github.dfadmintools.actions.Action;
import net.minecraft.client.gui.widget.button.Button;

public class ActionPressable implements Button.IPressable {
    private final Action action;

    public ActionPressable(Action action) {
        this.action = action;
    }

    @Override
    public void onPress(Button p_onPress_1_) {
        action.run();
    }
}