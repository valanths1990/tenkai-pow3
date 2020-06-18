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
package handlers.usercommandhandlers;

import org.l2jmobius.gameserver.enums.Race;
import org.l2jmobius.gameserver.handler.IUserCommandHandler;
import org.l2jmobius.gameserver.instancemanager.MapRegionManager;
import org.l2jmobius.gameserver.instancemanager.ZoneManager;
import org.l2jmobius.gameserver.model.actor.instance.PlayerInstance;
import org.l2jmobius.gameserver.model.zone.type.RespawnZone;
import org.l2jmobius.gameserver.network.SystemMessageId;
import org.l2jmobius.gameserver.network.serverpackets.SystemMessage;
import org.l2jmobius.gameserver.network.serverpackets.sessionzones.TimedHuntingZoneEnter;

/**
 * Loc user command.
 */
public class Loc implements IUserCommandHandler
{
	private static final int[] COMMAND_IDS =
	{
		0
	};
	
	@Override
	public boolean useUserCommand(int id, PlayerInstance player)
	{
		int region;
		final RespawnZone zone = ZoneManager.getInstance().getZone(player, RespawnZone.class);
		if (zone != null)
		{
			region = MapRegionManager.getInstance().getRestartRegion(player, zone.getAllRespawnPoints().get(Race.HUMAN)).getLocId();
		}
		else
		{
			region = MapRegionManager.getInstance().getMapRegionLocId(player);
		}
		
		SystemMessage sm;
		if (region > 0)
		{
			sm = new SystemMessage(region);
			if (sm.getSystemMessageId().getParamCount() == 3)
			{
				sm.addInt(player.getX());
				sm.addInt(player.getY());
				sm.addInt(player.getZ());
			}
		}
		else
		{
			sm = new SystemMessage(SystemMessageId.CURRENT_LOCATION_S1);
			sm.addString(player.getX() + ", " + player.getY() + ", " + player.getZ());
		}
		player.sendPacket(sm);
		//LOGGER.info("" + player.getX() + " " + player.getY() + " " + player.getZ() + " " + player.getHeading());
		LOGGER.info("{" + player.getX() + ", " + player.getY() + ", " + player.getZ() + ", " + player.getHeading() + "}");
		//LOGGER.info("x=\"" + player.getX() + "\" y=\"" + player.getY() + "\" z=\"" + player.getZ() + "\" heading=\"" + player.getHeading() + "\"");
		//LOGGER.info("<node X=\"" + player.getX() + "\" Y=\"" + player.getY() + "\" />");

		player.sendPacket(new TimedHuntingZoneEnter(1));
		return true;
	}
	
	@Override
	public int[] getUserCommandList()
	{
		return COMMAND_IDS;
	}
}
