package dev.blacktiger.chatcopy

import net.fabricmc.api.ClientModInitializer

object ChatCopyFabric : ClientModInitializer {
    override fun onInitializeClient() {
        println("ChatCopyFabric loaded")
    }
}
