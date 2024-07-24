if (v.getInventory().inventoryFull()){
    v.getInventory().drop(436);
}
else if (!v.getLocalPlayer().hasAnimation(627) && !v.getWalking().isMoving() && (v.getWalking().nearEntity(Entity.GAME, 10943, 5) || v.getWalking().nearEntity(Entity.GAME, 11161, 5))) {
                    v.getMining().mine(10943,11161);
}         