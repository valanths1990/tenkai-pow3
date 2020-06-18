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
package quests.not_done;

import org.l2jmobius.Config;
import org.l2jmobius.gameserver.model.quest.Quest;

/**
 * @author Mobius
 */
public class Q10355_BlacksmithsSoul1 extends Quest
{
	private static final int START_NPC = 34095;
	
	public Q10355_BlacksmithsSoul1()
	{
		super(10355);
		addStartNpc(START_NPC);
		addTalkId(START_NPC);
		addCondMinLevel(Config.PLAYER_MAXIMUM_LEVEL, getNoQuestMsg(null));
	}
}
