package com.raczy.chinesecheckers.session;

import com.raczy.chinesecheckers.GameInfo;
import com.raczy.chinesecheckers.Player;

/**
 * Interface which enables users to be notified about game state changes
 * Created by kacperraczy on 23.12.2017.
 */
public interface GameSessionObserver {
    void onStateChange(GameSession session, GameSessionState state);
    void onPlayerChange(GameSession session, Player current);
    void onBoardUpdate(GameSession session, GameInfo update);
}
