//package com.github.enderflamee.enderenhancements189.deprecated;
//
//import com.github.enderflamee.enderenhancements189.EnderEnhancements;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.ItemSword;
//import net.minecraft.world.World;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//@Mixin(ItemSword.class)
//public class MixinItemSword {
//    @Inject(method = "onItemRightClick", at= @At("HEAD"), cancellable = true)
//    public void onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, CallbackInfoReturnable<ItemStack> cir) {
//        if (EnderEnhancements.ConfigFile.CancelSwordBlock) {
//            cir.setReturnValue(itemStackIn);
//            cir.cancel();
//        }
//    }
//}
