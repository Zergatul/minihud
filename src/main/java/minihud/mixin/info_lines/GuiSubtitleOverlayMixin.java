package minihud.mixin.info_lines;

/*
@Mixin(GuiSubtitleOverlay.class)
public abstract class GuiSubtitleOverlayMixin extends Gui
{
    @Inject(method = "renderSubtitles", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/renderer/GlStateManager;tryBlendFuncSeparate(" +
            "Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;" +
            "Lnet/minecraft/client/renderer/GlStateManager$DestFactor;" +
            "Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;" +
            "Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V",
            shift = Shift.AFTER))
    private void nudgeSubtitleOverlay(CallbackInfo ci)
    {
        if (Configs.Generic.OFFSET_SUBTITLE_HUD.getBooleanValue())
        {
            int offset = RenderHandler.INSTANCE.getSubtitleOffset();

            if (offset != 0)
            {
                RenderWrap.translate(0, offset, 0, RenderContext.DUMMY);
            }
        }
    }
}
*/
