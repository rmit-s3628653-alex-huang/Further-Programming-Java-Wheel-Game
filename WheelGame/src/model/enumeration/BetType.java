//Further Programming Assignment 1 by Alex Huang s3628653
package model.enumeration;

import model.interfaces.Player;
import model.interfaces.Slot;

/**
 * Provided enum type for Further Programming representing a type of Bet<br>
 * See inline comments for where you need to provide additional code
 *
 * @author Caspar Ryan
 */
public enum BetType {
    RED {
        @Override
        public void applyWinLoss(Player player, Slot winSlot) {
            if (winSlot.getColor() == Color.RED)
                player.setPoints(player.getPoints() + player.getBet());
            	else
                player.setPoints(player.getPoints() - player.getBet());
        }
    },
    BLACK {
        @Override
        public void applyWinLoss(Player player, Slot winSlot) {
            if (winSlot.getColor() == Color.BLACK)
                player.setPoints(player.getPoints() + player.getBet());
            	else 
                player.setPoints(player.getPoints() - player.getBet());
        }
    },
    ZEROS {
        @Override
        public void applyWinLoss(Player player, Slot winSlot){
            if (winSlot.getColor() == Color.GREEN0 || winSlot.getColor() == Color.GREEN00) 
            	player.setPoints(player.getPoints() + player.getBet()*18);
             	else 
                player.setPoints(player.getPoints() - player.getBet());
        }
    };

    /**
     * This method is to be overridden for each bet type<br>
     * see assignment specification for betting odds and how win/loss is applied
     *
     * @param player  - the player to apply the win/loss points balance adjustment
     * @param winSlot - the winning slot the ball landed on
     */
    public abstract void applyWinLoss(Player player, Slot winSlot);
}