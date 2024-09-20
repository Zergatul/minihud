package minihud.mixin.render.world_gen_overlay;

/*
@Mixin(ChunkGeneratorOverworld.class)
public abstract class ChunkGeneratorOverworldMixin
{
    @ModifyArg(method = "populate",
               at = @At(value = "INVOKE",
                        target = "Lnet/minecraft/world/gen/feature/WorldGenDungeons;generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z"))
    private BlockPos minihud_onDungeonGenerationAttempt(BlockPos position)
    {
        if (RendererToggle.SPAWNER_POSITIONS.isRendererEnabled())
        {
            DataStorage.INSTANCE.worldGenPositions.addDungeonSpawnerPosition(malilib.util.position.BlockPos.of(position));
        }

        return position;
    }
}
*/
