package minihud.mixin.overlay.beacon;

/*
@Mixin(TileEntityBeacon.class)
public abstract class TileEntityBeaconMixin extends TileEntityLockable
{
    @Shadow private int levels;

    private int levelsPre;

    @Inject(method = "setField", at = @At("RETURN"))
    private void onBeaconUpdate(int id, int value, CallbackInfo ci)
    {
        if (id == 0 && value != this.levels)
        {
            RenderContainer.BEACON_OVERLAY.setNeedsUpdate();
        }
    }

    @Inject(method = "updateSegmentColors", at = @At("HEAD"))
    private void onUpdateSegmentsPre(CallbackInfo ci)
    {
        this.levelsPre = this.levels;
    }

    @Inject(method = "updateSegmentColors", at = @At("RETURN"))
    private void onUpdateSegmentsPost(CallbackInfo ci)
    {
        if (this.levels != this.levelsPre)
        {
            RenderContainer.BEACON_OVERLAY.setNeedsUpdate();
        }
    }
}
*/
