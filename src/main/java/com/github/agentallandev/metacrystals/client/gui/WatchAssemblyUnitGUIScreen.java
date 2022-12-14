
package com.github.agentallandev.metacrystals.client.gui;

public class WatchAssemblyUnitGUIScreen extends AbstractContainerScreen<WatchAssemblyUnitGUIMenu> {

	private final static HashMap<String, Object> guistate = WatchAssemblyUnitGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WatchAssemblyUnitGUIScreen(WatchAssemblyUnitGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 206;
	}

	private static final ResourceLocation texture = new ResourceLocation("metacrystals:textures/screens/watch_assembly_unit_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("metacrystals:textures/screens/watch_band.png"));
		this.blit(ms, this.leftPos + 43, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("metacrystals:textures/screens/watch_band.png"));
		this.blit(ms, this.leftPos + 115, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("metacrystals:textures/screens/watch_core.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("metacrystals:textures/screens/watch_buckle.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 91, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Watch Assembly Unit", 38, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();

		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);

		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 90, 67, 20, new TextComponent("Assemble"), e -> {
			if (true) {
				MetacrystalsMod.PACKET_HANDLER.sendToServer(new WatchAssemblyUnitGUIButtonMessage(0, x, y, z));
				WatchAssemblyUnitGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 101, this.topPos + 90, 61, 20, new TextComponent("Upgrade "), e -> {
			if (true) {
				MetacrystalsMod.PACKET_HANDLER.sendToServer(new WatchAssemblyUnitGUIButtonMessage(1, x, y, z));
				WatchAssemblyUnitGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}

}
