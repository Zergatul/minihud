package minihud.mixin.mod_data_update;

/*
@Mixin(NetHandlerPlayClient.class)
public abstract class NetHandlerPlayClientMixin
{
    @Inject(method = "handleChat", at = @At("RETURN"))
    private void onChatMessage(SPacketChat packet, CallbackInfo ci)
    {
        ChatUtils.onReceiveChatMessage(packet.getChatComponent());
    }

    @Inject(method = "handleTimeUpdate", at = @At("RETURN"))
    private void onTimeUpdate(SPacketTimeUpdate packetIn, CallbackInfo ci)
    {
        TpsDataManager.INSTANCE.onServerTimeUpdate(packetIn.getTotalWorldTime());
    }

    @Inject(method = "handlePlayerListHeaderFooter", at = @At("RETURN"))
    private void onHandlePlayerListHeaderFooter(SPacketPlayerListHeaderFooter packetIn, CallbackInfo ci)
    {
        TpsDataManager.INSTANCE.parsePlayerListFooterTpsData(packetIn.getFooter());
        MobCapDataHandler.INSTANCE.parsePlayerListFooterMobCapData(packetIn.getFooter());
    }

    @Inject(method = "handleChunkData", at = @At("RETURN"))
    private void markChunkChangedFullChunk(SPacketChunkData packet, CallbackInfo ci)
    {
        NotificationUtils.onChunkData(packet.getChunkX(), packet.getChunkZ(), packet.getTileEntityTags());
    }

    @Inject(method = "handleBlockChange", at = @At("RETURN"))
    private void markChunkChangedBlockChange(SPacketBlockChange packet, CallbackInfo ci)
    {
        NotificationUtils.onBlockChange(BlockPos.of(packet.getBlockPosition()), packet.getBlockState());
    }

    @Inject(method = "handleMultiBlockChange", at = @At("RETURN"))
    private void markChunkChangedMultiBlockChange(SPacketMultiBlockChange packet, CallbackInfo ci)
    {
        net.minecraft.util.math.ChunkPos pos = ((SPacketMultiBlockChangeMixin) packet).minihud_getChunkPos();
        NotificationUtils.onMultiBlockChange(new ChunkPos(pos.x, pos.z), packet.getChangedBlocks());
    }

    @Inject(method = "handleSpawnPosition", at = @At("RETURN"))
    private void onSetSpawn(SPacketSpawnPosition packet, CallbackInfo ci)
    {
        DataStorage.getInstance().setWorldSpawnIfUnknown(BlockPos.of(packet.getSpawnPos()));
    }
}
*/
