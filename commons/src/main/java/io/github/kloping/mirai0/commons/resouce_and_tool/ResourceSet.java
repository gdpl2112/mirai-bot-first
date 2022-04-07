package io.github.kloping.mirai0.commons.resouce_and_tool;

import io.github.kloping.MySpringTool.exceptions.NoRunException;

import static io.github.kloping.mirai0.commons.resouce_and_tool.ResourceSet.FinalNormalString.NOT_OPEN_STR;

/**
 * @author github-kloping
 */
public final class ResourceSet {
    public static final class FinalString {
        public static final String JUMP_STR_0 = "$";
        public static final String ERR_TIPS = "错误";
        public static final String NOT_FOUND_ABOUT_OBJ = "未找到相关物品";
        public static final String OK_TIPS = "成功";
        public static final String IS_ILLEGAL_TIPS_1 = "存在敏感字节";
        public static final String STR_TOO_MUCH_LEN = "该组字符过长";
        public static final String ADD_TO_AUTO_REPLY_ERROR = "添加失败,可能因为不支持该字符,或已存在";
        public static final String OPEN_STR = "开启";
        public static final String CLOSE_STR = "关闭";
        public static final String SPEAK_STR = "读";
        public static final String SING_STR = "唱";
        public static final String LEFT_BRACKETS_STR = "[";
        public static final String PLAYER_NOT_REGISTERED = "该玩家尚未注册";
        public static final String NOT_FOUND_AT = "未发现at";
        public static final String NOT_FOUND = "未发现";
        public static final String CUSTOM_MENU_STR = "回话菜单";
        public static final String NO_PERMISSION_STR = "无权限";
        public static final String NULL_LOW_STR = "null";
        public static final String VIDEO_TAG_STR = "video";
        public static final String IMG_TAG_STR = "img";
        public static final String NOT_SUPPORT_LENGTH_IMG = "不支持长方形图片";
        public static final String NOT_FOUND_SELECT = "没有该选项";
        public static final String ILLEGAL_OPERATION = "非法的操作";
        public static final String NOT_FOUND_SHOP_ITEM = "未发现此商品";
        public static final String DOWN_SHOP_ITEM_OK = "下架完成!";
        public static final String UP_SHOP_ITEM_OK = "上架成功!!!";
        public static final String SHOP_ITEM_NOT_IS_YOU = "那不是你上架的物品";
        public static final String NOT_ENOUGH_GOLD = "金魂币不足";
        public static final String BUY_SUCCESS = "购买成功";
        public static final String BUY_NUM_NOT_ENOUGH_GOLD_TIPS = "金魂币不足! 需要额外支付 数量x15的 金魂币";
        public static final String TODAY_BUY_UPPER_TIPS = "今日购买此物次数上限";
        public static final String BUY_NUM_TOO_MUCH_TIPS = "过多得购买";
        public static final String NUM_TOO_MUCH = "数量超额";
        public static final String NO_INTRO_NOW = "暂无介绍";
        public static final String SUPERFLUOUS_USE = "多余的使用";
        public static final String NOT_SUPPORTED_NUM_USE = "该物品不支持 批量使用";
        public static final String PLEASE_AWAKENING_WH = "请先觉醒武魂";
        public static final String AWAKENED_WH = "你已经觉醒武魂了";
        public static final String LEVEL2_AWAKENING_WH_TIPS = "2级即可觉醒";
        public static final String AWAKENING_WH_SUCCEED = "觉醒成功!!!";
        public static final String NOT_IN_SELECT = "没有选择状态";
        public static final String IT_NOT_IN_SELECT = "ta没有选择状态";
        public static final String IN_SELECT = "你正在选择状态中...";
        public static final String HJ_NOT_ENOUGH = "精神力不足!!!";
        public static final String CANT_HELP_YOURSELF = "不能帮助自己";
        public static final String DAY_ONLY_HELP_TIPS = "一天仅可支援3次";
        public static final String HELP_SUCCEED = "支援成功";
        public static final String NOT_NEED_WAIT_TIPS = "已就绪";
        public static final String THIS_SKILL_CANT_USE = "该魂技处于不可用状态";
        public static final String DONT_HAVE_SKILL = "你没有这个魂技";
        public static final String HJ_OVER_80_TIPS = "精神力高于80%,额外抵挡10%的伤害";
        public static final String HJ_LOW_40_TIPS = "精神力低于40%,额外受到10%的伤害";
        public static final String SPLIT_LINE_0 = "============";
        public static final String NEWLINE = "\n";
        public static final String ATTACKER_IN_VERTIGO = "攻击者处于眩晕状态";
        public static final String OVER_TIME_OR_DONT = "对战已超时或无效";
        public static final String YOU_HELPING = "你正在帮帮忙中...";
        public static final String YOU_REQUEST_HELPING = "正在请求支援中....";
        public static final String REQUEST_HELP_SUCCEED = "请求支援成功\n\t#其他玩家使用=>\"支援@\"来支援ta)";
        public static final String HELPED = "已经被支援";
        public static final String NOT_NEED_HELP = "ta不需要支援";
        public static final String LIST_STR = "活动列表";
        public static final String TRY_MUTE = "活动列表";
        public static final String NOT_MANAGER = "权限不足#不是管理";
        public static final String PERMISSION_DENIED = "权限不足";
        public static final String HTTPS_PRE = "https:";
        public static final String TRANSFER_TOO_MUCH = "转让物品一次不要超过20个";
        public static final String SLE_TOO_MUCH = "出售物品一次不要超过20个";

        public static final String MONTH = "月";
        public static final String DAY = "天";
        public static final String HOUR = "时";
        public static final String MINUTE = "分";
        public static final String SECONDS = "秒";

        public static final String NOT_FOUND_TIME_UNIT = "没有单位(秒,分,时...)";

        public static final String SECONDS_TOO_MUCH = "超过60秒,请使用分钟";
        public static final String MINUTE_TOO_MUCH = "超过60分,请使用小时";
        public static final String HOUR_TOO_MUCH = "超过24小时,请使用天";
        public static final String DAY_TOO_MUCH = "超过30天,请使用月";
        public static final String MONTH_TOO_MUCH = "最大1个月";

        public static final String RECALL_SUCCEED = "撤回成功";
        public static final String RECALL_FAIL = "撤回失败";

        public static final String TRY_UNMUTE = "尝试解除禁言";

        public static final String JOIN_AC3_EVENT0 = "遇到冰火两仪眼的温泉,恢复了3%的血量";
        public static final String JOIN_AC3_EVENT1 = "吸收了落日散发的能量,恢复了4%的魂力";
        public static final String JOIN_AC3_EVENT2 = "得到森林中古老植物的祝福,恢复了5%的精神力";

        public static final String DISPLAY_IMAGES = "相似图片";
        public static final String IMAGE_SOURCE = "图片来源";
        public static final String THIS_STR = "this";
        public static final String WAITING_STR = "等待中...";
        public static final String PARTICIPATION_STR = "参与";
        public static final String NOT_PARTICIPATION_STR = "未参与";

        public static final String TASK_OVER_TIME = "任务过期,未完成";
        public static final String MAX_EARNINGS_TIPS = "每周最大收益";
        public static final String WORK_LONG_STR = "打工";
        public static final String PLEASE_NOT_REPEAT = "请不要重复";
        public static final String CREATE_CHALLENGE_OK = "创建完成,其他玩家 挑战@ 即可";
        public static final String JOIN_CHALLENGE_OK = "挑战即将开始\n";
        public static final String CHALLENGE_ING = "挑战中...";
        public static final String CHALLENGE_USED = "挑战额外已使用";
    }

    public static final class FinalNormalString {
        public static final String ALL_STR = "全部";
        public static final String NOT_OPEN_STR = "未开启";
        public static final String NOT_SELECT_STR = "未选择";
        public static final String VERTIGO_ING = "眩晕中..";
        public static final String ATTACK_BREAK = "攻击被打断";
        public static final String BG_TIPS = "闭关中..";
        public static final String PLAYER_BG_TIPS = "玩家正在闭关中...";
        public static final String FUNCTION_CLOSEING_TIPS = "功能暂时关闭";
        public static final String GET_FAILED = "获取失败";
    }

    public static final class FinalFormat {
        public static final String CE_CA = "%s-%s\n%s/%s";
        public static final String TIPS_BUY_SUCCEED = "%s\n购买成功";
        public static final String WORK_WAIT_TIPS = "打工冷却中.\n大约等待%s";
        public static final String USE_OBJ_WAIT_TIPS = "使用物品冷却中.\n大约等待%s";
        public static final String BUY_OBJ_WAIT_TIPS = "购买物品冷却中.\n大约等待%s";
        public static final String XL_WAIT_TIPS = "修炼冷却中.\n大约等待%s";
        public static final String TXL_WAIT_TIPS = "双修冷却中.\n大约等待%s";
        public static final String BG_WAIT_TIPS = "闭关冷却中.\n大约等待%s";
        public static final String ACTIVITY_WAIT_TIPS = "活动进入冷却中.\n大约等待%s";
        public static final String USE_SKILL_WAIT_TIPS = "魂技冷却中.\n大约等待%s";
        public static final String SKILL_INFO_WAIT_TIPS = "魂技信息修改冷却中.\n大约等待%s";
        public static final String HJ_NOT_ENOUGH_TIPS0 = "精神力不足%s%%";
        public static final String ATTACK_TIPS0 = "您对ta造成%s点伤害";
        public static final String ONE_DAY_ONLY_HELP = "一天仅能请求支援%s次";
        public static final String NOT_FOUND_SEE = "没有找到\"%s\"见\"%s\"";
        public static final String CANT_BIGGER = "不可大于%s";
        public static final String TRY_MUTE_SECONDS = "尝试禁言ta %s 秒";
        public static final String ADD_HP_TIPS = "恢复了%s点的血量";
        public static final String ADD_HL_TIPS = "恢复了%s点的魂力";
        public static final String ADD_HJ_TIPS = "恢复了%s点的精神力";
        public static final String HL_NOT_ENOUGH_TIPS = "魂力不足:您当前的魂力值=>%s%%";
        public static final String AT_FORMAT = "[@%s]";
        public static final String EARNINGS_TIPS_FORMAT = "该周收益\n收益:%s\n损失:%s";

    }

    public static final class FinalValue {
        public static final NoRunException NOT_OPEN_NO_RUN_EXCEPTION = new NoRunException(NOT_OPEN_STR);
        /**
         * 精神力抵消后 剩余倍数 <br/>
         * {@link Project.services.detailServices.GameDetailService#onSpiritAttack}
         */
        public static final int HJ_LOSE_1_X = 9;
        /**
         * 最大精神力消耗血量百分比
         */
        public static final int MAX_SA_LOSE_HJ_B = 75;
        /**
         * 最大精神力抵消百分比
         */
        public static final int MAX_SA_LOSE_HP_B = 45;
        /**
         * 最大批量抢劫次数
         */
        public static final int MAX_ROBBERY_TIMES = 12;
        /**
         * 转让最大数量
         */
        public static final int TRANSFER_ONE_MAX = 20;
        /**
         * 一次出售数量
         */
        public static final int SLE_ONE_MAX = 20;
        /**
         * 每周最大收益
         */
        public static final int MAX_EARNINGS = 90000;
        /**
         * 攻击冷却
         */
        public static final int ATT_CD = 30 * 1000;
        /**
         * 攻击前摇
         */
        public static final int ATT_PRE_CD = 4500;
        /**
         * 猜拳赢的几率
         */
        public static final int MORA_WIN = 47;
        /**
         * 猜拳平局几率
         */
        public static final int MORA_P = 4;
        /**
         * 闭关冷却
         */
        public static final long BG_CD = 1000 * 60 * 60L;
    }
}
