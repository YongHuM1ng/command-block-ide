package arm32x.minecraft.commandblockide.update;

import net.minecraft.block.entity.CommandBlockBlockEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;

public interface UpdateRequester {
	void requestUpdate(ClientPlayNetworkHandler networkHandler, CommandBlockBlockEntity blockEntity);
}