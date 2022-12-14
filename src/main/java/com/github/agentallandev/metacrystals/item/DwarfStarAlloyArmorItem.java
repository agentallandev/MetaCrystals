
package com.github.agentallandev.metacrystals.item;

import net.minecraft.sounds.SoundEvent;

public abstract class DwarfStarAlloyArmorItem extends ArmorItem {

	public DwarfStarAlloyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MetacrystalsModItems.DWARF_STAR_ALLOY_INGOT.get()));
			}

			@Override
			public String getName() {
				return "dwarf_star_alloy_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DwarfStarAlloyArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "metacrystals:textures/models/armor/dwarfstaralloy_layer_1.png";
		}

	}

	public static class Chestplate extends DwarfStarAlloyArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "metacrystals:textures/models/armor/dwarfstaralloy_layer_1.png";
		}

	}

	public static class Leggings extends DwarfStarAlloyArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "metacrystals:textures/models/armor/dwarfstaralloy_layer_2.png";
		}

	}

	public static class Boots extends DwarfStarAlloyArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "metacrystals:textures/models/armor/dwarfstaralloy_layer_1.png";
		}

	}

}
