/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package handlers.effecthandlers;

import org.l2jmobius.gameserver.enums.PrivateStoreType;
import org.l2jmobius.gameserver.model.StatSet;
import org.l2jmobius.gameserver.model.actor.Creature;
import org.l2jmobius.gameserver.model.actor.instance.PlayerInstance;
import org.l2jmobius.gameserver.model.effects.AbstractEffect;
import org.l2jmobius.gameserver.model.items.instance.ItemInstance;
import org.l2jmobius.gameserver.model.skills.Skill;
import org.l2jmobius.gameserver.network.SystemMessageId;
import org.l2jmobius.gameserver.network.serverpackets.RecipeBookItemList;

/**
 * Open Common Recipe Book effect implementation.
 * @author Adry_85
 */
public class OpenCommonRecipeBook extends AbstractEffect
{
	public OpenCommonRecipeBook(StatSet params)
	{
	}
	
	@Override
	public boolean isInstant()
	{
		return true;
	}
	
	@Override
	public void instant(Creature effector, Creature effected, Skill skill, ItemInstance item)
	{
		final PlayerInstance casterPlayer = effector.getActingPlayer();
		if (casterPlayer == null)
		{
			return;
		}
		
		if (casterPlayer.getPrivateStoreType() == PrivateStoreType.MANUFACTURE)
		{
			casterPlayer.sendPacket(SystemMessageId.YOU_MAY_NOT_ALTER_YOUR_RECIPE_BOOK_WHILE_ENGAGED_IN_MANUFACTURING);
			return;
		}
		
		if (casterPlayer.isProcessingTransaction())
		{
			casterPlayer.sendPacket(SystemMessageId.ITEM_CREATION_IS_NOT_POSSIBLE_WHILE_ENGAGED_IN_A_TRADE);
			return;
		}
		
		casterPlayer.sendPacket(new RecipeBookItemList(casterPlayer, false));
	}
}
