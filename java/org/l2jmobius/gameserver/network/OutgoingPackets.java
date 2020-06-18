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
package org.l2jmobius.gameserver.network;

import org.l2jmobius.commons.network.PacketWriter;

/**
 * @author UnAfraid
 */
public enum OutgoingPackets
{
	// Packets
	DIE(0x00),
	REVIVE(0x01),
	ATTACK_OUT_OF_RANGE(0x02),
	ATTACKIN_COOL_TIME(0x03),
	ATTACK_DEAD_TARGET(0x04),
	SPAWN_ITEM(0x05),
	SELL_LIST(0x06),
	BUY_LIST(0x07),
	DELETE_OBJECT(0x08),
	CHARACTER_SELECTION_INFO(0x09),
	LOGIN_FAIL(0x0A),
	CHARACTER_SELECTED(0x0B),
	NPC_INFO(0x0C),
	NEW_CHARACTER_SUCCESS(0x0D),
	NEW_CHARACTER_FAIL(0x0E),
	CHARACTER_CREATE_SUCCESS(0x0F),
	CHARACTER_CREATE_FAIL(0x10),
	ITEM_LIST(0x11),
	SUN_RISE(0x12),
	SUN_SET(0x13),
	TRADE_START(0x14),
	TRADE_START_OK(0x15),
	DROP_ITEM(0x16),
	GET_ITEM(0x17),
	STATUS_UPDATE(0x18),
	NPC_HTML_MESSAGE(0x19),
	TRADE_OWN_ADD(0x1A),
	TRADE_OTHER_ADD(0x1B),
	TRADE_DONE(0x1C),
	CHARACTER_DELETE_SUCCESS(0x1D),
	CHARACTER_DELETE_FAIL(0x1E),
	ACTION_FAIL(0x1F),
	SEVER_CLOSE(0x20),
	INVENTORY_UPDATE(0x21),
	TELEPORT_TO_LOCATION(0x22),
	TARGET_SELECTED(0x23),
	TARGET_UNSELECTED(0x24),
	AUTO_ATTACK_START(0x25),
	AUTO_ATTACK_STOP(0x26),
	SOCIAL_ACTION(0x27),
	CHANGE_MOVE_TYPE(0x28),
	CHANGE_WAIT_TYPE(0x29),
	MANAGE_PLEDGE_POWER(0x2A),
	CREATE_PLEDGE(0x2B),
	ASK_JOIN_PLEDGE(0x2C),
	JOIN_PLEDGE(0x2D),
	VERSION_CHECK(0x2E),
	MOVE_TO_LOCATION(0x2F),
	NPC_SAY(0x30),
	CHAR_INFO(0x31),
	USER_INFO(0x32),
	ATTACK(0x33),
	WITHDRAWAL_PLEDGE(0x34),
	OUST_PLEDGE_MEMBER(0x35),
	SET_OUST_PLEDGE_MEMBER(0x36),
	DISMISS_PLEDGE(0x37),
	SET_DISMISS_PLEDGE(0x38),
	ASK_JOIN_PARTY(0x39),
	JOIN_PARTY(0x3A),
	WITHDRAWAL_PARTY(0x3B),
	OUST_PARTY_MEMBER(0x3C),
	SET_OUST_PARTY_MEMBER(0x3D),
	DISMISS_PARTY(0x3E),
	SET_DISMISS_PARTY(0x3F),
	MAGIC_AND_SKILL_LIST(0x40),
	WAREHOUSE_DEPOSIT_LIST(0x41),
	WAREHOUSE_WITHDRAW_LIST(0x42),
	WAREHOUSE_DONE(0x43),
	SHORT_CUT_REGISTER(0x44),
	SHORT_CUT_INIT(0x45),
	SHORT_CUT_DELETE(0x46),
	STOP_MOVE(0x47),
	MAGIC_SKILL_USE(0x48),
	MAGIC_SKILL_CANCELED(0x49),
	SAY2(0x4A),
	NPC_INFO_ABNORMAL_VISUAL_EFFECT(0x4B),
	DOOR_INFO(0x4C),
	DOOR_STATUS_UPDATE(0x4D),
	PARTY_SMALL_WINDOW_ALL(0x4E),
	PARTY_SMALL_WINDOW_ADD(0x4F),
	PARTY_SMALL_WINDOW_DELETE_ALL(0x50),
	PARTY_SMALL_WINDOW_DELETE(0x51),
	PARTY_SMALL_WINDOW_UPDATE(0x52),
	TRADE_PRESS_OWN_OK(0x53),
	MAGIC_SKILL_LAUNCHED(0x54),
	FRIEND_ADD_REQUEST_RESULT(0x55),
	FRIEND_ADD(0x56),
	FRIEND_REMOVE(0x57),
	FRIEND_LIST(0x58),
	FRIEND_STATUS(0x59),
	PLEDGE_SHOW_MEMBER_LIST_ALL(0x5A),
	PLEDGE_SHOW_MEMBER_LIST_UPDATE(0x5B),
	PLEDGE_SHOW_MEMBER_LIST_ADD(0x5C),
	PLEDGE_SHOW_MEMBER_LIST_DELETE(0x5D),
	MAGIC_LIST(0x5E),
	SKILL_LIST(0x5F),
	VEHICLE_INFO(0x60),
	FINISH_ROTATING(0x61),
	SYSTEM_MESSAGE(0x62),
	START_PLEDGE_WAR(0x63),
	REPLY_START_PLEDGE_WAR(0x64),
	STOP_PLEDGE_WAR(0x65),
	REPLY_STOP_PLEDGE_WAR(0x66),
	SURRENDER_PLEDGE_WAR(0x67),
	REPLY_SURRENDER_PLEDGE_WAR(0x68),
	SET_PLEDGE_CREST(0x69),
	PLEDGE_CREST(0x6A),
	SETUP_GAUGE(0x6B),
	VEHICLE_DEPARTURE(0x6C),
	VEHICLE_CHECK_LOCATION(0x6D),
	GET_ON_VEHICLE(0x6E),
	GET_OFF_VEHICLE(0x6F),
	TRADE_REQUEST(0x70),
	RESTART_RESPONSE(0x71),
	MOVE_TO_PAWN(0x72),
	SSQ_INFO(0x73),
	GAME_GUARD_QUERY(0x74),
	L2_FRIEND_LIST(0x75),
	L2_FRIEND(0x76),
	L2_FRIEND_STATUS(0x77),
	L2_FRIEND_SAY(0x78),
	VALIDATE_LOCATION(0x79),
	START_ROTATING(0x7A),
	SHOW_BOARD(0x7B),
	CHOOSE_INVENTORY_ITEM(0x7C),
	DUMMY(0x7D),
	MOVE_TO_LOCATION_IN_VEHICLE(0x7E),
	STOP_MOVE_IN_VEHICLE(0x7F),
	VALIDATE_LOCATION_IN_VEHICLE(0x80),
	TRADE_UPDATE(0x81),
	TRADE_PRESS_OTHER_OK(0x82),
	FRIEND_ADD_REQUEST(0x83),
	LOG_OUT_OK(0x84),
	ABNORMAL_STATUS_UPDATE(0x85),
	QUEST_LIST(0x86),
	ENCHANT_RESULT(0x87),
	PLEDGE_SHOW_MEMBER_LIST_DELETE_ALL(0x88),
	PLEDGE_INFO(0x89),
	PLEDGE_EXTENDED_INFO(0x8A),
	SUMMON_INFO(0x8B),
	RIDE(0x8C),
	DUMMY2(0x8D),
	PLEDGE_SHOW_INFO_UPDATE(0x8E),
	CLIENT_ACTION(0x8F),
	ACQUIRE_SKILL_LIST(0x90),
	ACQUIRE_SKILL_INFO(0x91),
	SERVER_OBJECT_INFO(0x92),
	GM_HIDE(0x93),
	ACQUIRE_SKILL_DONE(0x94),
	GM_VIEW_CHARACTER_INFO(0x95),
	GM_VIEW_PLEDGE_INFO(0x96),
	GM_VIEW_SKILL_INFO(0x97),
	GM_VIEW_MAGIC_INFO(0x98),
	GM_VIEW_QUEST_INFO(0x99),
	GM_VIEW_ITEM_LIST(0x9A),
	GM_VIEW_WAREHOUSE_WITHDRAW_LIST(0x9B),
	LIST_PARTY_WATING(0x9C),
	PARTY_ROOM_INFO(0x9D),
	PLAY_SOUND(0x9E),
	STATIC_OBJECT(0x9F),
	PRIVATE_STORE_MANAGE_LIST(0xA0),
	PRIVATE_STORE_LIST(0xA1),
	PRIVATE_STORE_MSG(0xA2),
	SHOW_MINIMAP(0xA3),
	REVIVE_REQUEST(0xA4),
	ABNORMAL_VISUAL_EFFECT(0xA5),
	TUTORIAL_SHOW_HTML(0xA6),
	TUTORIAL_SHOW_QUESTION_MARK(0xA7),
	TUTORIAL_ENABLE_CLIENT_EVENT(0xA8),
	TUTORIAL_CLOSE_HTML(0xA9),
	SHOW_RADAR(0xAA),
	WITHDRAW_ALLIANCE(0xAB),
	OUST_ALLIANCE_MEMBER_PLEDGE(0xAC),
	DISMISS_ALLIANCE(0xAD),
	SET_ALLIANCE_CREST(0xAE),
	ALLIANCE_CREST(0xAF),
	SERVER_CLOSE_SOCKET(0xB0),
	PET_STATUS_SHOW(0xB1),
	PET_INFO(0xB2),
	PET_ITEM_LIST(0xB3),
	PET_INVENTORY_UPDATE(0xB4),
	ALLIANCE_INFO(0xB5),
	PET_STATUS_UPDATE(0xB6),
	PET_DELETE(0xB7),
	DELETE_RADAR(0xB8),
	MY_TARGET_SELECTED(0xB9),
	PARTY_MEMBER_POSITION(0xBA),
	ASK_JOIN_ALLIANCE(0xBB),
	JOIN_ALLIANCE(0xBC),
	PRIVATE_STORE_BUY_MANAGE_LIST(0xBD),
	PRIVATE_STORE_BUY_LIST(0xBE),
	PRIVATE_STORE_BUY_MSG(0xBF),
	VEHICLE_START(0xC0),
	NPC_INFO_STATE(0xC1),
	START_ALLIANCE_WAR(0xC2),
	REPLY_START_ALLIANCE_WAR(0xC3),
	STOP_ALLIANCE_WAR(0xC4),
	REPLY_STOP_ALLIANCE_WAR(0xC5),
	SURRENDER_ALLIANCE_WAR(0xC6),
	SKILL_COOL_TIME(0xC7),
	PACKAGE_TO_LIST(0xC8),
	CASTLE_SIEGE_INFO(0xC9),
	CASTLE_SIEGE_ATTACKER_LIST(0xCA),
	CASTLE_SIEGE_DEFENDER_LIST(0xCB),
	NICK_NAME_CHANGED(0xCC),
	PLEDGE_STATUS_CHANGED(0xCD),
	RELATION_CHANGED(0xCE),
	EVENT_TRIGGER(0xCF),
	MULTI_SELL_LIST(0xD0),
	SET_SUMMON_REMAIN_TIME(0xD1),
	PACKAGE_SENDABLE_LIST(0xD2),
	EARTHQUAKE(0xD3),
	FLY_TO_LOCATION(0xD4),
	BLOCK_LIST(0xD5),
	SPECIAL_CAMERA(0xD6),
	NORMAL_CAMERA(0xD7),
	SKILL_REMAIN_SEC(0xD8),
	NET_PING(0xD9),
	DICE(0xDA),
	SNOOP(0xDB),
	RECIPE_BOOK_ITEM_LIST(0xDC),
	RECIPE_ITEM_MAKE_INFO(0xDD),
	RECIPE_SHOP_MANAGE_LIST(0xDE),
	RECIPE_SHOP_SELL_LIST(0xDF),
	RECIPE_SHOP_ITEM_INFO(0xE0),
	RECIPE_SHOP_MSG(0xE1),
	SHOW_CALC(0xE2),
	MON_RACE_INFO(0xE3),
	HENNA_ITEM_INFO(0xE4),
	HENNA_INFO(0xE5),
	HENNA_UNEQUIP_LIST(0xE6),
	HENNA_UNEQUIP_INFO(0xE7),
	MACRO_LIST(0xE8),
	BUY_LIST_SEED(0xE9),
	SHOW_TOWN_MAP(0xEA),
	OBSERVER_START(0xEB),
	OBSERVER_END(0xEC),
	CHAIR_SIT(0xED),
	HENNA_EQUIP_LIST(0xEE),
	SELL_LIST_PROCURE(0xEF),
	GMHENNA_INFO(0xF0),
	RADAR_CONTROL(0xF1),
	CLIENT_SET_TIME(0xF2),
	CONFIRM_DLG(0xF3),
	PARTY_SPELLED(0xF4),
	SHOP_PREVIEW_LIST(0xF5),
	SHOP_PREVIEW_INFO(0xF6),
	CAMERA_MODE(0xF7),
	SHOW_XMAS_SEAL(0xF8),
	ETC_STATUS_UPDATE(0xF9),
	SHORT_BUFF_STATUS_UPDATE(0xFA),
	SSQ_STATUS(0xFB),
	PETITION_VOTE(0xFC),
	AGIT_DECO_INFO(0xFD),
	DUMMY3(0xFE),
	// ExPackets
	EX_DUMMY(0xFE, 0x00),
	EX_REGEN_MAX(0xFE, 0x01),
	EX_EVENT_MATCH_USER_INFO(0xFE, 0x02),
	EX_COLOSSEUM_FENCE_INFO(0xFE, 0x03),
	EX_EVENT_MATCH_SPELLED_INFO(0xFE, 0x04),
	EX_EVENT_MATCH_FIRECRACKER(0xFE, 0x05),
	EX_EVENT_MATCH_TEAM_UNLOCKED(0xFE, 0x06),
	EX_EVENT_MATCH_GMTEST(0xFE, 0x07),
	EX_PARTY_ROOM_MEMBER(0xFE, 0x08),
	EX_CLOSE_PARTY_ROOM(0xFE, 0x09),
	EX_MANAGE_PARTY_ROOM_MEMBER(0xFE, 0x0A),
	EX_EVENT_MATCH_LOCK_RESULT(0xFE, 0x0B),
	EX_AUTO_SOUL_SHOT(0xFE, 0x0C),
	EX_EVENT_MATCH_LIST(0xFE, 0x0D),
	EX_EVENT_MATCH_OBSERVER(0xFE, 0x0E),
	EX_EVENT_MATCH_MESSAGE(0xFE, 0x0F),
	EX_EVENT_MATCH_SCORE(0xFE, 0x10),
	EX_SERVER_PRIMITIVE(0xFE, 0x11),
	EX_OPEN_MPCC(0xFE, 0x12),
	EX_CLOSE_MPCC(0xFE, 0x13),
	EX_SHOW_CASTLE_INFO(0xFE, 0x14),
	EX_SHOW_FORTRESS_INFO(0xFE, 0x15),
	EX_SHOW_AGIT_INFO(0xFE, 0x16),
	EX_SHOW_FORTRESS_SIEGE_INFO(0xFE, 0x17),
	EX_PARTY_PET_WINDOW_ADD(0xFE, 0x18),
	EX_PARTY_PET_WINDOW_UPDATE(0xFE, 0x19),
	EX_ASK_JOIN_MPCC(0xFE, 0x1A),
	EX_PLEDGE_EMBLEM(0xFE, 0x1B),
	EX_EVENT_MATCH_TEAM_INFO(0xFE, 0x1C),
	EX_EVENT_MATCH_CREATE(0xFE, 0x1D),
	EX_FISHING_START(0xFE, 0x1E),
	EX_FISHING_END(0xFE, 0x1F),
	EX_SHOW_QUEST_INFO(0xFE, 0x20),
	EX_SHOW_QUEST_MARK(0xFE, 0x21),
	EX_SEND_MANOR_LIST(0xFE, 0x22),
	EX_SHOW_SEED_INFO(0xFE, 0x23),
	EX_SHOW_CROP_INFO(0xFE, 0x24),
	EX_SHOW_MANOR_DEFAULT_INFO(0xFE, 0x25),
	EX_SHOW_SEED_SETTING(0xFE, 0x26),
	EX_FISHING_START_COMBAT(0xFE, 0x27),
	EX_FISHING_HP_REGEN(0xFE, 0x28),
	EX_ENCHANT_SKILL_LIST(0xFE, 0x29),
	EX_ENCHANT_SKILL_INFO(0xFE, 0x2A),
	EX_SHOW_CROP_SETTING(0xFE, 0x2B),
	EX_SHOW_SELL_CROP_LIST(0xFE, 0x2C),
	EX_OLYMPIAD_MATCH_END(0xFE, 0x2D),
	EX_MAIL_ARRIVED(0xFE, 0x2E),
	EX_STORAGE_MAX_COUNT(0xFE, 0x2F),
	EX_EVENT_MATCH_MANAGE(0xFE, 0x30),
	EX_MULTI_PARTY_COMMAND_CHANNEL_INFO(0xFE, 0x31),
	EX_PCCAFE_POINT_INFO(0xFE, 0x32),
	EX_SET_COMPASS_ZONE_CODE(0xFE, 0x33),
	EX_GET_BOSS_RECORD(0xFE, 0x34),
	EX_ASK_JOIN_PARTY_ROOM(0xFE, 0x35),
	EX_LIST_PARTY_MATCHING_WAITING_ROOM(0xFE, 0x36),
	EX_SET_MPCC_ROUTING(0xFE, 0x37),
	EX_SHOW_ADVENTURER_GUIDE_BOOK(0xFE, 0x38),
	EX_SHOW_SCREEN_MESSAGE(0xFE, 0x39),
	PLEDGE_SKILL_LIST(0xFE, 0x3A),
	PLEDGE_SKILL_LIST_ADD(0xFE, 0x3B),
	PLEDGE_SKILL_LIST_REMOVE(0xFE, 0x3C),
	PLEDGE_POWER_GRADE_LIST(0xFE, 0x3D),
	PLEDGE_RECEIVE_POWER_INFO(0xFE, 0x3E),
	PLEDGE_RECEIVE_MEMBER_INFO(0xFE, 0x3F),
	PLEDGE_RECEIVE_WAR_LIST(0xFE, 0x40),
	PLEDGE_RECEIVE_SUB_PLEDGE_CREATED(0xFE, 0x41),
	EX_RED_SKY(0xFE, 0x42),
	PLEDGE_RECEIVE_UPDATE_POWER(0xFE, 0x43),
	FLY_SELF_DESTINATION(0xFE, 0x44),
	SHOW_PCCAFE_COUPON_SHOW_UI(0xFE, 0x45),
	EX_SEARCH_ORC(0xFE, 0x46),
	EX_CURSED_WEAPON_LIST(0xFE, 0x47),
	EX_CURSED_WEAPON_LOCATION(0xFE, 0x48),
	EX_RESTART_CLIENT(0xFE, 0x49),
	EX_REQUEST_HACK_SHIELD(0xFE, 0x4A),
	EX_USE_SHARED_GROUP_ITEM(0xFE, 0x4B),
	EX_MPCCSHOW_PARTY_MEMBER_INFO(0xFE, 0x4C),
	EX_DUEL_ASK_START(0xFE, 0x4D),
	EX_DUEL_READY(0xFE, 0x4E),
	EX_DUEL_START(0xFE, 0x4F),
	EX_DUEL_END(0xFE, 0x50),
	EX_DUEL_UPDATE_USER_INFO(0xFE, 0x51),
	EX_SHOW_VARIATION_MAKE_WINDOW(0xFE, 0x52),
	EX_SHOW_VARIATION_CANCEL_WINDOW(0xFE, 0x53),
	EX_PUT_ITEM_RESULT_FOR_VARIATION_MAKE(0xFE, 0x54),
	EX_PUT_INTENSIVE_RESULT_FOR_VARIATION_MAKE(0xFE, 0x55),
	EX_PUT_COMMISSION_RESULT_FOR_VARIATION_MAKE(0xFE, 0x56),
	EX_VARIATION_RESULT(0xFE, 0x57),
	EX_PUT_ITEM_RESULT_FOR_VARIATION_CANCEL(0xFE, 0x58),
	EX_VARIATION_CANCEL_RESULT(0xFE, 0x59),
	EX_DUEL_ENEMY_RELATION(0xFE, 0x5A),
	EX_PLAY_ANIMATION(0xFE, 0x5B),
	EX_MPCCPARTY_INFO_UPDATE(0xFE, 0x5C),
	EX_PLAY_SCENE(0xFE, 0x5D),
	EX_SPAWN_EMITTER(0xFE, 0x5E),
	EX_ENCHANT_SKILL_INFO_DETAIL(0xFE, 0x5F),
	EX_BASIC_ACTION_LIST(0xFE, 0x60),
	EX_AIR_SHIP_INFO(0xFE, 0x61),
	EX_ATTRIBUTE_ENCHANT_RESULT(0xFE, 0x62),
	EX_CHOOSE_INVENTORY_ATTRIBUTE_ITEM(0xFE, 0x63),
	EX_GET_ON_AIR_SHIP(0xFE, 0x64),
	EX_GET_OFF_AIR_SHIP(0xFE, 0x65),
	EX_MOVE_TO_LOCATION_AIR_SHIP(0xFE, 0x66),
	EX_STOP_MOVE_AIR_SHIP(0xFE, 0x67),
	EX_SHOW_TRACE(0xFE, 0x68),
	EX_ITEM_AUCTION_INFO(0xFE, 0x69),
	EX_NEED_TO_CHANGE_NAME(0xFE, 0x6A),
	EX_PARTY_PET_WINDOW_DELETE(0xFE, 0x6B),
	EX_TUTORIAL_LIST(0xFE, 0x6C),
	EX_RP_ITEM_LINK(0xFE, 0x6D),
	EX_MOVE_TO_LOCATION_IN_AIR_SHIP(0xFE, 0x6E),
	EX_STOP_MOVE_IN_AIR_SHIP(0xFE, 0x6F),
	EX_VALIDATE_LOCATION_IN_AIR_SHIP(0xFE, 0x70),
	EX_UI_SETTING(0xFE, 0x71),
	EX_MOVE_TO_TARGET_IN_AIR_SHIP(0xFE, 0x72),
	EX_ATTACK_IN_AIR_SHIP(0xFE, 0x73),
	EX_MAGIC_SKILL_USE_IN_AIR_SHIP(0xFE, 0x74),
	EX_SHOW_BASE_ATTRIBUTE_CANCEL_WINDOW(0xFE, 0x75),
	EX_BASE_ATTRIBUTE_CANCEL_RESULT(0xFE, 0x76),
	EX_SUB_PLEDGET_SKILL_ADD(0xFE, 0x77),
	EX_RESPONSE_FREE_SERVER(0xFE, 0x78),
	EX_SHOW_PROCURE_CROP_DETAIL(0xFE, 0x79),
	EX_HERO_LIST(0xFE, 0x7A),
	EX_OLYMPIAD_USER_INFO(0xFE, 0x7B),
	EX_OLYMPIAD_SPELLED_INFO(0xFE, 0x7C),
	EX_OLYMPIAD_MODE(0xFE, 0x7D),
	EX_SHOW_FORTRESS_MAP_INFO(0xFE, 0x7E),
	EX_PVP_MATCH_RECORD(0xFE, 0x7F),
	EX_PVP_MATCH_USER_DIE(0xFE, 0x80),
	EX_PRIVATE_STORE_WHOLE_MSG(0xFE, 0x81),
	EX_PUT_ENCHANT_TARGET_ITEM_RESULT(0xFE, 0x82),
	EX_PUT_ENCHANT_SUPPORT_ITEM_RESULT(0xFE, 0x83),
	EX_CHANGE_NICKNAME_NCOLOR(0xFE, 0x84),
	EX_GET_BOOK_MARK_INFO(0xFE, 0x85),
	EX_NOTIFY_PREMIUM_ITEM(0xFE, 0x86),
	EX_GET_PREMIUM_ITEM_LIST(0xFE, 0x87),
	EX_PERIODIC_ITEM_LIST(0xFE, 0x88),
	EX_JUMP_TO_LOCATION(0xFE, 0x89),
	EX_PVP_MATCH_CCRECORD(0xFE, 0x8A),
	EX_PVP_MATCH_CCMY_RECORD(0xFE, 0x8B),
	EX_PVP_MATCH_CCRETIRE(0xFE, 0x8C),
	EX_SHOW_TERRITORY(0xFE, 0x8D),
	EX_NPC_QUEST_HTML_MESSAGE(0xFE, 0x8E),
	EX_SEND_UIEVENT(0xFE, 0x8F),
	EX_NOTIFY_BIRTH_DAY(0xFE, 0x90),
	EX_SHOW_DOMINION_REGISTRY(0xFE, 0x91),
	EX_REPLY_REGISTER_DOMINION(0xFE, 0x92),
	EX_REPLY_DOMINION_INFO(0xFE, 0x93),
	EX_SHOW_OWNTHING_POS(0xFE, 0x94),
	EX_CLEFT_LIST(0xFE, 0x95),
	EX_CLEFT_STATE(0xFE, 0x96),
	EX_DOMINION_CHANNEL_SET(0xFE, 0x97),
	EX_BLOCK_UP_SET_LIST(0xFE, 0x98),
	EX_BLOCK_UP_SET_STATE(0xFE, 0x99),
	EX_START_SCENE_PLAYER(0xFE, 0x9A),
	EX_AIR_SHIP_TELEPORT_LIST(0xFE, 0x9B),
	EX_MPCC_ROOM_INFO(0xFE, 0x9C),
	EX_LIST_MPCC_WAITING(0xFE, 0x9D),
	EX_DISSMISS_MPCC_ROOM(0xFE, 0x9E),
	EX_MANAGE_MPCC_ROOM_MEMBER(0xFE, 0x9F),
	EX_MPCC_ROOM_MEMBER(0xFE, 0xA0),
	EX_VITALITY_POINT_INFO(0xFE, 0xA1),
	EX_SHOW_SEED_MAP_INFO(0xFE, 0xA2),
	EX_MPCC_PARTYMASTER_LIST(0xFE, 0xA3),
	EX_DOMINION_WAR_START(0xFE, 0xA4),
	EX_DOMINION_WAR_END(0xFE, 0xA5),
	EX_SHOW_LINES(0xFE, 0xA6),
	EX_PARTY_MEMBER_RENAMED(0xFE, 0xA7),
	EX_ENCHANT_SKILL_RESULT(0xFE, 0xA8),
	EX_REFUND_LIST(0xFE, 0xA9),
	EX_NOTICE_POST_ARRIVED(0xFE, 0xAA),
	EX_SHOW_RECEIVED_POST_LIST(0xFE, 0xAB),
	EX_REPLY_RECEIVED_POST(0xFE, 0xAC),
	EX_SHOW_SENT_POST_LIST(0xFE, 0xAD),
	EX_REPLY_SENT_POST(0xFE, 0xAE),
	EX_RESPONSE_SHOW_STEP_ONE(0xFE, 0xAF),
	EX_RESPONSE_SHOW_STEP_TWO(0xFE, 0xB0),
	EX_RESPONSE_SHOW_CONTENTS(0xFE, 0xB1),
	EX_SHOW_PETITION_HTML(0xFE, 0xB2),
	EX_REPLY_POST_ITEM_LIST(0xFE, 0xB3),
	EX_CHANGE_POST_STATE(0xFE, 0xB4),
	EX_REPLY_WRITE_POST(0xFE, 0xB5),
	EX_INITIALIZE_SEED(0xFE, 0xB6),
	EX_RAID_RESERVE_RESULT(0xFE, 0xB7),
	EX_BUY_SELL_LIST(0xFE, 0xB8),
	EX_CLOSE_RAID_SOCKET(0xFE, 0xB9),
	EX_PRIVATE_MARKET_LIST(0xFE, 0xBA),
	EX_RAID_CHARACTER_SELECTED(0xFE, 0xBB),
	EX_ASK_COUPLE_ACTION(0xFE, 0xBC),
	EX_BR_BROADCAST_EVENT_STATE(0xFE, 0xBD),
	EX_BR_LOAD_EVENT_TOP_RANKERS(0xFE, 0xBE),
	EX_CHANGE_NPC_STATE(0xFE, 0xBF),
	EX_ASK_MODIFY_PARTY_LOOTING(0xFE, 0xC0),
	EX_SET_PARTY_LOOTING(0xFE, 0xC1),
	EX_ROTATION(0xFE, 0xC2),
	EX_CHANGE_CLIENT_EFFECT_INFO(0xFE, 0xC3),
	EX_MEMBERSHIP_INFO(0xFE, 0xC4),
	EX_REPLY_HAND_OVER_PARTY_MASTER(0xFE, 0xC5),
	EX_QUEST_NPC_LOG_LIST(0xFE, 0xC6),
	EX_QUEST_ITEM_LIST(0xFE, 0xC7),
	EX_GM_VIEW_QUEST_ITEM_LIST(0xFE, 0xC8),
	EX_RESTART_RESPONSE(0xFE, 0xC9),
	EX_VOTE_SYSTEM_INFO(0xFE, 0xCA),
	EX_SHUTTLE_INFO(0xFE, 0xCB),
	EX_SUTTLE_GET_ON(0xFE, 0xCC),
	EX_SUTTLE_GET_OFF(0xFE, 0xCD),
	EX_SUTTLE_MOVE(0xFE, 0xCE),
	EX_MOVE_TO_LOCATION_IN_SUTTLE(0xFE, 0xCF),
	EX_STOP_MOVE_IN_SHUTTLE(0xFE, 0xD0),
	EX_VALIDATE_LOCATION_IN_SHUTTLE(0xFE, 0xD1),
	EX_AGIT_AUCTION_CMD(0xFE, 0xD2),
	EX_CONFIRM_ADDING_POST_FRIEND(0xFE, 0xD3),
	EX_RECEIVE_SHOW_POST_FRIEND(0xFE, 0xD4),
	EX_RECEIVE_OLYMPIAD(0xFE, 0xD5),
	EX_BR_GAME_POINT(0xFE, 0xD6),
	EX_BR_PRODUCT_LIST(0xFE, 0xD7),
	EX_BR_PRODUCT_INFO(0xFE, 0xD8),
	EX_BR_BUY_PRODUCT(0xFE, 0xD9),
	EX_BR_PREMIUM_STATE(0xFE, 0xDA),
	EX_BR_EXTRA_USER_INFO(0xFE, 0xDB),
	EX_BR_BUFF_EVENT_STATE(0xFE, 0xDC),
	EX_BR_RECENT_PRODUCT_LIST(0xFE, 0xDD),
	EX_BR_MINIGAME_LOAD_SCORES(0xFE, 0xDE),
	EX_BR_AGATHION_ENERGY_INFO(0xFE, 0xDF),
	EX_SHOW_CHANNELING_EFFECT(0xFE, 0xE0),
	EX_GET_CRYSTALIZING_ESTIMATION(0xFE, 0xE1),
	EX_GET_CRYSTALIZING_FAIL(0xFE, 0xE2),
	EX_NAVIT_ADVENT_POINT_INFO(0xFE, 0xE3),
	EX_NAVIT_ADVENT_EFFECT(0xFE, 0xE4),
	EX_NAVIT_ADVENT_TIME_CHANGE(0xFE, 0xE5),
	EX_ABNORMAL_STATUS_UPDATE_FROM_TARGET(0xFE, 0xE6),
	EX_STOP_SCENE_PLAYER(0xFE, 0xE7),
	EX_FLY_MOVE(0xFE, 0xE8),
	EX_DYNAMIC_QUEST(0xFE, 0xE9),
	EX_SUBJOB_INFO(0xFE, 0xEA),
	EX_CHANGE_MPCOST(0xFE, 0xEB),
	EX_FRIEND_DETAIL_INFO(0xFE, 0xEC),
	EX_BLOCK_ADD_RESULT(0xFE, 0xED),
	EX_BLOCK_REMOVE_RESULT(0xFE, 0xEE),
	EX_BLOCK_DEFAIL_INFO(0xFE, 0xEF),
	EX_LOAD_INZONE_PARTY_HISTORY(0xFE, 0xF0),
	EX_FRIEND_NOTIFY_NAME_CHANGE(0xFE, 0xF1),
	EX_SHOW_COMMISSION(0xFE, 0xF2),
	EX_RESPONSE_COMMISSION_ITEM_LIST(0xFE, 0xF3),
	EX_RESPONSE_COMMISSION_INFO(0xFE, 0xF4),
	EX_RESPONSE_COMMISSION_REGISTER(0xFE, 0xF5),
	EX_RESPONSE_COMMISSION_DELETE(0xFE, 0xF6),
	EX_RESPONSE_COMMISSION_LIST(0xFE, 0xF7),
	EX_RESPONSE_COMMISSION_BUY_INFO(0xFE, 0xF8),
	EX_RESPONSE_COMMISSION_BUY_ITEM(0xFE, 0xF9),
	EX_ACQUIRABLE_SKILL_LIST_BY_CLASS(0xFE, 0xFA),
	EX_MAGIC_ATTACK_INFO(0xFE, 0xFB),
	EX_ACQUIRE_SKILL_INFO(0xFE, 0xFC),
	EX_NEW_SKILL_TO_LEARN_BY_LEVEL_UP(0xFE, 0xFD),
	EX_CALL_TO_CHANGE_CLASS(0xFE, 0xFE),
	EX_CHANGE_TO_AWAKENED_CLASS(0xFE, 0xFF),
	EX_TACTICAL_SIGN(0xFE, 0x100),
	EX_LOAD_STAT_WORLD_RANK(0xFE, 0x101),
	EX_LOAD_STAT_USER(0xFE, 0x102),
	EX_LOAD_STAT_HOT_LINK(0xFE, 0x103),
	EX_GET_WEB_SESSION_ID(0xFE, 0x104),
	EX_2ND_PASSWORD_CHECK(0xFE, 0x105),
	EX_2ND_PASSWORD_VERIFY(0xFE, 0x106),
	EX_2ND_PASSWORD_ACK(0xFE, 0x107),
	EX_FLY_MOVE_BROADCAST(0xFE, 0x108),
	EX_SHOW_USM(0xFE, 0x109),
	EX_SHOW_STAT_PAGE(0xFE, 0x10A),
	EX_IS_CHAR_NAME_CREATABLE(0xFE, 0x10B),
	EX_GOODS_INVENTORY_CHANGED_NOTI(0xFE, 0x10C),
	EX_GOODS_INVENTORY_INFO(0xFE, 0x10D),
	EX_GOODS_INVENTORY_RESULT(0xFE, 0x10E),
	EX_ALTER_SKILL_REQUEST(0xFE, 0x10F),
	EX_NOTIFY_FLY_MOVE_START(0xFE, 0x110),
	EX_DUMMY2(0xFE, 0x111),
	EX_CLOSE_COMMISSION(0xFE, 0x112),
	EX_CHANGE_ATTRIBUTE_ITEM_LIST(0xFE, 0x113),
	EX_CHANGE_ATTRIBUTE_INFO(0xFE, 0x114),
	EX_CHANGE_ATTRIBUTE_OK(0xFE, 0x115),
	EX_CHANGE_ATTRIBUTE_FAIL(0xFE, 0x116),
	EX_LIGHTING_CANDLE_EVENT(0xFE, 0x117),
	EX_VITALITY_EFFECT_INFO(0xFE, 0x118),
	EX_LOGIN_VITALITY_EFFECT_INFO(0xFE, 0x119),
	EX_BR_PRESENT_BUY_PRODUCT(0xFE, 0x11A),
	EX_MENTOR_LIST(0xFE, 0x11B),
	EX_MENTOR_ADD(0xFE, 0x11C),
	LIST_MENTEE_WAITING(0xFE, 0x11D),
	EX_INZONE_WAITING_INFO(0xFE, 0x11E),
	EX_CURIOUS_HOUSE_STATE(0xFE, 0x11F),
	EX_CURIOUS_HOUSE_ENTER(0xFE, 0x120),
	EX_CURIOUS_HOUSE_LEAVE(0xFE, 0x121),
	EX_CURIOUS_HOUSE_MEMBER_LIST(0xFE, 0x122),
	EX_CURIOUS_HOUSE_MEMBER_UPDATE(0xFE, 0x123),
	EX_CURIOUS_HOUSE_REMAIN_TIME(0xFE, 0x124),
	EX_CURIOUS_HOUSE_RESULT(0xFE, 0x125),
	EX_CURIOUS_HOUSE_OBSERVE_LIST(0xFE, 0x126),
	EX_CURIOUS_HOUSE_OBSERVE_MODE(0xFE, 0x127),
	EX_SYSSTRING(0xFE, 0x128),
	EX_CHOOSE_SHAPE_SHIFTING_ITEM(0xFE, 0x129),
	EX_PUT_SHAPE_SHIFTING_TARGET_ITEM_RESULT(0xFE, 0x12A),
	EX_PUT_SHAPE_SHIFTING_EXTRACTION_ITEM_RESULT(0xFE, 0x12B),
	EX_SHAPE_SHIFTING_RESULT(0xFE, 0x12C),
	EX_CASTLE_STATE(0xFE, 0x12D),
	EX_NCGUARD_RECEIVE_DATA_FROM_SERVER(0xFE, 0x12E),
	EX_KALIE_EVENT(0xFE, 0x12F),
	EX_KALIE_EVENT_JACKPOT_USER(0xFE, 0x130),
	EX_ABNORMAL_VISUAL_EFFECT_INFO(0xFE, 0x131),
	EX_NPC_INFO_SPEED(0xFE, 0x132),
	EX_SET_PLEDGE_EMBLEM_ACK(0xFE, 0x133),
	EX_SHOW_BEAUTY_MENU(0xFE, 0x134),
	EX_RESPONSE_BEAUTY_LIST(0xFE, 0x135),
	EX_RESPONSE_BEAUTY_REGIST_RESET(0xFE, 0x136),
	EX_RESPONSE_RESET_LIST(0xFE, 0x137),
	EX_SHUFFLE_SEED_AND_PUBLIC_KEY(0xFE, 0x138),
	EX_CHECK_SPEED_HACK(0xFE, 0x139),
	EX_BR_NEW_ICON_CASH_BTN_WND(0xFE, 0x13A),
	EX_EVENT_CAMPAIGN_INFO(0xFE, 0x13B),
	EX_UN_READ_MAIL_COUNT(0xFE, 0x13C),
	EX_PLEDGE_COUNT(0xFE, 0x13D),
	EX_ADENA_INVEN_COUNT(0xFE, 0x13E),
	EX_PLEDGE_RECRUIT_INFO(0xFE, 0x13F),
	EX_PLEDGE_RECRUIT_APPLY_INFO(0xFE, 0x140),
	EX_PLEDGE_RECRUIT_BOARD_SEARCH(0xFE, 0x141),
	EX_PLEDGE_RECRUIT_BOARD_DETAIL(0xFE, 0x142),
	EX_PLEDGE_WAITING_LIST_APPLIED(0xFE, 0x143),
	EX_PLEDGE_WAITING_LIST(0xFE, 0x144),
	EX_PLEDGE_WAITING_USER(0xFE, 0x145),
	EX_PLEDGE_DRAFT_LIST_SEARCH(0xFE, 0x146),
	EX_PLEDGE_WAITING_LIST_ALARM(0xFE, 0x147),
	EX_VALIDATE_ACTIVE_CHARACTER(0xFE, 0x148),
	EX_CLOSE_COMMISSION_REGISTER(0xFE, 0x149),
	EX_TELEPORT_TO_LOCATION_ACTIVATE(0xFE, 0x14A),
	EX_NOTIFY_WEB_PETITION_REPLY_ALARM(0xFE, 0x14B),
	EX_EVENT_SHOW_XMAS_WISH_CARD(0xFE, 0x14C),
	EX_INVITATION_EVENT_UI_SETTING(0xFE, 0x14D),
	EX_INVITATION_EVENT_INK_ENERGY(0xFE, 0x14E),
	EX_CHECK_ABUSING(0xFE, 0x14F),
	EX_GMVITALITY_EFFECT_INFO(0xFE, 0x150),
	EX_PATH_TO_AWAKENING_ALARM(0xFE, 0x151),
	EX_PUT_ENCHANT_SCROLL_ITEM_RESULT(0xFE, 0x152),
	EX_REMOVE_ENCHANT_SUPPORT_ITEM_RESULT(0xFE, 0x153),
	EX_SHOW_CARD_REWARD_LIST(0xFE, 0x154),
	EX_GM_VIEW_CHARACTER_INFO(0xFE, 0x155),
	EX_USER_INFO_EQUIP_SLOT(0xFE, 0x156),
	EX_USER_INFO_CUBIC(0xFE, 0x157),
	EX_USER_INFO_ABNORMAL_VISUAL_EFFECT(0xFE, 0x158),
	EX_USER_INFO_FISHING(0xFE, 0x159),
	EX_PARTY_SPELLED_INFO_UPDATE(0xFE, 0x15A),
	EX_DIVIDE_ADENA_START(0xFE, 0x15B),
	EX_DIVIDE_ADENA_CANCEL(0xFE, 0x15C),
	EX_DIVIDE_ADENA_DONE(0xFE, 0x15D),
	EX_PET_INFO(0xFE, 0x15E),
	EX_ACQUIRE_AP_SKILL_LIST(0xFE, 0x15F),
	EX_START_LUCKY_GAME(0xFE, 0x160),
	EX_BETTING_LUCKY_GAME_RESULT(0xFE, 0x161),
	EX_TRAINING_ZONE_ADMISSION(0xFE, 0x162),
	EX_TRAINING_ZONE_LEAVING(0xFE, 0x163),
	EX_PERIODIC_HENNA(0xFE, 0x164),
	EX_SHOW_AP_LIST_WND(0xFE, 0x165),
	EX_USER_INFO_INVEN_WEIGHT(0xFE, 0x166),
	EX_CLOSE_AP_LIST_WND(0xFE, 0x167),
	EX_ENCHANT_ONE_OK(0xFE, 0x168),
	EX_ENCHANT_ONE_FAIL(0xFE, 0x169),
	EX_ENCHANT_ONE_REMOVE_OK(0xFE, 0x16A),
	EX_ENCHANT_ONE_REMOVE_FAIL(0xFE, 0x16B),
	EX_ENCHANT_TWO_OK(0xFE, 0x16C),
	EX_ENCHANT_TWO_FAIL(0xFE, 0x16D),
	EX_ENCHANT_TWO_REMOVE_OK(0xFE, 0x16E),
	EX_ENCHANT_TWO_REMOVE_FAIL(0xFE, 0x16F),
	EX_ENCHANT_SUCESS(0xFE, 0x170),
	EX_ENCHANT_FAIL(0xFE, 0x171),
	EX_ENCHANT_RETRY_TO_PUT_ITEM_OK(0xFE, 0x172),
	EX_ENCHANT_RETRY_TO_PUT_ITEM_FAIL(0xFE, 0x173),
	EX_ACCOUNT_ATTENDANCE_INFO(0xFE, 0x174),
	EX_WORLD_CHAT_CNT(0xFE, 0x175),
	EX_ALCHEMY_SKILL_LIST(0xFE, 0x176),
	EX_TRY_MIX_CUBE(0xFE, 0x177),
	EX_ALCHEMY_CONVERSION(0xFE, 0x178),
	EX_BEAUTY_ITEM_LIST(0xFE, 0x179),
	EX_RECEIVE_CLIENT_INI(0xFE, 0x17A),
	EX_AUTO_FISH_AVAILABLE(0xFE, 0x17B),
	EX_CHANNEL_CHAT_ENTER_WORLD(0xFE, 0x17C),
	EX_CHANNEL_CHAT_PLEGE_INFO(0xFE, 0x17D),
	EX_VIP_ATTENDANCE_ITEM_LIST(0xFE, 0x17E),
	EX_CONFIRM_VIP_ATTENDANCE_CHECK(0xFE, 0x17F),
	EX_SHOW_ENSOUL_WINDOW(0xFE, 0x180),
	EX_ENSOUL_RESULT(0xFE, 0x181),
	EX_MULTISELL_RESULT(0xFE, 0x182),
	EX_CASTLE_WAR_SEASON_RESULT(0xFE, 0x183),
	EX_CASTLE_WAR_SEASON_REWARD(0xFE, 0x184),
	RECIVE_VIP_PRODUCT_LIST(0xFE, 0x185),
	RECIVE_VIP_LUCKY_GAME_INFO(0xFE, 0x186),
	RECIVE_VIP_LUCKY_GAME_ITEM_LIST(0xFE, 0x187),
	RECIVE_VIP_LUCKY_GAME_RESULT(0xFE, 0x188),
	RECIVE_VIP_INFO(0xFE, 0x189),
	RECIVE_VIP_INFO_REMAIN_TIME(0xFE, 0x18A),
	RECEIVE_VIP_BOT_CAPTCHA_IMAGE(0xFE, 0x18B),
	RECEIVE_VIP_BOT_CAPTCHA_ANSWER_RESULT(0xFE, 0x18C),
	EX_PLEDGE_SINGIN_FOR_OPEN_JOINING_METHOD(0xFE, 0x18D),
	EX_REQUEST_MATCH_ARENA(0xFE, 0x18E),
	EX_COMPLETE_MATCH_ARENA(0xFE, 0x18F),
	EX_CONFIRM_MATCH_ARENA(0xFE, 0x190),
	EX_CANCEL_MATCH_ARENA(0xFE, 0x191),
	EX_START_CHOOSE_CLASS_ARENA(0xFE, 0x192),
	EX_CHANGE_CLASS_ARENA(0xFE, 0x193),
	EX_CONFIRM_CLASS_ARENA(0xFE, 0x194),
	EX_START_BATTLE_READY_ARENA(0xFE, 0x195),
	EX_BATTLE_READY_ARENA(0xFE, 0x196),
	EX_DECO_NPC_INFO(0xFE, 0x197),
	EX_DECO_NPC_SET(0xFE, 0x198),
	EX_FACTION_INFO(0xFE, 0x199),
	EX_BATTLE_RESULT_ARENA(0xFE, 0x19A),
	EX_CLOSING_ARENA(0xFE, 0x19B),
	EX_CLOSED_ARENA(0xFE, 0x19C),
	EX_DIE_IN_ARENA(0xFE, 0x19D),
	DUMMY_PACKET(0xFE, 0x19E),
	EX_ARENA_DASHBOARD(0xFE, 0x19F),
	EX_ARENA_UPDATE_EQUIP_SLOT(0xFE, 0x1A0),
	EX_ARENA_KILL_INFO(0xFE, 0x1A1),
	EX_EXIT_ARENA(0xFE, 0x1A2),
	EX_BALTHUS_EVENT(0xFE, 0x1A3),
	EX_BALTHUS_EVENT_JACKPOT_USER(0xFE, 0x1A4),
	EX_PARTY_MATCHING_ROOM_HISTORY(0xFE, 0x1A5),
	EX_AI_CONTENT_UI_EVENT(0xFE, 0x1A6),
	EX_ARENA_CUSTOM_NOTIFICATION(0xFE, 0x1A7),
	EX_ONE_DAY_RECEIVE_REWARD_LIST(0xFE, 0x1A8),
	EX_CONNECTED_TIME_AND_GETTABLE_REWARD(0xFE, 0x1A9),
	EX_TODO_LIST_RECOMMAND(0xFE, 0x1AA),
	EX_TODO_LIST_INZONE(0xFE, 0x1AB),
	EX_TODO_LIST_HTML(0xFE, 0x1AC),
	EX_QUEUE_TICKET(0xFE, 0x1AD),
	EX_PLEDGE_BONUS_OPEN(0xFE, 0x1AE),
	EX_PLEDGE_BONUS_LIST(0xFE, 0x1AF),
	EX_PLEDGE_BONUS_MARK_RESET(0xFE, 0x1B0),
	EX_PLEDGE_BONUS_UPDATE(0xFE, 0x1B1),
	EX_SSO_AUTH_TOKEN(0xFE, 0x1B2),
	EX_QUEUE_TICKET_LOGIN(0xFE, 0x1B3),
	EX_ENSOUL_EXTRACTION_SHOW(0xFE, 0x1B4),
	EX_ENSOUL_EXTRACTION_RESULT(0xFE, 0x1B5),
	EX_FIELD_EVENT_STEP(0xFE, 0x1B6),
	EX_FIELD_EVENT_POINT(0xFE, 0x1B7),
	EX_FIELD_EVENT_EFFECT(0xFE, 0x1B8),
	EX_RAID_BOSS_SPAWN_INFO(0xFE, 0x1B9),
	EX_RAID_SERVER_INFO(0xFE, 0x1BA),
	EX_SHOW_AGIT_SIEGE_INFO(0xFE, 0x1BB),
	EX_ITEM_ACTION_STATUS(0xFE, 0x1BC),
	EX_MONSTER_BOOK(0xFE, 0x1BD),
	EX_MONSTER_BOOK_REWARD_ICON(0xFE, 0x1BE),
	EX_MONSTER_BOOK_REWARD_FACTION_UI(0xFE, 0x1BF),
	EX_MONSTER_BOOK_OPEN_RESULT(0xFE, 0x1C0),
	EX_MONSTER_BOOK_CLOSE_FORCE(0xFE, 0x1C1),
	EX_FACTION_LEVEL_UP_NOTIFY(0xFE, 0x1C2),
	EX_ITEM_AUCTION_NEXT_INFO(0xFE, 0x1C3),
	EX_ITEM_AUCTION_UPDATE_BIDDING_INFO(0xFE, 0x1C4),
	EX_PRIVATE_STORE_BUYING_RESULT(0xFE, 0x1C5),
	EX_PRIVATE_STORE_SELLING_RESULT(0xFE, 0x1C6),
	EX_ENTER_WORLD(0xFE, 0x1C7),
	EX_MATCH_GROUP(0xFE, 0x1C8),
	EX_MATCH_GROUP_ASK(0xFE, 0x1C9),
	EX_MATCH_GROUP_WITHDRAW(0xFE, 0x1CA),
	EX_MATCH_GROUP_OUST(0xFE, 0x1CB),
	EX_ARENA_SHOW_ENEMY_PARTY_LOCATION(0xFE, 0x1CC),
	EX_SHOW_UPGRADE_SYSTEM(0xFE, 0x1CD),
	EX_UPGRADE_SYSTEM_RESULT(0xFE, 0x1CE),
	EX_CARD_UPDOWN_GAME_START(0xFE, 0x1CF),
	EX_CARD_UPDOWN_PICK_RESULT(0xFE, 0x1D0),
	EX_CARD_UPDOWN_GAME_PREPARE_REWARD(0xFE, 0x1D1),
	EX_CARD_UPDOWN_GAME_REWARD_REPLY(0xFE, 0x1D2),
	EX_CARD_UPDOWN_GAME_QUIT(0xFE, 0x1D3),
	EX_ARENA_RANK_ALL(0xFE, 0x1D4),
	EX_ARENA_MYRANK(0xFE, 0x1D5),
	EX_PLEDGE_CLASSIC_RAID_INFO(0xFE, 0x1D6),
	EX_ARENA_OBSERVE(0xFE, 0x1D7),
	EX_HTML_WITH_NPC_VIEWPORT(0xFE, 0x1D8),
	EX_PLEDGE_CONTRIBUTION_RANK(0xFE, 0x1D9),
	EX_PLEDGE_CONTRIBUTION_INFO(0xFE, 0x1DA),
	EX_PLEDGE_CONTRIBUTION_REWARD(0xFE, 0x1DB),
	EX_PLEDGE_RAID_INFO(0xFE, 0x1DC),
	EX_PLEDGE_RAID_RANK(0xFE, 0x1DD),
	EX_PLEDGE_LEVEL_UP(0xFE, 0x1DE),
	EX_PLEDGE_SHOW_INFO_UPDATE(0xFE, 0x1DF),
	EX_PLEDGE_MISSION_INFO(0xFE, 0x1E0),
	EX_PLEDGE_MISSION_REWARD_COUNT(0xFE, 0x1E1),
	EX_PLEDGE_MASTERY_INFO(0xFE, 0x1E2),
	EX_PLEDGE_MASTERY_SET(0xFE, 0x1E3),
	EX_PLEDGE_MASTERY_RESET(0xFE, 0x1E4),
	EX_TUTORIAL_SHOW_ID(0xFE, 0x1E5),
	EX_PLEDGE_SKILL_INFO(0xFE, 0x1E6),
	EX_PLEDGE_SKILL_ACTIVATE(0xFE, 0x1E7),
	EX_PLEDGE_ITEM_LIST(0xFE, 0x1E8),
	EX_PLEDGE_ITEM_ACTIVATE(0xFE, 0x1E9),
	EX_PLEDGE_ANNOUNCE(0xFE, 0x1EA),
	EX_PLEDGE_ANNOUNCE_SET(0xFE, 0x1EB),
	EX_SET_PLEDGE_EMBLEM(0xFE, 0x1EC),
	EX_SHOW_CREATE_PLEDGE(0xFE, 0x1ED),
	EX_PLEDGE_ITEM_INFO(0xFE, 0x1EE),
	EX_PLEDGE_ITEM_BUY(0xFE, 0x1EF),
	EX_ELEMENTAL_SPIRIT_INFO(0xFE, 0x1F0),
	EX_ELEMENTAL_SPIRIT_EXTRACT_INFO(0xFE, 0x1F1),
	EX_ELEMENTAL_SPIRIT_EVOLUTION_INFO(0xFE, 0x1F2),
	EX_ELEMENTAL_SPIRIT_EVOLUTION(0xFE, 0x1F3),
	EX_ELEMENTAL_SPIRIT_SET_TALENT(0xFE, 0x1F4),
	EX_ELEMENTAL_SPIRIT_ABSORB_INFO(0xFE, 0x1F5),
	EX_ELEMENTAL_SPIRIT_ABSORB(0xFE, 0x1F6),
	EX_CHOOSE_LOCKED_ITEM(0xFE, 0x1F7),
	EX_LOCKED_RESULT(0xFE, 0x1F8),
	// 152
	EX_ELEMENTAL_SPIRIT_EXTRACT(0xFE, 0x1F9),
	EX_OLYMPIAD_INFO(0xFE, 0x1FA),
	EX_OLYMPIAD_RECORD(0xFE, 0x1FB),
	EX_OLYMPIAD_MATCH_INFO(0xFE, 0x1FC),
	EX_ELEMENTAL_SPIRIT_GET_EXP(0xFE, 0x1FD),
	EX_ITEM_ANNOUNCE(0xFE, 0x1FE),
	EX_DRESS_ROOM_UI_OPEN(0xFE, 0x1FF),
	EX_DRESS_HANGER_LIST(0xFE, 0x200),
	EX_USER_BAN_INFO(0xFE, 0x201),
	EX_TRY_ENCHANT_ARTIFACT_RESULT(0xFE, 0x202),
	EX_XIGN_CODE(0xFE, 0x203),
	// 196
	EX_SHOW_UPGRADE_SYSTEM_NORMAL(0xFE, 0x204),
	EX_UPGRADE_SYSTEM_NORMAL_RESULT(0xFE, 0x205),
	EX_PURCHASE_LIMIT_SHOP_ITEM_L(0xFE, 0x206),
	EX_PURCHASE_LIMIT_SHOP_ITEM_B(0xFE, 0x207),
	EX_BLOODY_COIN_COUNT(0xFE, 0x208),
	EX_CLASS_CHANGE_SET_ALARM(0xFE, 0x209),
	EX_REQUEST_CLASS_CHANGE(0xFE, 0x20A),
	EX_REQUEST_CLASS_CHANGE_VERIFY(0xFE, 0x20B),
	EX_COSTUME_USE_ITEM(0xFE, 0x20C),
	EX_CHOOSE_COSTUME_ITEM(0xFE, 0x20D),
	EX_SEND_COSTUME_LIST(0xFE, 0x20E),
	EX_SEND_COSTUME_LIST_FULL(0xFE, 0x20F),
	EX_COSTUME_COLLECTION_SKILL_A(0xFE, 0x211),
	EX_COSTUME_EVOLUTION(0xFE, 0x212),
	EX_COSTUME_EXTRACT(0xFE, 0x213),
	EX_COSTUME_LOCK(0xFE, 0x214),
	EX_COSTUME_SHORTCUT_LIST(0xFE, 0x215),
	EX_MAGICLAMP_EXP_INFO(0xFE, 0x216),
	EX_MAGICLAMP_GAME_INFO(0xFE, 0x217),
	EX_MAGICLAMP_GAME_RESULT(0xFE, 0x218),
	// 228
	EX_SHOW_TELEPORT_UI(0xFE, 0x219),
	EX_ACTIVATE_AUTO_SHORTCUT(0xFE, 0x0218),
	EX_PREMIUM_MANAGER_SHOW_HTML(0xFE, 0x21B),
	EX_ACTIVATED_CURSED_TREASURE(0xFE, 0x21C),
	EX_PAYBACK_LIST(0xFE, 0x21D),
	EX_PAYBACK_GIVE_REWARD(0xFE, 0x21E),
	// EX_PAYBACK_UI_LAUNCHER(0xFE, 0x21F), TODO: find new op
	EX_DIE_INFO(0xFE, 0x220),
	EX_AUTOPLAY_SETTING(0xFE, 0x21F),
	EX_AUTOPLAY_DO_MACRO(0xFE, 0x220),
	EX_OLYMPIAD_MATCH_MAKING_RESULT(0xFE, 0x223),
	EX_FESTIVAL_BM_INFO(0xFE, 0x224),
	EX_FESTIVAL_BM_ALL_ITEM_INFO(0xFE, 0x225),
	EX_FESTIVAL_BM_TOP_ITEM_INFO(0xFE, 0x226),
	EX_FESTIVAL_BM_GAME(0xFE, 0x227),
	EX_GACHA_SHOP_INFO(0xFE, 0x228),
	// TODO: find new one EX_GACHA_SHOP_GACHA_GROUP(0xFE, 0x229),
	// EX_GACHA_SHOP_GACHA_ITEM(0xFE, 0x22A),
	// Old EX_TIME_RESTRICT_FIELD_LIST(0xFE, 0x22B),
	EX_TIME_RESTRICT_FIELD_LIST(0xFE, 0x229),
	EX_TIME_RESTRICT_FIELD_USER_ENTER(0xFE, 0x22A),
	EX_TIME_RESTRICT_FIELD_USER_CHARGE_RESULT(0xFE, 0x22B),
	EX_TIME_RESTRICT_FIELD_USER_ALARM(0xFE, 0x22C),
	EX_TIME_RESTRICT_FIELD_USER_EXIT(0xFE, 0x22D),
	EX_RANKING_CHAR_INFO(0xFE, 0x22E),
	EX_RANKING_CHAR_HISTORY(0xFE, 0x22F),
	EX_RANKING_CHAR_RANKERS(0xFE, 0x230),
	EX_BOW_ACTION_TO(0xFE, 0x233),
	EX_LETTER_COLLECTOR_UI_LAUNCH(0xFE, 0x234),
	EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_HUD_INFO(0xFE, 0x235),
	EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_INFO(0xFE, 0x236),
	EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_ATTACKER_LIST(0xFE, 0x237),
	EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_DEFENDER_LIST(0xFE, 0x238),
	EX_PLEDGE_MERCENARY_MEMBER_LIST(0xFE, 0x239),
	EX_PVPBOOK_LIST(0xFE, 0x23A),
	EX_PVPBOOK_KILLER_LOCATION(0xFE, 0x23B),
	EX_PVPBOOK_NEW_PK(0xFE, 0x23C),
	EX_PLEDGE_MERCENARY_MEMBER_JOIN(0xFE, 0x23D),
	EX_RAID_DROP_ITEM_ANNOUNCE(0xFE, 0x23E),
	EX_LETTER_COLLECTOR_UI_LAUNCER(0xFE, 0x23F),
	EX_OLYMPIAD_MY_RANKING_INFO(0xFE, 0x240),
	EX_OLYMPIAD_RANKING_INFO(0xFE, 0x241),
	EX_OLYMPIAD_HERO_AND_LEGEND_INFO(0xFE, 0x242),
	EX_RAID_TELEPORT_INFO(0xFE, 0x243),
	EX_CRAFT_INFO(0xFE, 0x244),
	EX_CRAFT_EXTRACT(0xFE, 0x245),
	EX_CRAFT_RANDOM_INFO(0xFE, 0x246),
	EX_CRAFT_RANDOM_LOCK_SLOT(0xFE, 0x247),
	EX_CRAFT_RANDOM_REFRESH(0xFE, 0x248),
	EX_CRAFT_RANDOM_MAKE(0xFE, 0x249),
	EX_ITEM_ANNOUNCE_SETTING(0xFE, 0x24A),
	EX_ANTIBOT(0xFE, 0x24B),
	EX_DPSVR(0xFE, 0x24C),
	EX_SEND_CMD_LIST(0xFE, 0x24D),
	EX_SHANGHAI_HEALTHY_TIPS(0xFE, 0x24E),
	EX_MAX(0xFE, 0x24F);
	
	private final int _id1;
	private final int _id2;
	
	OutgoingPackets(int id1)
	{
		this(id1, -1);
	}
	
	OutgoingPackets(int id1, int id2)
	{
		_id1 = id1;
		_id2 = id2;
	}
	
	public int getId1()
	{
		return _id1;
	}
	
	public int getId2()
	{
		return _id2;
	}
	
	public void writeId(PacketWriter packet)
	{
		packet.writeC(_id1);
		if (_id2 > 0)
		{
			packet.writeH(_id2);
		}
	}
	
	public static OutgoingPackets getPacket(int id1, int id2)
	{
		for (OutgoingPackets packet : values())
		{
			if ((packet.getId1() == id1) && (packet.getId2() == id2))
			{
				return packet;
			}
		}
		return null;
	}
}
