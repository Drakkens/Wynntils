/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wynn.model.item.properties;

import com.wynntils.core.managers.Managers;
import com.wynntils.core.managers.Model;
import com.wynntils.wynn.item.parsers.WynnItemMatchers;
import com.wynntils.wynn.item.properties.IngredientProperty;
import com.wynntils.wynn.model.item.ItemStackTransformManager.ItemPropertyWriter;

public class IngredientPropertyModel extends Model {
    private static final ItemPropertyWriter INGREDIENT_WRITER =
            new ItemPropertyWriter(WynnItemMatchers::isIngredient, IngredientProperty::new);

    public static void init() {
        Managers.ItemStackTransform.registerProperty(INGREDIENT_WRITER);
    }

    public static void disable() {
        Managers.ItemStackTransform.unregisterProperty(INGREDIENT_WRITER);
    }
}