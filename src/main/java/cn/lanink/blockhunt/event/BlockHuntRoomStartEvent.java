package cn.lanink.blockhunt.event;

import cn.lanink.blockhunt.room.RoomBase;
import cn.nukkit.event.HandlerList;

/**
 * @author lt_name
 */
public class BlockHuntRoomStartEvent extends BlockHuntRoomEvent {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    public BlockHuntRoomStartEvent(RoomBase room) {
        this.room = room;
    }

}
