/*
 * @(#)DproCommonConsts.java
 *
 * Copyright(c) 2013 NTTDATA Corporation
 *
 * This software is the confidential and proprietary information
 * of NTTData. ("Confidential Information").
 */
package com.avicit.framework.util;

/**
 * [機 能]：共通用定数クラス<br>
 * [説 明]：共通用定数クラス
 *
 * @version $Revision$
 * @author 2013/12/27 自動生成
 */
public class DproCommonConsts {

    /** 全角スペース "　" */
    public static final String ZENKAKU_SPACE = "　";

    /** エンターキー "\r\n" */
    public static final String SMTP_END_SRC = "\r\n";

    /** フォーワード:SUCCESS */
    public static final String FORWARD_SUCCESS = "success";

    /** フォーワード:FAILURE */
    public static final String FORWARD_FAILURE = "failure";

    /** フォーワード:SUCCESS_01 */
    public static final String FORWARD_SUCCESS_01 = "success_01";

    /** フォーワード:SUCCESS_02 */
    public static final String FORWARD_SUCCESS_02 = "success_02";

    /** フォーワード:SUCCESS_03 */
    public static final String FORWARD_SUCCESS_03 = "success_03";

    /** フォーワード:SUCCESS_04 */
    public static final String FORWARD_SUCCESS_04 = "success_04";

    /** フォーワード:SUCCESS_05 */
    public static final String FORWARD_SUCCESS_05 = "success_05";

    /** フォーワード:SUCCESS_06 */
    public static final String FORWARD_SUCCESS_06 = "success_06";

    /** フォーワード:SUCCESS_07 */
    public static final String FORWARD_SUCCESS_07 = "success_07";

    /** フォーワード:SUCCESS_08 */
    public static final String FORWARD_SUCCESS_08 = "success_08";

    /** 有効/無効フラグ：有効 */
    public static final String VALID_FLAG_VALID = "0";

    /** 有効/無効フラグ：無効 */
    public static final String VALID_FLAG_INVALID = "1";

    /** 検索件数が上限を超えるか：NO */
    public static final String OVER_MAXCOUNT_NO = "0";

    /** 検索件数が上限を超えるか：YES */
    public static final String OVER_MAXCOUNT_YES = "1";

    /** エリア表示フラグ：非表示 */
    public static final String DISP_AREA_FLAG_NO = "0";

    /** エリア表示フラグ：表示 */
    public static final String DISP_AREA_FLAG_YES = "1";

    /** 検索が一回でも実行されたかを示すフラグ:NO */
    public static final String SEARCH_EXECUTE_FLAG_NO = "0";

    /** 検索が一回でも実行されたかを示すフラグ:YES */
    public static final String SEARCH_EXECUTE_FLAG_YES = "1";

    /** ログインIDを記憶するフラグ：記憶 */
    public static final String SAVE_ID_FLAG_YES = "1";

    /** ログインIDを記憶するフラグ：記憶しない */
    public static final String SAVE_ID_FLAG_NO = "0";

    /** 選択ボタンフラグ ： 非表示 */
    public static final String SNTK_BTN_FLAG_NO = "0";

    /** 選択ボタンフラグ ： 表示 */
    public static final String SNTK_BTN_FLAG_YES = "1";

    /** TRメール送付フラグ : 0：TRメールを送付しない */
    public static final String TR_MAILSEND_FLG_NO = "0";

    /** TRメール送付フラグ : 1：TRメールを送付する */
    public static final String TR_MAILSEND_FLG_YES = "1";

    /** タスク完了フラグ:1 */
    public static final String TSK_CPL_FLG_1 = "1";

    /** タスク完了フラグ:0 */
    public static final String TSK_CPL_FLG_0 = "0";

    /** 編集モードフラグ : (0：表示モード) */
    public static final String EDITMODE_FLG_HJMODE = "0";

    /** 編集モードフラグ : (1：表示モード) */
    public static final String EDITMODE_FLG_HJMODE_01 = "1";

    /** マスタ管理権限_ライセンスフラグ ：権限あり */
    public static final String MST_RISNS_FLG_YES = "1";

    /** マスタ管理権限_商品フラグ ：権限あり */
    public static final String MST_SHN_FLG_YES = "1";

    /** マスタ管理権限_資料フラグ ：権限あり */
    public static final String MST_SIRYO_FLG_YES = "1";

    /** マスタ管理権限_運用フラグ ：権限あり */
    public static final String MST_UNYO_FLG_YES = "1";

    /** 顧客共有フラグ ：(1：共有) */
    public static final String KKYKSHA_FLG_KT = "1";

    /** タスク表示フラグ ：(0：非表示) */
    public static final String TSK_DISP_FLG_NO = "0";

    /** 日程変更有無フラグ ：変更なし */
    public static final String NTEY_HNKU_UM_NO = "0";

    /** 日程変更有無フラグ ：変更あり */
    public static final String NTEY_HNKU_UM_YES = "1";

    /** ユーザフラグ ：0：個人 */
    public static final String USER_FLAG_ZERO = "0";

    /** ユーザフラグ ：１：顧客 */
    public static final String USER_FLAG_ONE = "1";

    /** マスター報酬フラグ ：0 */
    public static final String MST_HOSYU_FLAG_ZERO = "0";

    /** マスター報酬フラグ ：1 */
    public static final String MST_HOSYU_FLAG_ONE = "1";

    /** アンケート有フラグ：「1：あり」 */
    public static final String ANKT_YU_FLG_01 = "1";

    /** アンケート有フラグ：「0：なし」 */
    public static final String ANKT_NS_FLG_00 = "0";

    /** アンケート更新済フラグ：「1：更新済」 */
    public static final String ANKT_KSZM_FLG_01 = "1";

    /** アンケート更新済フラグ：「0：未更新」 */
    public static final String ANKT_MKSN_FLG_00 = "0";

    /** アンケート種類コード：「40：複数」 */
    public static final String ENQUETE_SHORUICD_40 = "40";

    /** 画面表示フラグ：「0：登録」 */
    public static final String GMN_HJ_FLG_TRK = "0";

    /** 画面表示フラグ：「1：更新」 */
    public static final String GMN_HJ_FLG_KSN = "1";

    /** 画面表示フラグ：「0：非表示」 */
    public static final String GMN_HJ_FLG_NO = "0";

    /** 画面表示フラグ：「1：表示」 */
    public static final String GMN_HJ_FLG_SHOW = "1";

    /** タブフラグ : [3：発送] */
    public static final String TAB_FLG_HSSU = "3";

    /** タブフラグ : [4：回収] */
    public static final String TAB_FLG_KISYU = "4";

    /** 添付ファイル履歴作成フラグ : [0：作成不要] */
    public static final String SKS_FLG_SKSHUYO = "0";

    /** 添付ファイル履歴作成フラグ : [1：作成要] */
    public static final String SKS_FLG_SKSYO = "1";

    /** 廃止フラグ : 「1：廃止なし」 */
    public static final String HAIS_FLG_NS = "1";

    /** 廃止フラグ : 「0：廃止」 */
    public static final String HAIS_FLG_HS = "0";

    /** 個人情報フラグ：個人情報 */
    public static final String PRIVATE_INFO_FLAG_YES = "1";

    /** 個人情報フラグ：個人情報以外 */
    public static final String PRIVATE_INFO_FLAG_NO = "0";

    /** 押え行チェックボクス表示フラグ：「１：表示」 */
    public static final String CBX_HYOJI_FLAG_ONE = "1";

    /** 押え行チェックボクス表示フラグ：「0：非表示」 */
    public static final String CBX_HYOJI_FLAG_ZERO = "0";

    /** 警告表示済フラグ:1 */
    public static final String KKK_HYJ_FLG = "1";

    /** 押えキャンセル : 「1：チェック済」 */
    public static final String OSA_CAN_CHECK_ZM = "1";

    /** 遷移元画面区分： 2：押え変更依頼 */
    public static final String SNIM_GMN_KBN_OSUE_HENKO_YRAY = "2";

    /** 処理区分 2：受付 */
    public static final String SHO_RI_KBN_UKNI = "2";

    /** 処理区分 3：受付 */
    public static final String SHO_RI_KBN_UKSAN = "3";

    /** 処理区分「4：変更依頼受付」 */
    public static final String SHO_RI_KBN_ENKO_YIRAYI = "4";

    /** ステータス 「1：チェック済」 */
    public static final String STATUS_CHECK_ZM = "1";

    /** 本承認日時設定フラグ 「1：要設定」 */
    public static final String HNN_SHNN_NCHJ_SET_FLG_SET = "1";

    /** 本承認日時設定フラグ 「0：設定不要」 */
    public static final String HNN_SHNN_NCHJ_SET_FLG_SET_FYO = "0";

    /** サブTRフラグ 「1：チェック済」 */
    public static final String SUB_TR_FLG_CHECK_ZM = "1";

    /** 3.5H以下フラグ 「1：チェック済」 */
    public static final String SJK_FLG_CKECK_ZM = "1";

    /** 稼動統合フラグ 「1：チェック済」 */
    public static final String KD_TOUGO_FLAG_CHECK_ZM = "1";

    /** サイズ : 「0：警告メッセージ情報なし」 */
    public static final String SIZE_NASHI = "0";

    /** コメント表示フラグ : 「1：表示」 */
    public static final String COMMENT_SHOW_FLG_HYUJI = "1";

    /** コメント表示フラグ : 「0：非表示」 */
    public static final String COMMENT_SHOW_FLG_HIHYUJI = "0";

    /** 陳 リンク先即時遷移区分：「1：URL以外」 */
    public static final String FROMKUBUN_URLIG = "1";

    /** 陳 遷移先区分：「1：グロナビ以外」 */
    public static final String FROMKUBUN_GRNBIG = "1";

    /** 陳 研修納品フラグ：「0：未選択」 */
    public static final String KENSHUNH_STN = "0";

    /** 陳 研修納品フラグ：「1：選択」 */
    public static final String KENSHUNH_ST = "1";

    /** 陳 公開・開発トライアルフラグ：「0：未選択」 */
    public static final String KKKHTSTRIAR_STN = "0";

    /** 陳 公開・開発トライアルフラグ：「1：選択」 */
    public static final String KKKHTSTRIAR_ST = "1";

    /** 陳 研修終了前フラグ：「0：未選択」 */
    public static final String KENSHU_BE_STN = "0";

    /** 陳 研修終了前フラグ：「1：選択」 */
    public static final String KENSHU_BE_ST = "1";

    /** 陳 集計待ちフラグ：「0：未選択」 */
    public static final String SHUKE_MTI_STN = "0";

    /** 陳 集計待ちフラグ：「1：選択」 */
    public static final String SHUKE_MTI_ST = "1";

    /** 陳 集計完了フラグ：「0：未選択」 */
    public static final String SHUKE_KRY_STN = "0";

    /** 陳 集計完了フラグ：「1：選択」 */
    public static final String SHUKE_KRY_ST = "1";

    /** 陳 到着待ちフラグ：「0：未選択」 */
    public static final String SET_TOTK_MT_STN = "0";

    /** 陳 到着待ちフラグ：「1：選択」 */
    public static final String SET_TOTK_MT_ST = "1";

    /** 陳 到着フラグ：「0：未選択」 */
    public static final String SET_TOTK_STN = "0";

    /** 陳 到着フラグ：「1：選択」 */
    public static final String SET_TOT_ST = "1";

    /** 陳 パンチ処理済：「0：未選択」 */
    public static final String PNT_SYR_STN = "0";

    /** 陳 パンチ処理済：「1：選択」 */
    public static final String PNT_SYR_ST = "1";

    /** 陳 1週間以上：「0：未選択」 */
    public static final String ISYUK_IJ_STN = "0";

    /** 陳 1週間以上：「1：選択」 */
    public static final String ISYUK_IJ_ST = "1";

    /** 陳 完了含む：「0：未選択」 */
    public static final String KRYO_HKM_STN = "0";

    /** 陳 完了含む：「1：選択」 */
    public static final String KRYO_HKM_ST = "1";

    /** 陳 完了含む：「0：未選択」 */
    public static final String SHOUSAI_FLG_STN = "0";

    /** 陳 完了含む：「1：選択」 */
    public static final String SHOUSAI_FLG_ST = "1";

    /** 個別アンケート存在フラグ: 「１：存在」 */
    public static final String KOBETU_AKT_SNZAI_FLG_1 = "1";

    /** 個別アンケート存在フラグ: 「0：存在なし」 */
    public static final String KOBETU_AKT_SNZAI_FLG_0 = "0";

    /** 陳 選択：「0：未選択」 */
    public static final String SENTK_STN = "0";

    /** 陳 選択：「1：選択」 */
    public static final String SENTK_ST = "1";

    /** 支払情報反映フラグ：「0：支払データ未作成(作成対象)」 */
    public static final String SHI_JHH_NE_FLG_MI = "0";

    /** 処理区分 1：受付 */
    public static final String SHO_RI_KBN_UKYICH = "1";

    /** 陳 一覧エリア表示フラグ：「0：非表示」 */
    public static final String SET_ITRAN_HI_FLGN = "0";

    /** 陳 一覧エリア表示フラグ：「1：表示」 */
    public static final String SET_ITRAN_HI_FLG = "1";

    /** 陳 全選択活性フラグ：「0：非表示」 */
    public static final String ZRNSTK_KTS_FLPN = "0";

    /** 陳 全選択活性フラグ：「1：表示」 */
    public static final String ZRNSTK_KTS_FLP = "1";

    /** 陳 アンケートコピーボタン表示フラグ：「0：非表示」 */
    public static final String ATK_KP_HI_FLGN = "0";

    /** 陳 アンケートコピーボタン表示フラグ：「1：表示」 */
    public static final String ATK_KP_HI_FLG = "1";

    /** 陳 アンケートコピーボタン活性フラグ：「0：非表示」 */
    public static final String ATK_KP_KTS_FLGN = "0";

    /** 陳 アンケートコピーボタン活性フラグ：「1：表示」 */
    public static final String ATK_KP_KTS_FLG = "1";

    /** 陳 一括集計ボタン表示ラグ：「0：非表示」 */
    public static final String IKT_SK_HJ_FLGN = "0";

    /** 陳 一括集計ボタン表示フラグ：「1：表示」 */
    public static final String IKT_SK_HJ_FLG = "1";

    /** 陳 一括集計ボタン活性ラグ：「0：非表示」 */
    public static final String IKT_SK_KTS_FLGN = "0";

    /** 陳 一括集計ボタン活性フラグ：「1：表示」 */
    public static final String IKT_SK_KTS_FLG = "1";

    /** 陳 一括集計ボタン活性ラグ：「0：非表示」 */
    public static final String SK_NYSU_KTS_FLGN = "0";

    /** 陳 一括集計ボタン活性フラグ：「1：表示」 */
    public static final String SK_NYSU_KTS_FLG = "1";

    /** 陳 処理区分：「0：処理しない」 */
    public static final String SLKUBUN_FLGN = "0";

    /** 陳 処理区分：「1：処理」 */
    public static final String SLKUBUN_FLG = "1";

    /** 画面 表示行数「50」 */
    public static final String MAX_ROW_COUNT = "50";

    /** 画面 表示行数「100」 */
    public static final String MAX_ROW_CNT = "100";

    /** 汎用キー１:拠点取引状況区分 */
    public static final String CK_1_SUB_BASE_TRADE = "CK0001";

    /** 汎用キー１:納品スタッフ */
    public static final String CK_1_DELIVERY_STAFF = "CK0002";

    /** 汎用キー３:デフォルト */
    public static final String CK_3_DEFAULT = "----------";

    /** メッセージ種別「messages」 */
    public static final String MESSAGE_TYPE = "messages";

    /** ファイル・セパレーター（Window「\」Unix「/」） */
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    /** ページング：デフォルト開始index */
    public static final String DEFAULT_START_INDEX = "0";

    /** ページング：デフォルトデータ総行数 */
    public static final String DEFAULT_TOTAL_COUNT_INDEX = "0";

    /** ソートキー:1 */
    public static final String SORT_KEY_1 = "1";

    /** ソートキー:2 */
    public static final String SORT_KEY_2 = "2";

    /** ソートキー:3 */
    public static final String SORT_KEY_3 = "3";

    /** ソートキー:4 */
    public static final String SORT_KEY_4 = "4";

    /** ソートキー:5 */
    public static final String SORT_KEY_5 = "5";

    /** ソートキー:6 */
    public static final String SORT_KEY_6 = "6";

    /** ソートキー:7 */
    public static final String SORT_KEY_7 = "7";

    /** ソートキー:8 */
    public static final String SORT_KEY_8 = "8";

    /** ソートキー:9 */
    public static final String SORT_KEY_9 = "9";

    /** ソートキー:10 */
    public static final String SORT_KEY_10 = "10";

    /** ソートキー:11 */
    public static final String SORT_KEY_11 = "11";

    /** ソートキー:12 */
    public static final String SORT_KEY_12 = "12";

    /** ソートキー:13 */
    public static final String SORT_KEY_13 = "13";

    /** ソートキー:14 */
    public static final String SORT_KEY_14 = "14";

    /** ソートキー:15 */
    public static final String SORT_KEY_15 = "15";

    /** ソートキー:16 */
    public static final String SORT_KEY_16 = "16";

    /** ソートキー:17 */
    public static final String SORT_KEY_17 = "17";

    /** ソートキー:18 */
    public static final String SORT_KEY_18 = "18";

    /** dpro-fileプロパティに定義されたファイルパスのキー */
    public static final String KEY_FILE_PATH = "file.path.";

    /** dpro-fileプロパティに定義されたファイルネームのキー */
    public static final String KEY_FILE_NAME = "file.name.";

    /** dpro-fileプロパティに定義されたファイルネーム(プリフィックス)のキー */
    public static final String KEY_FILE_NAME_PREFIX = "file.name.prefix.";

    /** dpro-fileプロパティに定義されたファイルネーム(サフィックス)のキー */
    public static final String KEY_FILE_NAME_SUFFIX = "file.name.suffix.";

    /** 区分：(10：研修納品) */
    public static final String STR_KBN_JYUU = "10";

    /** 区分：(20：資料納品) */
    public static final String STR_KBN_NIJYUU = "20";

    /** 区分：(30：公開・開発トライアル) */
    public static final String STR_KBN_SANNJYUU = "30";

    /** 区分：(40：研修なしＴＲ押え・その他) */
    public static final String STR_KBN_YONNJYUU = "40";

    /** 基本情報ステータス(「10：起票済」) */
    public static final String STR_KIHJYHO_STS_JYUU = "10";

    /** 基本情報ステータス(「20：進行中」) */
    public static final String STR_KIHJYHO_STS_NIJYUU = "20";

    /** 遷移元画面区分  = 「1：TR日単位検索」 */
    public static final String TR_TY_KENSAKU = "1";

    /** 遷移元画面区分  = 「2：TR時間単位検索」 */
    public static final String TR_JKTY_KENSAKU = "2";

    /** 遷移元画面区分  = 「3：日程一覧」 */
    public static final String SCHEDULE_YTRAN = "3";

    /** 遷移元画面区分  = 「4：TR押え一覧」 */
    public static final String TR_OSE_YTRAN = "4";

    /** 遷移元画面区分  = 「5：変更依頼」 */
    public static final String HENKO_IR = "5";

    /** 遷移元画面区分  = 「6：TR押え」 */
    public static final String TR_OSE = "6";

    /** 遷移元画面区分  = 「5：データ管理画面の「伝票No」リンク」 */
    public static final String L_DATA_DENNO = "5";

    /** 遷移元画面区分  = 「7：サーベイ事前伝票（401）」 */
    public static final String L_SBDEN = "7";

    /** 遷移元画面区分  = 「8：サーベイ事前伝票以外（401） */
    public static final String L_SBDENIG = "8";

    /** 遷移元画面区分：(2：B202_画面定義書_【基本情報詳細【社内】) */
    public static final String STR_GMNSNKBN_TWO = "2";

    /** 遷移元画面区分  = 「2：L101_画面定義書_【標準資料検索】 */
    public static final String STR_HKNKSK_TWO = "2";

    /** 遷移元画面区分＝「1：基本情報詳細」 */
    public static final String KIBRN_JOUHUO_KS_1 = "1";

    /** 遷移元画面区分：(1：C604_お知らせ一覧【社内・TR】画面) */
    public static final String STR_GMNSNKBN_ONE = "1";

    /** 遷移元画面区分：(2：お知らせメール画面) */
    public static final String STR_FROMKUBUN_TWO = "2";

    /** 遷移元画面区分：(3：基本情報詳細画面) */
    public static final String STR_GMNSNKBN_THREE = "3";

    /** 遷移元画面区分：(10：基本情報詳細画面) */
    public static final String STR_GMNSNKBN_TEN = "10";

    /** 遷移元画面区分：(1：初期表示) */
    public static final String SNIM_GMNKBN_SK = "1";

    /** 遷移元画面区分：(2：変更戻る) */
    public static final String SNIM_GMNKBN_HNK = "2";

    /** 遷移元画面区分：(1：本押え追加・変更) */
    public static final String BEN_TROSE_ONE = "1";

    /** 遷移元画面区分：(2：仮押え期限切れ（提携向け)) */
    public static final String KS_TWO = "2";

    /** 遷移元画面区分：(3：TR押え画面) */
    public static final String TROSE_HM_THREE = "3";

    /** 遷移元画面区分：(4：TR変更依頼画面申請時) */
    public static final String TR_BGSQS_FOUR = "4";

    /** 遷移元画面区分：(5：TR変更依頼画面受付時) */
    public static final String TR_BGSFS_FIVE = "5";

    /** ステータス区分：(1) */
    public static final String STTS_KBN_1 = "1";

    /** ステータス区分：(2) */
    public static final String STTS_KBN_2 = "2";

    /** ステータス区分：(3) */
    public static final String STTS_KBN_3 = "3";

    /** ステータス区分：(4) */
    public static final String STTS_KBN_4 = "4";

    /** ステータス区分名称：(β版) */
    public static final String STTS_KBN_NAME1 = "β版";

    /** ステータス区分名称：(4) */
    public static final String STTS_KBN_NAME2 = "廃版";

    /** ステータス区分名称：(4) */
    public static final String STTS_KBN_NAME3 = "現行版";

    /** ステータス区分名称：(4) */
    public static final String STTS_KBN_NAME4 = "旧版";

    /** 出庫有効区分：(0) */
    public static final String SK_KBN_0 = "0";

    /** 出庫有効区分：(2) */
    public static final String SK_KBN_2 = "2";

    /** 出庫有効区分名称：(出庫可) */
    public static final String SK_KBN_NAME0 = "出庫可";

    /** 出庫有効区分名称：(出庫不可) */
    public static final String SK_KBN_NAME2 = "出庫不可";

    /** 資料発送手配区分：(1：YSD) */
    public static final String SIRYOHSTH_KBN_YSD = "1";

    /** 資料発送手配区分：(2：FCJ) */
    public static final String SIRYOHSTH_KBN_FCJ = "2";

    /** 画面初期表示区分：「１：基本情報のみ表示」 */
    public static final String GM_INIT_HYOJI_KBN_ONE = "1";

    /** 画面初期表示区分：「２：移動可能な押えを表示　」 */
    public static final String GM_INIT_HYOJI_KBN_TWO = "2";

    /** 画面初期表示区分：「３：全ての押えを表示」 */
    public static final String GM_INIT_HYOJI_KBN_THREE = "3";

    /** STRING:0 */
    public static final String STR_ZERO = "0";

    /** STRING:1 */
    public static final String STR_ICHI = "1";

    /** STRING:2 */
    public static final String STR_TWO = "2";

    /** STRING:3 */
    public static final String STR_THREE = "3";

    /** STRING:4 */
    public static final String STR_FOUR = "4";

    /** STRING:5 */
    public static final String STR_FIVE = "5";

    /** STRING:6 */
    public static final String STR_SIX = "6";

    /** STRING:18 */
    public static final String STR_JYUUHACHI = "18";

    /** STRING:09 */
    public static final String STR_ZEROKYUU = "09";

    /** STRING:00 */
    public static final String STR_ZEROZERO = "00";

    /** STRING:空欄 */
    public static final String STR_EMPTY = "";

    /** STRING:半角スペース */
    public static final String STR_HANKAKU_SPACE = " ";

    /** STRING:全角スペース */
    public static final String STR_ZENNKAKU_SPACE = "　";

    /** 日状態区分 : 空欄 */
    public static final String DAY_STATUS_KRN = "1";

    /** 日状態区分 : 相談 */
    public static final String DAY_STATUS_SD = "2";

    /** 日状態区分 : （研） */
    public static final String DAY_STATUS_KN = "3";

    /** 日状態区分 : 研修 */
    public static final String DAY_STATUS_KNSH = "4";

    /** 日状態区分 : ×（自主） */
    public static final String DAY_STATUS_JSH = "5";

    /** 日状態区分 : ×（研修外） */
    public static final String DAY_STATUS_KNSHG = "6";

    /** 日状態区分 : 連続稼働不可 */
    public static final String DAY_STATUS_KTHK = "7";

    /** セル色区分 : オレンジ色 */
    public static final String SRIR_KBN_ORJIR = "1";

    /** セル色区分 : 黄色 */
    public static final String SRIR_KBN_KIR = "2";

    /** セル色区分 : 灰色 */
    public static final String SRIR_KBN_HIR = "3";

    /** 表示区分:新規登録 */
    public static final String HYJKBN_SNK_TRK = "1";

    /** 表示区分:データ更新 */
    public static final String HYJKBN_DATA_KSHN = "2";

    /** 表示区分:データ削除 */
    public static final String HYJKBN_DATA_SKSE = "3";

    /** 表示区分:継続登録 */
    public static final String HYJKBN_KZK_TRK = "3";

    /** 10：顧客 */
    public static final String STR_KKK = "10";

    /** 50：完了 */
    public static final String STR_KL = "50";

    /** 40：実施済 */
    public static final String STR_JSZM = "40";

    /** 40：P契約 */
    public static final String PKSOKO_40 = "40";

    /** 1：青字表示 */
    public static final String AJHS = "1";

    /** 0：黒字表示 */
    public static final String KRJHS = "0";

    /** 検索画面区分  = 「1：TR日単位検索」 */
    public static final String KENSAKU_TR_TY_KENSAKU = "1";

    /** 検索画面区分  = 「2：TR時間単位検索」 */
    public static final String KENSAKU_TR_JKTY_KENSAKU = "2";

    /** フラグvalue＝「1：checked」 */
    public static final String CHECKED = "1";

    /** フラグvalue＝「0：checked」 */
    public static final String UNCHECKED = "0";

    /** 詳細エリア展開制御フラグ＝「0：展開しない」 */
    public static final String SHOUSAI_FLG_ON = "0";

    /** 詳細エリア展開制御フラグ＝「1：展開」 */
    public static final String SHOUSAI_FLG_OPEN = "1";

    /** 納期切れフラグ ＝ 「1：納期切れ」 */
    public static final String NOUKI_FLG_ICHI = "1";

    /** 納期切れフラグ ＝ 「0：納期切れない」 */
    public static final String NOUKI_FLG_ZERO = "0";

    /** 遷移元画面区分 ＝ 「1：お知らせ一覧【社内・ＴＲ】画面」 */
    public static final String FROMKUBUN_ICHI = "1";

    /** 一覧表示区分 ＝ 「0：基本情報」 */
    public static final String HYJIKBNHY_ZERO = "0";

    /** 一覧表示区分 ＝ 「1：進捗状況」 */
    public static final String HYJIKBNHY_ICHI = "1";

    /** 追加タスク有無 ＝ 「0：なし」 */
    public static final String ADDTSKFLG_NASI = "0";

    /** 追加タスク有無 ＝ 「1：あり」 */
    public static final String ADDTSKFLG_ARI = "1";

    /** 完了フラグ  = 「1：済」 */
    public static final String TSKCPLFLG_ICHI = "1";

    /** 受付未チェックボックス  = 「1：チェックあり」 */
    public static final String UKN_CHECKBOX_YES = "1";

    /** 受付チェックボックス  = 「1：チェックあり」 */
    public static final String UK_CHECKBOX_YES = "1";

    /** 完了チェックボックス  = 「1：チェックあり」 */
    public static final String KR_CHECKBOX_YES = "1";

    /** 受付未チェックボックス  = 「0：チェックなし」」 */
    public static final String UKN_CHECKBOX_NO = "0";

    /** 受付チェックボックス   = 「0：チェックなし」」 */
    public static final String UK_CHECKBOX_NO = "0";

    /** 完了チェックボックス   = 「0：チェックなし」」 */
    public static final String KR_CHECKBOX_NO = "0";

    /** 廃止科目を含める  = 「0：チェックなし」 */
    public static final String HAS_KMK_CHECKNS = "0";

    /** 廃止科目を含める  = 「1：チェックあり」 */
    public static final String HAS_KMK_CHECKAR = "1";

    /** 受付未 */
    public static final String UKN_TEXT = "受付未";

    /** 受付 */
    public static final String UK_TEXT = "受付";

    /** 完了 */
    public static final String KR_TEXT = "完了";

    /** 「0：グレー」 */
    public static final String COLOUR_GREEN = "0";

    /** 「1：済」 */
    public static final String COLOUR_WHITE = "1";

    /** 「2：背景色(赤)＆！」 */
    public static final String COLOUR_RED = "2";

    /** 「3：背景色(黄)」 */
    public static final String COLOUR_YELLOW = "3";

    /** 「4：背景色(青)」 */
    public static final String COLOUR_BLUE = "4";

    /** 連結文字：ハイフン */
    public static final String CON_CHAR_HAIHUN = "-";

    /** 連続稼働フラグ：0：稼働可 */
    public static final String RNZK_KD_FLG_KDK = "0";

    /** 連続稼働フラグ：1：稼働不可 */
    public static final String RNZK_KD_FLG_KDFK = "1";

    /** 基本情報利用区分_研修納品:「1：ON」 */
    public static final String KHNJHKBN_KSHNHN_ON = "1";

    /** 基本情報利用区分_資料納品:「1：ON」 */
    public static final String KHNJHKBN_SIRYONOU_ON = "1";

    /** 基本情報利用区分_公開・開発トライアル:「1：ON」 */
    public static final String KHNJHKBN_KOKAI_ON = "1";

    /** 基本情報利用区分_研修なしTR押え:「1：ON」 */
    public static final String KHNJHKBN_KESHUNASI_ON = "1";

    /** 集計単位区分コード 0：非一括 */
    public static final String SKKBN_HIK = "0";

    /** 集計単位区分コード 1：一括 */
    public static final String SKKBN_IK = "1";

    /** 作成受付フラグ 0：未作成受付 */
    public static final String SKSUKTKFLG_MISKS = "0";

    /** 作成完了フラグ 0：作成未完了 */
    public static final String SKSKNRFLG_SKSKR = "0";

    /** 作成完了フラグ 1：作成完了 */
    public static final String SKSKNRFLG_KR = "1";

    /** アンケート有フラグ：「1：有り」 */
    public static final String ENQUETEARIFLG_ARI = "1";

    /** アンケート有フラグ：「0：なし」 */
    public static final String ENQUETEARIFLG_NASHI = "0";

    /** 検索単位:「0：基本情報単位」 */
    public static final String KENSKTNI_KHJHTI_ZERO = "0";

    /** 検索単位:「1：TR単位」 */
    public static final String KENSKTNI_KHJHTI_ONE = "1";

    /** 担当営業変更PRISM連携フラグ：「1：ON」 */
    public static final String EGYTTHKPRISMFLG_ON = "1";

    /** 担当営業変更PRISM連携フラグ：「0：OFF」 */
    public static final String EGYTTHKPRISMFLG_OFF = "0";

    /** 担当研スタ変更PRISM連携フラグ：「1：ON」 */
    public static final String TTKSTHKPRISMFLG_ON = "1";

    /** 担当研スタ変更PRISM連携フラグ：「0：OFF」 */
    public static final String TTKSTHKPRISMFLG_OFF = "0";

    /** 受講者数 */
    public static final String JUKO_SHASU = "受講者数";

    /** 種類 */
    public static final String ENQUET_EKBNCD = "種類";

    /** アンケート回収枚数 */
    public static final String AKTRTN_SU = "アンケート回収枚数";

    /** 発送予定日 */
    public static final String SENDYT_YMD = "発送予定日";

    /** 研修開始日FROM */
    public static final String KENSYU_KAISI_FROM = "研修開始日FROM";

    /** 研修開始日TO */
    public static final String KENSYU_KAISI_TO = "研修開始日TO";

    /** 研修終了日FROM */
    public static final String KENSYU_SYURYOU_FROM = "研修終了日FROM";

    /** 研修終了日TO */
    public static final String KENSYU_SYURYOU_TO = "研修終了日TO";

    /** 報告書依頼日FROM */
    public static final String HKKSYO_IRA_FROM = "報告書依頼日FROM";

    /** 報告書依頼日TO */
    public static final String HKKSYO_IRA_TO = "報告書依頼日TO";

    /** UP予定日FROM */
    public static final String UP_YOTEYI_FROM = "UP予定日FROM ";

    /** UP予定日TO */
    public static final String UP_YOTEYI_TO = "UP予定日TO ";

    /** 選択対象 */
    public static final String SENTAKU_TAISYOU = "対象";

    /** 選択変更対象 */
    public static final String SENTAKU_HENKOU_TAISYOU = "変更対象";

    /** 検索条件 */
    public static final String SEARCH_CONTENT = "検索条件";

    /** 所感ステータス:あり */
    public static final String SYOKANSTAS_ARI = "所感あり";

    /** 所感ステータス:なし */
    public static final String SYOKANSTAS_NASI = "所感なし";

    /** TRマッチング */
    public static final String TR_MACHING = "TRマッチング";

    /** エントリー日 */
    public static final String ENTLI_DAY = "エントリー日";

    /** マスターの取得日 */
    public static final String MAST_SYUTOKU_DAY = "マスターの取得日";

    /** 消滅日 */
    public static final String SAKUGEN_DAY = "消滅日";

    /** 入社日 */
    public static final String NYUUSHA_DAY = "入社日";

    /** 退社日 */
    public static final String TAISHA_DAY = "退社日";

    /** 入学日 */
    public static final String NYUUKAKU_DAY = "入学日";

    /** 卒業日 */
    public static final String SOTUGYO_DAY = "卒業日";

    /** ＴＲ名 */
    public static final String TR_NAME = "ＴＲ名";

    /** 基本情報 */
    public static final String KHN_INFO = "基本情報";

    /** 押え情報 */
    public static final String OSAE_INFO = "押え情報";

    /** 作成受付フラグ :「0：未作成受付」 */
    public static final String SAKASE_WKTKFLAG_MSAKASEWKTK = "0";

    /** 作成完了フラグ 「0：作成未完了」 */
    public static final String SAKASE_KANRFLAG_SAKASEMKANR = "0";

    /** 情報の取り扱いに同意する */
    public static final String ACCEDE = "情報の取り扱いに同意する";

    /** 対象画面 */
    public static final String TAI_SYO_GAMEN = "対象画面";

    /** ご意見・ご要望 */
    public static final String CMT = "ご意見・ご要望";

    /** ID情報 */
    public static final String ID_JYOUHOU = "ID情報";

    /** 編集モードフラグ:1 */
    public static final String EDITMODEFLG_1 = "1";

    /** 追加タスクフラグ:1 */
    public static final String ADDTSTFLG_1 = "1";

    /** タスク一覧リスト 御社:1 */
    public static final String TSKRST_ONSHA_1 = "0";

    /** タスク一覧リスト 御社:1 */
    public static final String TSKRST_ONSHA = "1";

    /** タスク一覧リスト  営業:1 */
    public static final String TSKRST_EIGYO_1 = "1";

    /** タスク一覧リスト スタッフ:1 */
    public static final String TSKRST_STUFF_1 = "1";

    /** タスク一覧リスト TR :1 */
    public static final String TSKRST_TR_1 = "1";

    /** タスク一覧リスト  関係者:1 */
    public static final String TSKRST_KANKEISHA_1 = "1";

    /** タスク一覧リスト 御社:1 */
    public static final String TSKRST_ONSHA_FLAG = "1";

    /** タスク一覧リスト  営業:1 */
    public static final String TSKRST_EIGYO_FLAG = "2";

    /** タスク一覧リスト スタッフ:1 */
    public static final String TSKRST_STUFF_FLAG = "3";

    /** タスク一覧リスト TR :1 */
    public static final String TSKRST_TR_FLAG = "4";

    /** タスク一覧リスト  関係者:1 */
    public static final String TSKRST_KANKEISHA_FLAG = "5";

    /** タスク一覧リスト  タスク表示しない:0 */
    public static final String TSKRST_TSKDISPFLG_NO_0 = "0";

    /** 人数報告不要フラグ:「0：要」 */
    public static final String HUMCNTHKKFYOFIG_00 = "0";

    /** 人数報告不要:「1：不要」 */
    public static final String HUMCNTHKKFYOFLG_01 = "1";

    /** 再編集フラグ：「1：再編集」 */
    public static final String REEDITFLG_01 = "1";

    /** 受講者人数・アンケートに関する特記事項：あり：「0：なし」 */
    public static final String JKSHNNZANKTTKGJARI_00 = "0";

    /** 検索件数：0件 */
    public static final int KENSAKU_KENSUU_ZERO = 0;

    /** ＴＲ単位 :1 */
    public static final String TRTNYI_1 = "1";

    /** 区分：(30：公開・開発トライアル) */
    public static final String STR_KBN_SANNJYUU_30 = "30";

    /** 所感有無：(0：なし) */
    public static final String SYOKAN_UM_0 = "0";

    /** 所感有無：(1：あり) */
    public static final String SYOKAN_UM_1 = "1";

    /** 所感管理ステータスコード ：(40：所感不要) */
    public static final String SYOKANKANRISTS_40 = "40";

    /** 所感不要存在フラグ ：(1：存在) */
    public static final String SYKFYSONZIFLG_1 = "1";

    /** 所感不要存在フラグ ：(0：存在しない) */
    public static final String SYKFYSONZIFLG_0 = "0";

    /** 所感管理ステータス存在フラグ ：(10：研修実施前) */
    public static final String SYKNKNRISTSFLG_10 = "10";

    /** 所感管理ステータス存在フラグ ：(20：到着待ち) */
    public static final String SYKNKNRISTSFLG_20 = "20";

    /** 所感管理ステータス存在フラグ ：(30：到着完了) */
    public static final String SYKNKNRISTSFLG_30 = "30";

    /** 所感管理ステータス存在フラグ ：(0：存在しない) */
    public static final String SYKNKNRISTSFLG_0 = "0";

    /** 所感管理ステータス存在フラグ ：(1：存在) */
    public static final String SYKNKNRISTSFLG_1 = "1";

    /** 検索対象フラグ ：(0：検索対象外) */
    public static final String SECHTAISOFLG_0 = "0";

    /** 検索対象フラグ ：(1：検索対象) */
    public static final String SECHTAISOFLG_1 = "1";

    /** 基本情報ステータス完了含むフラグ ：(0：完了含まない) */
    public static final String KHNINFOSTSKNRYOKMTSU_0 = "0";

    /** 基本情報ステータス完了含むフラグ ：(1：完了含む) */
    public static final String KHNINFOSTSKNRYOKMTSU_1 = "1";

    /** 基本情報ステータスコード ：(20：起票取下げ) */
    public static final String KHNINFOSTSCD_20 = "20";

    /** 基本情報ステータスコード ：(30：進行中) */
    public static final String KHNINFOSTSCD_30 = "30";

    /** 基本情報ステータスコード ：(40：実施済) */
    public static final String KHNINFOSTSCD_40 = "40";

    /** 基本情報ステータスコード ：(50：実施済) */
    public static final String KHNINFOSTSCD_50 = "50";

    /** 基本情報ステータスコード ：(60：キャンセル) */
    public static final String KHNINFOSTSCD_60 = "60";

    /** 報告書ステータスコード ：(20：作成依頼) */
    public static final String SKKSYOSTSCD_20 = "20";

    /** 報告書ステータスコード ：(10：依頼前) */
    public static final String SKKSYOSTSCD_10 = "10";

    /** 報告書ステータスコード ：(30：受付) */
    public static final String SKKSYOSTSCD_30 = "30";

    /** 報告書ステータスコード ：(40：完了) */
    public static final String SKKSYOSTSCD_40 = "40";

    /** 権限グループコード ：10：営業・スタッフ */
    public static final String KGGRPDC_TEN = "10";

    /** 権限グループコード ：20：ＴＲＭ */
    public static final String KGGRPDC_TWENTY = "20";

    /** 権限グループコード ：30：専属ＴＲ */
    public static final String KGGRPDC_THIRTY = "30";

    /** 権限グループコード ：40：専属外ＴＲ */
    public static final String KGGRPDC_FORTY = "40";

    /** 権限グループコード ：50：提携スケジュール担当者 */
    public static final String KGGRPDC_FIFTY = "50";

    /** 権限グループコード ：60：顧客_管理者 */
    public static final String KGGRPDC_SIXTY = "60";

    /** 権限グループコード ：70：顧客_担当者 */
    public static final String KGGRPDC_SEVENTY = "70";

    /** 権限グループコード  ：80：提携スケジュール担当者 */
    public static final String KGGRPDC_EIGHTY = "80";

    /** ユーザ情報のパスワード区分 ：0：仮パスワード */
    public static final String PASSWORD_KBN_ZERO = "0";

    /** ユーザ情報のパスワード区分 ：1：パスワード */
    public static final String PASSWORD_KBN_ONE = "1";

    /** 商品コード: 1:商品コード指定なし */
    public static final String SYOHEN_CD_NASHI = "1";

    /** リンク先即時遷移区分・1：リンク先即時遷移 */
    public static final String LINK_DEST_TEMP_FRW_SORT_ONE = "1";

    /** 会場都道府県コード 98：その他 */
    public static final String KJYO_TDFKN_CD_SNT = "98";

    /** 採番ID（80：スケジュールNo） */
    public static final String SABA_SCHE_ON = "80";

    /** 1：チェック済 */
    public static final String CHECK_FLG_ONE = "1";

    /** 表示区分 1：コピー登録 */
    public static final String HYJKBN_KOP_TRK = "1";

    /** 表示区分 2：既存データ表示 */
    public static final String HYJKBN_KST_HYOJ = "2";

    /** 処理区分 1：商品コード指定なし */
    public static final String SHO_RI_KBN_ONE = "1";

    /** 処理区分 2：TR押えの更新処理 */
    public static final String SHO_RI_KBN_TWO = "2";

    /** アセス処理区分 1：アセス処理でない */
    public static final String ACCES_SHO_KBN_ONE = "1";

    /** アセス処理区分 2：アセス処理である */
    public static final String ACCES_SHO_KBN_TWO = "2";

    /** ＴＲ名選択区分 1：TR単独選択 */
    public static final String TRNM_SNT_KBN_ONE = "1";

    /** ＴＲ名選択区分 2：TR単独選択 */
    public static final String TRNM_SNT_KBN_TWO = "2";

    /** メッセージ表示フラグ：「1：表示する」 */
    public static final String MSG_SNK_FLAG_YES = "1";

    /** 編集モードフラグ:0 */
    public static final String EDITMODEFLG_0 = "0";

    /** 追加エリア展開制御フラグ: 「0：展開しない」 */
    public static final String TSK_AREA_TNK_SG_FLG = "0";

    /** 「0：背景色表示区分(なし)」 */
    public static final String BACK_COLOUR_NONE = "0";

    /** 「1：背景色表示区分(赤)」 */
    public static final String BACK_COLOUR_RED = "1";

    /** 「2：背景色表示区分(黄)」 */
    public static final String BACK_COLOUR_YELLOW = "2";

    /** 「3：背景色表示区分(青)」 */
    public static final String BACK_COLOUR_BLUE = "3";

    /** 「4：背景色表示区分(グレー)」 */
    public static final String BACK_COLOUR_GRAY = "4";

    /** 「0※検索処理実施の判定フラグ」 */
    public static final String KNSK_FLG_0 = "0";

    /** 「1※検索処理実施の判定フラグ」 */
    public static final String KNSK_FLG_1 = "1";

    /** 「「0：原価」」 */
    public static final String KAMKK_00 = "0";

    /** 「「1：ALL_分類確定フラグ」」 */
    public static final String ALL_BRKAKTEI_FLG_1 = "1";

    /** 「「0：未チェック」」 */
    public static final String UN_CHECK_FLG_0 = "0";

    /** 「「1：資料対象」」 */
    public static final String CHECK_BOX_SIYO = "1";

    /** 「「2：資料一覧対象」」 */
    public static final String CHECK_BOX_SIYO_SHOW = "2";

    /** 「「3：プログラム対象」」 */
    public static final String CHECK_BOX_PROGRAM = "3";

    /** 「「4：レイアウト対象」」 */
    public static final String CHECK_BOX_LAYOUT = "4";

    /** 「「1：チェックした」」 */
    public static final String CHECK_FLG_1 = "1";

    /** 「「1：選択対象フラグ」」 */
    public static final String STTSHFLG_1 = "1";

    /** 「「1：ファイル区分(資料一覧)」」 */
    public static final String FILE_KBN_1 = "1";

    /** 「「2：ファイル区分(プログラム)」」 */
    public static final String FILE_KBN_2 = "2";

    /** 「「1：削除フラグ」」 */
    public static final String DEL_FLG_1 = "1";

    /** 「「0：削除フラグ」」 */
    public static final String DEL_FLG_0 = "0";

    /** 「1：発送手配画面の標準資料タブの資料選択ボタン」 */
    public static final String OUT_BUTTONKBN_01 = "1";

    /** 「2：発送手配画面の付随・特資タブの資料選択ボタン」 */
    public static final String OUT_BUTTONKBN_02 = "2";

    /** 「3：発送手配イレギュラー画面の標準資料タブの資料選択ボタン」 */
    public static final String OUT_BUTTONKBN_03 = "3";

    /** 「4：発送手配イレギュラー画面の付随・特資タブの資料選択ボタン」 */
    public static final String OUT_BUTTONKBN_04 = "4";

    /** 「1：分類確認区分確定」 */
    public static final String BRK_AKTEIBN_01 = "1";

    /** 「1：分類確認区分未確定」 */
    public static final String BRK_AKTEIBN_02 = "0";

    /** 「ボタンフラグ ＝ 「1：活性」」 */
    public static final String SERCH_FLG_01 = "1";

    /** 「ボタンフラグ ＝ 「2：非活性」」 */
    public static final String SERCH_FLG_02 = "2";

    /** 「table」表示フラグ ＝ 「1：table01」」 */
    public static final String TABLE_FLG_01 = "1";

    /** 「table」表示フラグ ＝ 「2：table02」」 */
    public static final String TABLE_FLG_02 = "2";

    /** 分類確認区分＝「1：確定」 */
    public static final String KETEI = "1";

    /** 「選択」ボタンフラグ＝「１：活性」 */
    public static final String SNTK_BTN_FLAG_KASEI = "1";

    /** 「選択」ボタンフラグ＝「２：非活性」 */
    public static final String SNTK_BTN_FLAG_HIKASEI = "2";

    /** 「選択」ボタンフラグ＝「３：非表示」 */
    public static final String SNTK_BTN_FLAG_HIHYOJI = "3";

    /** 顧客に共有する ＝ 「0：非顧客共有」 */
    public static final String CUSTOM_SHARE_FLAG = "0";

    /** 顧客に共有する ＝ 「1：顧客共有」 */
    public static final String CUSTOM_SHARE_FLAG1 = "1";

    /** お知らせ分類コード ＝ 「17：TRメール送付」 */
    public static final String SRSBR_CD_TR_MAIL = "017";

    /** お知らせ分類コード ＝ 「15：押え否認」 */
    public static final String SRSBR_CD_OSE_HRN = "015";

    /** お知らせ分類コード ＝ 「30：押え申請（提携分）」 */
    public static final String SRSBR_CD_OSE_SHNS = "030";

    /** 不要フラグ ＝ 「0：要」 */
    public static final String FUYOU_FLAG0 = "0";

    /** 不要フラグ ＝ 「1：不要」 */
    public static final String FUYOU_FLAG1 = "1";

    /** TR変更有無フラグ : 変更あり */
    public static final String TRHKUMFLG_ON = "1";

    /** TR変更有無フラグ : 変更なし */
    public static final String TRHKUMFLG_OFF = "0";

    /** 画面区分 : TR押え画面 */
    public static final String GAMENKBN_TROSAEGAMEN = "1";

    /** 画面区分 : 変更依頼画 */
    public static final String GAMENKBN_KNKOIRGAMEN = "2";

    /** 処理区分 : 登録時 */
    public static final String SHORIKBN_INSERT = "1";

    /** 処理区分 : 更新時 */
    public static final String SHORIKBN_UPDATE = "2";

    /** 処理区分 : 受付時 */
    public static final String SHORIKBN_UKTK = "3";

    /** 再設定要否フラグ : 再設定必要 */
    public static final String SSTYHFLG_ON = "1";

    /** 再設定要否フラグ : 再設定不要 */
    public static final String SSTYHFLG_OFF = "0";

    /** 押え区分 : X */
    public static final String OSAKBN_BTU = "X";

    /** 押え区分 : 01：研修 */
    public static final String OSAKBN_BTU_ONE = "01";

    /** 押え区分 : 02：研修外 */
    public static final String OSAKBN_BTU_TWO = "02";

    /** 押え区分 : 03：養成 */
    public static final String OSAKBN_BTU_THREE = "03";

    /** 押え区分 : 04：アセス処理 */
    public static final String OSAKBN_BTU_FOUR = "04";

    /** 押え区分 : 05：× */
    public static final String OSAKBN_BTU_FIVE = "05";

    /** 押え区分 : 06：自主 */
    public static final String OSAKBN_BTU_SIX = "06";

    /** 押え区分 : 07：開発 */
    public static final String OSAKBN_BTU_SEVEN = "07";

    /** 押え区分 : 08：研修アシトレ */
    public static final String OSAKBN_BTU_EIGHT = "08";

    /** 押え区分 : 09：ＲＬＣ */
    public static final String OSAKBN_BTU_NINE = "09";

    /** 押えステータス : 01：仮押え申請 */
    public static final String OSASTS_BTU_ONE = "01";

    /** 押えステータス : 03：仮押え保留 */
    public static final String OSASTS_BTU_THREE = "03";

    /** 押えステータス : 04：仮押え */
    public static final String OSASTS_BTU_FOUR = "04";

    /** 押えステータス : 11：本押え申請 */
    public static final String OSASTS_BTU_ELEVEN = "11";

    /** 押えステータス : 14：本押え */
    public static final String OSASTS_BTU_FORTEEN = "14";

    /** 対象画面 100：ログイン */
    public static final String TAISYO_GAMEN_100 = "100";

    /** 対象画面 200：お知らせ一覧 */
    public static final String TAISYO_GAMEN_200 = "200";

    /** 対象画面 300：基本情報一覧 */
    public static final String TAISYO_GAMEN_300 = "300";

    /** 対象画面 400：ユーザ管理 */
    public static final String TAISYO_GAMEN_400 = "400";

    /** 対象画面 500：その他 */
    public static final String TAISYO_GAMEN_500 = "500";

    /** パック区分 : 「3：パック」 */
    public static final String BTGGU_KBN = "3";

    /** 背景色フラグ : 「２：オレンジ」 */
    public static final String BACK_COLOR_FLAG_ERENJI = "2";

    /** 背景色フラグ : 「１：黄色」 */
    public static final String BACK_COLOR_FLAG_YELLOW = "1";

    /** 「検索結果の件数」下の「検索」レーベル : 「パック検索」 */
    public static final String BAGGUKENNSAKU = "パック検索";

    /** 資料区分 : (0：特殊) */
    public static final String SHRYU_KBN_TKSYU = "0";

    /** 資料区分 : (1：付随) */
    public static final String SHRYU_KBN_FZI = "1";

    /** 資料区分 : (2：標準) */
    public static final String SHRYU_KBN_HYUJYN = "2";

    /** 資料数量? : (0：チェックなし) */
    public static final String SIRYOSU_CHECKBOX_NO = "0";

    /** パスワード区分 : (0：暫定パスワード) */
    public static final String PASSWORD_KBN_ZNT = "0";

    /** 発送先区分 1：会場 */
    public static final String HSSKB_KJ = "1";

    /** 発送先区分 2：先方 */
    public static final String HSSKB_SH = "2";

    /** 発送先区分 3：その他 */
    public static final String HSSKB_SNT = "3";

    /** 発送先区分 4：担当者 */
    public static final String HSSKB_TTS = "4";

    /** タイムサービス 0：なし */
    public static final String TIMESERVICE_NS = "0";

    /** タイムサービス 1：あり */
    public static final String TIMESERVICE_AR = "1";

    /** 個別梱包フラグ 0：なし */
    public static final String KBKONFLAG_NS = "0";

    /** 個別梱包フラグ 1：あり */
    public static final String KBKONFLAG_AR = "1";

    /** バインダー綴じフラグ 0：なし */
    public static final String BINDERTOJIFLG_NS = "0";

    /** バインダー綴じフラグ 1：あり */
    public static final String BINDERTOJIFLG_AR = "1";

    /** 資料回収有無区分 0：回収なし */
    public static final String SYKSUMKB_KSNS = "0";

    /** 資料回収有無区分 1：回収あり */
    public static final String SYKSUMKB_KSAR = "1";

    /** 資料回収有無区分 2：回収なし伝票あり */
    public static final String SYKSUMKB_KSNSDHAR = "2";

    /** 返送先区分 1：YSD戻し */
    public static final String HESSKB_YSDM = "1";

    /** 返送先区分 4：その他 */
    public static final String HESSKB_SNT = "4";

    /** 返送先区分 5：FCJ戻し */
    public static final String HESSKB_FCJM = "5";

    /** 回収先区分 1：会場 */
    public static final String KSSKB_KJ = "1";

    /** 回収先区分 2：先方 */
    public static final String KSSKB_SH = "2";

    /** 回収先区分 3：その他 */
    public static final String KSSKB_SNT = "3";

    /** 回収先区分 4：担当者 */
    public static final String KSSKB_TTS = "4";

    /** サーベイ種別区分 101：101 LSS */
    public static final String SSBKB_LSS = "101";

    /** サーベイ種別区分 201：201 ELS */
    public static final String SSBKB_ELS = "201";

    /** サーベイ種別区分 301：301 MSS */
    public static final String SSBKB_MSS = "301";

    /** サーベイ種別区分 401：401 MSJ */
    public static final String SSBKB_MSJ = "401";

    /** サーベイ種別区分 501：501 OBS */
    public static final String SSBKB_OBS = "501";

    /** サーベイ種別区分 601：591 OBS-TENPO */
    public static final String SSBKB_OBS_TENPO = "601";

    /** サーベイ種別区分 701：592 OBS-HOTEL */
    public static final String SSBKB_OBS_HOTEL = "701";

    /** サーベイ種別区分 801：701 STEER */
    public static final String SSBKB_STEER = "801";

    /** サーベイ種別区分 901：901 R-CAP */
    public static final String SSBKB_R_CAP = "901";

    /** サーベイ種別区分 951：951 SSR-M */
    public static final String SSBKB_SSR_M = "951";

    /** サーベイ種別区分 999：その他 */
    public static final String SSBKB_SNT = "999";

    /** 実施形態区分 0：紙 */
    public static final String SSKTKB_S = "0";

    /** 実施形態区分 1：WEB */
    public static final String SSKTKB_W = "1";

    /** 実施形態区分 2：紙＋WEB */
    public static final String SSKTKB_SW = "2";

    /** アドバイスシート有無区分 0：なし */
    public static final String ADVKB_NS = "0";

    /** アドバイスシート有無区分 1：あり */
    public static final String ADVKB_AR = "1";

    /** 商品詳細区分 001：研修標準6指標 */
    public static final String SHSSKB_KSHJ6SH = "001";

    /** 商品詳細区分 002：7指標 */
    public static final String SHSSKB_7SH = "002";

    /** 商品詳細区分 003：5指標 */
    public static final String SHSSKB_5SH = "003";

    /** 商品詳細区分 999：指標選択 */
    public static final String SHSSKB_SHSTK = "999";

    /** 納品形態区分 1：一括 */
    public static final String NHKTKB_IK = "1";

    /** 納品形態区分 2：随時 */
    public static final String NHKTKB_ZJ = "2";

    /** 報告書レイアウト区分 1：標準 */
    public static final String HKSLAYOUTKB_HJ = "1";

    /** 報告書レイアウト区分 2：旧版 */
    public static final String HKSLAYOUTKB_KH = "2";

    /** ODP区分:  1：印刷会社 */
    public static final String ODP_KBN_KAISYA = "1";

    /** ODP区分:  2：付随 */
    public static final String ODP_KBN_FUSAI = "2";

    /** ODP区分:  4：採点 */
    public static final String ODP_KBN_SAITEN = "4";

    /** ODP区分:  5：納品スタッフ */
    public static final String ODP_KBN_NAHINN = "5";

    /** 登録区分 : 「0：仮登録」 */
    public static final String TORU_KATA_TORU = "0";

    /** 登録区分 : 「5：履歴登録」 */
    public static final String TORU_REKISHI_TORU = "5";

    /** 登録区分 : 「3：取消」 */
    public static final String TORU_KESHI = "3";

    /** 登録区分 : 「2：本登録」 */
    public static final String TORU_HON_TORU = "2";

    /** 登録区分 : 「4：削除」 */
    public static final String TORU_SAKUJYO_TORU = "4";

    /** YSD受付フラグ */
    public static final String YSDUT_FLG = "1";

    /** YSD受付フラグ */
    public static final String YSDUT_FLGNO = "0";

    /** 選択チェックボックス : 「1：削除」 */
    public static final String CHECKBOX_SAKUJYO = "1";

    /** 選択チェックボックス : 「0：削除」 */
    public static final String CHECKBOX_SAKUJYO_0 = "0";

    /** 職場コード表 */
    public static final String SYOKUBA_CODE = "職場コード表";

    /** CariCo回答者情報 */
    public static final String CARI_CO_KOUTAE = "CariCo回答者情報";

    /** スタイル入りメンバー表 */
    public static final String STAIRU_IRIMENBA = "スタイル入りメンバー表";

    /** 回収状況 */
    public static final String KAISYO_JYUKYU = "回収状況";

    /** アドバイスシートカスタマイズ申請書 */
    public static final String ADOBAISU_SHEET_KASUTAMINN = "アドバイスシートカスタマイズ申請書";

    /** 再編集フラグ 0 */
    public static final String REEDIT_FLG_01 = "0";

    /** 再編集フラグ 1 */
    public static final String REEDIT_FLG_02 = "1";

    /** 確認／再編集ボタン表示フラグ 「１：確認ボタン表示」 */
    public static final String KKNNSHNSHBT_NHJ_FLG_01 = "1";

    /** 確認／再編集ボタン表示フラグ 「2：再編集ボタン表示」 */
    public static final String KKNNSHNSHBT_NHJ_FLG_02 = "2";

    /** 表示区分フラグ 0 */
    public static final String HYJ_KBN_FLG_00 = "0";

    /** 表示区分フラグ 1 */
    public static final String HYJ_KBN_FLG_01 = "1";

    /** 人数不要制御フラグに「0：非活性」 */
    public static final String NNZHYSG_FLG_00 = "0";

    /** 人数不要制御フラグに「1：活性」 */
    public static final String NNZHYSG_FLG_01 = "1";

    /** アンケート実施なし「0」 */
    public static final String ANKTJSSH_UMU_01 = "0";

    /** アンケート実施あり「1」 */
    public static final String ANKTJSSH_UMU_02 = "1";

    /** 人数報告不要フラグに「0」 */
    public static final String HUMCNTHKKFYO_FLG_01 = "0";

    /** 人数報告不要フラグに「1」 */
    public static final String HUMCNTHKKFYO_FLG_02 = "1";

    /** 人数報告不要フラグ判定有無「1」 */
    public static final String HUMCNTHKKFYOUM_FLG_01 = "1";

    /** 発送方法に「10」 */
    public static final String SEND_WAY = "10";

    /** アンケート種別 = 提携先の場合「40」 */
    public static final String ENQUETEKBN_CD = "40";

    /** 「0：作成しない」 */
    public static final String SAKUSEYISHINAYI = "0";

    /** 「1：作成する」 */
    public static final String SAKUSEYISURU = "1";

    /** 所感なしに変更 */
    public static final String SYOKAN_HKNY_1 = "1";

    /** 所感ありに変更 */
    public static final String SYOKAN_HKAR_2 = "2";

    /** 「0：検索結果一覧.存在フラグ」 */
    public static final String SONNZAIFLG = "0";

    /** 遷移元画面区分  = 「1：YSDデータ管理」 */
    public static final String YSD_DATA_KANRI = "1";

    /** 遷移元画面区分  = 「2：FCJデータ管理」 */
    public static final String FCJ_DATA_KANRI = "2";

    /** イレギュラーが"申請"に設定する */
    public static final String IRGR_SHNS = "申請";

    /** イレギュラーが"受付"に設定する */
    public static final String IRGR_JH = "受付";

    /** イレギュラーが"申請キャンセル"に設定する */
    public static final String IRGR_SHNSCANCEL = "申請キャンセル";

    /** イレギュラーが"全て"に設定する */
    public static final String IRGR_SBT = "全て";

    /** イレギュラーが"申請CODE"に設定する */
    public static final String IRGR_SHNS_CODE = "0";

    /** 付随手配先が「付/印/採」 */
    public static final String HZITHSK_CYS = "付/印/採";

    /** 付随手配先が「付/採」 */
    public static final String HZITHSK_CS = "付/採";

    /** 付随手配先が「印/採」 */
    public static final String HZITHSK_YS = "印/採";

    /** 付随手配先が「付/印」 */
    public static final String HZITHSK_CY = "付/印";

    /** 付随手配先が「採」 */
    public static final String HZITHSK_S = "採";

    /** 付随手配先が「付」 */
    public static final String HZITHSK_C = "付";

    /** 付随手配先が「印」 */
    public static final String HZITHSK_Y = "印";

    /** 「標準」チェックボックス＝「１：チェック」の場合 */
    public static final String SIRYO_SEARCH_STD = "資料検索（標準）";

    /** 「特資」チェックボックス＝「１：チェック」の場合の場合 */
    public static final String SIRYO_SEARCH_TK = "資料検索（付随・特資）";

    /** 更新フラグ  = 「0：更新しない」 */
    public static final String KOSHINSHINAYI = "0";

    /** 更新フラグ  = 「1：更新」 */
    public static final String KOSHIN = "1";

    /** 更新フラグ = 「2：更新」 */
    public static final String KOSHIN2 = "2";

    /** ファイル区分コード  = 「10：ファイル添付」 */
    public static final String FILE_KUBEN_CODE10 = "10";

    /** ファイル区分コード  = 「20：ファイル添付欄ＲＭＳ内共有」 */
    public static final String FILE_KUBEN_CODE20 = "20";

    /** ファイル区分コード  = 「30：アンケート」 */
    public static final String FILE_KUBEN_CODE30 = "30";

    /** ファイル区分コード  = 「40：所感 」 */
    public static final String FILE_KUBEN_CODE40 = "40";

    /** ファイル区分コード  = 「50：報告書」 */
    public static final String FILE_KUBEN_CODE50 = "50";

    /** ファイル種別コード  = 「10：備品・レイアウト案内ファイル」 */
    public static final String FILESHUBECD10 = "10";

    /** ファイル種別コード  = 「20：プログラム」 */
    public static final String FILESHUBECD20 = "20";

    /** ファイル種別コード  = 「30：プログラム」 */
    public static final String PUKOGURAMU = "30";

    /** ファイル種別コード  = 「40：その他個人情報あり」 */
    public static final String SONOTAKOJINJYOUHOUARI = "40";

    /** ファイル種別コード  = 「50：その他個人情報なし」 */
    public static final String SONOTAKOJINJYOUHOUNASHI = "50";

    /** ファイル種別コード  = 「60：個人情報なしファイル」 */
    public static final String FILESHUBECD_KJJHNSFILE = "60";

    /** ファイル種別コード  = 「70：個人情報ありファイル」 */
    public static final String FILESHUBECD_KJJHARFILE = "70";

    /** 遷移元区分  = 1 */
    public static final String SENYIGENKUBUN_01 = "1";

    /** 遷移元区分  = 2 */
    public static final String SENYIGENKUBUN_02 = "2";

    /** 遷移元区分  = 3 */
    public static final String SENYIGENKUBUN_03 = "3";

    /** 遷移元区分  = 9 */
    public static final String SENYIGENKUBUN_09 = "9";

    /** HTTP/HTTPS区分 : "1" */
    public static final String HTTP_HTTPS_KUBN = "1";

    /** HTTP/HTTPS区分 : "0" */
    public static final String HTTP_HTTP_KUBN = "0";

    /** 保持期間 : プロパティkey：login.cookie.valid.period */
    public static final String HOLD_PERIOD = "login.cookie.valid.period";

    /** 秘密鍵 : プロパティkey：login.cookie.secret.key */
    public static final String SECRET_KEY = "login.cookie.secret.key";

    /** UTF-8 */
    public static final String UTF_8 = "UTF-8";

    /** ファイル区分コード「50：報告書」 */
    public static final String FILEKBUCD_HKS = "50";

    /** 呼び出す元画面区分  = 「１：発送・サーベイ管理＜資料手配＞」 */
    public static final String YOBIDASU_MOTOGAMEN_HASSOU = "1";

    /** 呼び出す元画面区分  = 「２：特別発送一覧」 */
    public static final String YOBIDASU_MOTOGAMEN_TOKUBETU = "2";

    /** ログイン画面区分  = 「1：C501_ログイン【社内・専属ＴＲ】」 */
    public static final String GMN_KBNN_SNSK_TR = "1";

    /** ログイン画面区分  = 「C502_ログイン【専属外ＴＲ・提携スケ担】」 */
    public static final String GMN_KBNN_SNSKGAI_TR = "2";

    /** ログイン画面区分  = 「3：C503_ログイン【顧客】】」 */
    public static final String GMN_KBNN_KKYKU = "3";

    /** ログイン画面区分  = 「4：C504_ログイン【共通】】」 */
    public static final String GMN_KBNN_KYUTU = "4";

    /** FORWARDSTRING  = 「C501：【社内・専属ＴＲ】」 */
    public static final String FORWARD_STRING_C501 = "forwardC501";

    /** FORWARDSTRING  = 「C502：【専属外ＴＲ】」 */
    public static final String FORWARD_STRING_C502 = "forwardC502";

    /** FORWARDSTRING  = 「C503：【顧客】」 */
    public static final String FORWARD_STRING_C503 = "forwardC503";

    /** FORWARDSTRING  = 「C504：【共通】」 */
    public static final String FORWARD_STRING_C504 = "forwardC504";

    /** FORWARDSTRING  = 「forwardKhnJyh：基本情報画面の画面初期表示」 */
    public static final String FORWARD_STRING_KHNJYH_GAEMN = "forwardKhnJyh";

    /** FORWARDSTRING  = 「forwardTkskSry：特殊資料閲覧画面画面の画面初期表示」 */
    public static final String FORWARD_STRING_TKSK_GAMEN = "forwardTkskSry";

    /** 遷移先区分：(1 : 基本情報画面（お知らせメール） */
    public static final String SNSKKUBNN_ONE = "1";

    /** 遷移先区分：(2 : 基本情報画面（通常メール（Notesメールなど）） */
    public static final String SNSKKUBNN_TWO = "2";

    /** 遷移先区分：(3 : 特殊資料閲覧画面（資料詳細Excel） */
    public static final String SNSKKUBNN_THREE = "3";

    /** 権限グループコード ：20：納品スタッフ */
    public static final String KGGRPDC_NOUHIN_NM = "20";

    /** 送信済フラグ ：0：未送信 */
    public static final String MAILED_FLG = "0";

    /** 作成受付フラグ＝「0：未受付」 */
    public static final String SKSUKTKFLG_NO = "0";

    /** 作成受付フラグ＝「1：受付」 */
    public static final String SKSUKTKFLG_YES = "1";

    /** 押え区分フラグ 「0：非活性」 */
    public static final String OSAKBN_FLG_0 = "0";

    /** 押え区分フラグ 「1：活性」 */
    public static final String OSAKBN_FLG_1 = "1";

    /** 選択フラグ 「1：選択（単一）」 */
    public static final String CHOOSE_FLG_1 = "1";

    /** PRISM連携ありフラグ」「1：活性」 */
    public static final String PRISM_ARI_FLG_1 = "1";

    /** PRISM連携ありフラグ」「0：非活性」 */
    public static final String PRISM_ARI_FLG_0 = "0";

    /** PRISM連携フラグ」「1：PRISM連携にチェックが付く」 */
    public static final String PRISM_RK_FLG_1 = "1";

    /** PRISM連携フラグ」「0：PRISM連携にチェックが付かない」 */
    public static final String PRISM_RK_FLG_0 = "0";

    /** 連携フラグ「1：活性」 */
    public static final String RK_FLAG_1 = "1";

    /** 連携フラグ「0：非活性」 */
    public static final String RK_FLAG_0 = "0";

    /** 氏名フラグ「1：活性」 */
    public static final String NAME_FLAG_1 = "1";

    /** 氏名フラグ「0：非活性」 */
    public static final String NAME_FLAG_0 = "0";

    /** 氏名（カナ）フラグ「1：活性」 */
    public static final String NAME_KANA_FLAG_1 = "1";

    /** 氏名（カナ）フラグ「0：非活性」 */
    public static final String NAME_KANA_FLAG_0 = "0";

    /** メールアドレスフラグ「1：活性」 */
    public static final String MAIL_FLAG_1 = "1";

    /** メールアドレスフラグ「0：非活性」 */
    public static final String MAIL_FLAG_0 = "0";

    /** 電話番号フラグ「1：活性」 */
    public static final String TEL_NO_1 = "1";

    /** 電話番号フラグ「0：非活性」 */
    public static final String TEL_NO_0 = "0";

    /** 権限グループフラグ「1：活性」 */
    public static final String KGGRP_FLAG_1 = "1";

    /** 権限グループフラグ「0：非活性」 */
    public static final String KGGRP_FLAG_0 = "0";

    /** アクターフラグ「1：活性」 */
    public static final String ACTOR_FLAG_1 = "1";

    /** アクターフラグ「0：非活性」 */
    public static final String ACTOR_FLAG_0 = "0";

    /** 会社区分フラグ「1：活性」 */
    public static final String KAISHA_KBN_FLAG_1 = "1";

    /** 会社区分フラグ「0：非活性」 */
    public static final String KAISHA_KBN_FLAG_0 = "0";

    /** 選択フラグ 「2：選択（複数）」 */
    public static final String CHOOSE_FLG_2 = "2";

    /** 登録プログラム 「OSA_PRG：TR押え画面の登録プログラムＩＤ」 */
    public static final String OSA_PRG = "OSA_PRG";

    /** 押え内容 = 相談× */
    public static final String OSAENIYO_SDX = "相談×";

    /** 押え内容 = 本人× */
    public static final String OSAENIYO_HJX = "本人×";

    /** 押え内容 = 独自活動× */
    public static final String OSAENIYO_DJKDX = "独自活動×";

    /** 記号 "↑" */
    public static final String SYMBOL_11 = "↑";

    /** 記号 "｜" */
    public static final String SYMBOL_12 = "｜";

    /** 記号 "↓" */
    public static final String SYMBOL_13 = "↓";

    /** 記号 "（○）" */
    public static final String SYMBOL_14 = "（○）";

    /** 記号 "（ア）" */
    public static final String SYMBOL_15 = "（ア）";

    /** 記号 "（ヨ）" */
    public static final String SYMBOL_16 = "（ヨ）";

    /** 記号 "（カ）" */
    public static final String SYMBOL_17 = "（カ）";

    /** 記号 "（ジ）" */
    public static final String SYMBOL_18 = "（ジ）";

    /** 記号 "×" */
    public static final String SYMBOL_X = "×";

    /** 記号 "△" */
    public static final String SYMBOL_21 = "△";

    /** 記号 "□" */
    public static final String SYMBOL_22 = "□";

    /** 記号 "▽" */
    public static final String SYMBOL_23 = "▽";

    /** 記号 "○" */
    public static final String SYMBOL_24 = "○";

    /** 記号 "ア" */
    public static final String SYMBOL_25 = "ア";

    /** 記号 "ヨ" */
    public static final String SYMBOL_26 = "ヨ";

    /** 記号 "カ" */
    public static final String SYMBOL_27 = "カ";

    /** 記号 "ジ" */
    public static final String SYMBOL_28 = "ジ";

    /** 記号 "▲" */
    public static final String SYMBOL_31 = "▲";

    /** 記号 "■" */
    public static final String SYMBOL_32 = "■";

    /** 記号 "▼" */
    public static final String SYMBOL_33 = "▼";

    /** 記号 "●" */
    public static final String SYMBOL_34 = "●";

    /** 記号 "ア処" */
    public static final String SYMBOL_35 = "ア処";

    /** 記号 "養" */
    public static final String SYMBOL_36 = "養";

    /** 記号 "開" */
    public static final String SYMBOL_37 = "開";

    /** 記号 "自" */
    public static final String SYMBOL_38 = "自";

    /** ソート順  = 「1：日程順表示ソート」 */
    public static final String NTJ_SORTJYUN = "1";

    /** ソート順  = 「2：申請順表示ソート」 */
    public static final String SSJ_SORTJYUN = "2";

    /** 日程詳細履歴作成フラグ ：0：作成不要 */
    public static final String KHNINFO_RTESYS_RRK_0 = "0";

    /** 添付ファイル履歴作成フラグ ：0：作成不要 */
    public static final String TNP_FILE_RRKSKS_FLG_0 = "0";

    /** その他社内関係者履歴作成フラグ ：0：作成不要 */
    public static final String SNT_SYNKNKSY_RRKSKS_FLG_0 = "0";

    /** 研修本押えＴＲ履歴作成フラグ ：0：作成不要 */
    public static final String KNSY_MTOSE_TRRRK_SKS_FLG_0 = "0";

    /** 変更履歴作成フラグ ：0：作成不要 */
    public static final String HNK_RRK_SKS_FLG_0 = "0";

    /** 変更履歴作成フラグ ：1：作成要 */
    public static final String HNK_RRK_SKS_FLG_1 = "1";

    /** 基本情報履歴作成フラグ ：0：作成不要 */
    public static final String KHN_INFO_RRK_SKS_FLG_0 = "0";

    /** 基本情報履歴作成フラグ ：1：作成要 */
    public static final String KHN_INFO_RRK_SKS_FLG_1 = "1";

    /** コピー区分：押え情報引き継ぐ */
    public static final String COPY_KBN_OSEJHHKTK = "1";

    /** コピー区分：押え情報引き継がない */
    public static final String COPY_KBN_OSEJHHKTK_NSI = "2";

    /** システム番号管理区分 10：基本情報No */
    public static final String KR_KBN_KHNINFONO = "10";

    /** システム番号管理区分 30：アンケートNO */
    public static final String KR_KBN_ATKNO = "30";

    /** システム番号管理区分 40：報告書No */
    public static final String KR_KBN_HKKSYONO = "40";

    /** 個人情報区分：「0：個人情報なし」 */
    public static final String KOJIN_HYOUHOU_KBN_NASI = "0";

    /** 個人情報区分：「1：個人情報あり」 */
    public static final String KOJIN_HYOUHOU_KBN_ARI = "1";

    /** 顧客非公開フラグ：「0：check」 */
    public static final String CHECK_0 = "0";

    /** 顧客非公開フラグ：「1：checkなし」 */
    public static final String CHECK_1 = "1";

    /** 伝票NO */
    public static final String DENNO = "伝票No";

    /** 宅急便伝票No */
    public static final String TBINDENNO = "宅急便伝票No";

    /** 豆箱数量 */
    public static final String MAMEHAKOSU = "豆箱数量";

    /** 小箱数量 */
    public static final String KOHAKOSU = "小箱数量";

    /** 中箱数量 */
    public static final String TYUHAKOSU = "中箱数量";

    /** 大箱数量 */
    public static final String DAIHAKOSU = "大箱数量";

    /** その他数量 */
    public static final String HOKAHAKOSU = "その他数量";

    /** 特殊資料Ｎｏ */
    public static final String SPESIRYONO = "特殊資料No";

    /** 梱包情報_豆箱 */
    public static final String MAMEPACKINFO = "梱包情報_豆箱";

    /** 梱包情報_小箱 */
    public static final String KOPACKINFO = "梱包情報_小箱";

    /** 梱包情報_中箱 */
    public static final String TYUPACKINFO = "梱包情報_中箱";

    /** 梱包情報_大箱 */
    public static final String DAIPACKINFO = "梱包情報_大箱";

    /** 梱包情報_封筒 */
    public static final String FUTOPACKINFO = "梱包情報_封筒";

    /** 梱包情報_その他 */
    public static final String HOKAPACKINFO = "梱包情報_その他";

    /** 作業完了フラグ */
    public static final String SGYKNRYFLG = "作業完了フラグ";

    /** 納品予定日 */
    public static final String DELIVERYDAY = "納品予定日";

    /** 発送完了日 */
    public static final String SENDDAY = "発送完了日";

    /** 更新者 */
    public static final String UPDATER = "更新者";

    /** 特別発送手配情報．登録区分 「2：本登録」 */
    public static final String INSERTDIVIDE_2 = "2";

    /** 特別発送手配情報．登録区分 「3：取消」 */
    public static final String INSERTDIVIDE_3 = "3";

    /** 呼び出す元画面区分 「１：発送・サーベイ管理＜資料手配＞」 */
    public static final String YOBIDASUKUBUN_1 = "1";

    /** 呼び出す元画面区分 「２：特別発送一覧」 */
    public static final String YOBIDASUKUBUN_2 = "2";

    /** 削除フラグ 「0：未削除」 */
    public static final String DELFLAG_0 = "0";

    /** 削除フラグ 「1：削除」 */
    public static final String DELFLAG_1 = "1";

    /** 資料パック区分 : P：パック */
    public static final String SIRYO_PACK_KBN_PACK = "P";

    /** 資料パック区分 : S：資料 */
    public static final String SIRYO_PACK_KBN_SIRYO = "S";

    /** システム番号管理区分 20：くくりNO */
    public static final String SYS_NUM_KBN_KKRNO = "20";

    /** 遷移ボタン区分 : 1：資料発送手配 */
    public static final String SNI_BTN_KBN_SIRYOHSTH = "1";

    /** 遷移ボタン区分 : 2：サーベイ手配 */
    public static final String SNI_BTN_KBN_SBTH = "2";

    /** 遷移ボタン区分 : 3：サーベイ事前伝票 */
    public static final String SNI_BTN_KBN_SBJZNDNPY = "3";

    /** 遷移ボタン区分 : 4：サーベイ事前伝票以外 */
    public static final String SNI_BTN_KBN_SBJZNDNPYG = "4";

    /** DB存在フラグ : 0:存在なし */
    public static final String DB_SNZ_FLAG_SNZNS = "0";

    /** DB存在フラグ : 1：存在 */
    public static final String DB_SNZ_FLAG_SNZ = "1";

    /** ＴＲ個人情報用表示区分(表示) */
    public static final String HYOUJI_KUBUN_HYOUJI = "1";

    /** ＴＲ個人情報用ログイン区分(可) */
    public static final String LOGIN_KUBUN_KA = "0";

    /** ＴＲ個人情報新規登録ボタン押下用(0：無効) */
    public static final String SINKI_FLG = "0";

    /** ＴＲ個人情報新規反映、選択ボタン押下用(0：無効) */
    public static final String SEARCH_FLG = "0";

    /** 日付フォーマット：yyyy/MM/dd */
    public static final String DATE_FORMAT_YYYYMMDD = "yyyy/MM/dd";

    /** 遷移元画面区分  = 「1：基本情報変更画面から来た場合」 */
    public static final String SENYIGAMENKUFEN_HNKIGAMEN = "1";

    /** 遷移元画面区分  = 「2：ＴＲ押え画面から来た場合」 */
    public static final String SENYIGAMENKUFEN_TROSA = "2";

    /** 遷移元画面区分  = 「3：グロナビから来た場合（ポップアップ）」 */
    public static final String SENYIGAMENKUFEN_GOLONABI = "3";

    /** スケジュール内容の状態  = 「0：ラベル」 */
    public static final String SKEJURONAYO_NABER = "0";

    /** スケジュール内容の状態  = 「1：リンク」 */
    public static final String SKEJURONAYO_LING = "1";

    /** 遷移元区分  = 「1：TR押え画面」 */
    public static final String SENYIGENKUBUN_TROSA = "1";

    /** 遷移元区分  = 「2：変更依頼画面」 */
    public static final String SENYIGENKUBUN_HNKIR = "2";

    /** 処理区分  = 3：TR日単位情報リストで変更前情報引き継ぎTR日単位情報を再設定する場合 */
    public static final String SHORIKBN_TR_3 = "3";

    /** 処理区分  = 4：TR日単位情報リストで押え日程ベースにTR日単位情報を再設定する場 */
    public static final String SHORIKBN_TR_4 = "4";

    /** 変更可否フラグ  = 0：変更不可 */
    public static final String EDIT_ABE_FLG_NO = "0";

    /** 変更可否フラグ  = 1：変更可能 */
    public static final String EDIT_ABE_FLG_YES = "1";

    /** アクセス種類 = http */
    public static final String STR_HTTP = "http";

    /** アクセス種類 = https */
    public static final String STR_HTTPS = "https";

    /** HTTPSアクセスURL */
    public static final String STR_HTTPS_URL = "property.https.url";

    /** J：事前伝票 */
    public static final String JZ_DEN = "J";

    /** S：サーベイ事前伝票 */
    public static final String S_JZ_DEN = "S";

    /** K：研修伝票 */
    public static final String KS_DEN = "K";

    /** 51：サーベイ伝票NO */
    public static final String S_DEN_NO = "51";

    /** 50：研修伝票NO */
    public static final String KS_DEN_NO = "50";

    /** L201検索結果有無Flag 1:有 */
    public static final String KS_KK_YM_FLAG_Y = "1";

    /** L201検索結果有無Flag 0:無 */
    public static final String KS_KK_YM_FLAG_M = "0";

    /** L201_04選択を選定するパーラー 1:選定した */
    public static final String STK_PARA_ST = "1";

    /** リストサイズ 0 */
    public static final int LISTSIZE_ZERO = 0;

    /** イレギュラー区分 0：申請 */
    public static final String IRRKB_SS = "0";

    /** イレギュラー区分 1：受付 */
    public static final String IRRKB_UKTK = "1";

    /** イレギュラー区分 2：申請キャンセル */
    public static final String IRRKB_SSCANCEL = "2";

    /** 選択可否フラグ 1：活性 */
    public static final String STKKHFLG_K = "1";

    /** 選択可否フラグ 0：非活性 */
    public static final String STKKHFLG_H = "0";

    /** 操作フラグ  = update */
    public static final String SUS_FLG_UPDATE = "update";

    /** 背景色設定  = ０：デフォルト */
    public static final String BACKGROUND_SET_DEFAULT = "0";

    /** 背景色設定  = １：薄ピンク */
    public static final String BACKGROUND_SET_PINK = "1";

    /** 伝票種別ラジオボタン ＝ 「K：研修伝票」 */
    public static final String DNPYU_SHBTS_K_KENSHU = "K";

    /** 伝票種別ラジオボタン ＝ 「J：事前伝票」 */
    public static final String DNPYU_SHBTS_J_JIZENN = "J";

    /** 伝票種別コード＝「S：サーベイ事前伝票」 */
    public static final String DNPYU_SHBTS_S_SABEIJIZENN = "S";

    /** サーベイフラグ ＝ 「０：なし」 */
    public static final String SABEI_FLAG_NONE = "0";

    /** サーベイフラグ ＝ 「１：あり」 */
    public static final String SABEI_FLAG_HAVE = "1";

    /** ロックフラグ ＝ 「0：未ロック」 */
    public static final String LOCK_FLG_NO = "0";

    /** ロックフラグ ＝ 「1：ロック済み」 */
    public static final String LOCK_FLG_YES = "1";

    /** 1：都道府県 */
    public static final String TODOUFUKENN = "1";

    /** 遷移ボタン区分 : 5：サーベイ事前伝票（301） */
    public static final String SNI_BTN_KBN_SBJZNDNPY_301 = "5";

    /** 遷移ボタン区分 : 6：サーベイ事前伝票以外（301） */
    public static final String SNI_BTN_KBN_SBJZNDNPYG_301 = "6";

    /** 遷移ボタン区分 : 7：サーベイ事前伝票（401） */
    public static final String SNI_BTN_KBN_SBJZNDNPY_401 = "7";

    /** 遷移ボタン区分 : 8：サーベイ事前伝票以外（401） */
    public static final String SNI_BTN_KBN_SBJZNDNPYG_401 = "8";

    /** チェックボックス  = 「0：チェックなし」 */
    public static final String CHECKBOX_UNCHECK = "0";

    /** チェックボックス  = 「1：チェックあり」 */
    public static final String CHECKBOX_CHECKED = "1";

    /** 顧客コード_法人   000000 */
    public static final String KKYK_HJN_CD = "000000";

    /** 顧客コード_拠点   401 */
    public static final String KKYK_KYTN_CD = "401";

    /** 商品コード   本人× */
    public static final String HNB_SHN_CD = "本人×";

    /** 商品コード   相談× */
    public static final String SDB_SHN_CD = "相談×";

    /** 商品コード   独自活動× */
    public static final String DJB_SHN_CD = "独自活動×";

    /** システム番号管理区分 80：スケジュールNo */
    public static final String KR_KBN_SCHENO = "80";

    /** システム番号管理区分 70：ライセンス管理NO */
    public static final String KR_KBN_LSSKANRINO = "70";

    /** トレーナー数 0 */
    public static final String TRSU_0 = "0";

    /** 所感有フラグ 0 */
    public static final String SYOKAN_UM_FLG_0 = "0";

    /** 報告書ファイル顧客公開フラグ 0 */
    public static final String HKKS_KKYKKOKAI_FLG_0 = "0";

    /** 顧客非公開フラグ 0 */
    public static final String KKYKNONKOKAI_FLG_0 = "0";

    /** 変更依頼中フラグ 0 */
    public static final String UPDLRATYU_FLG_0 = "0";

    /** 費用負担組織設定フラグ 0 */
    public static final String HIFTSS_FLG_0 = "0";

    /** サブTRフラグ 0 */
    public static final String SUB_TR_FLG_0 = "0";

    /** 3.5H以下フラグ 0 */
    public static final String SJK_FLG_0 = "0";

    /** 稼働統合フラグ 0 */
    public static final String KD_FLG_0 = "0";

    /** 曜日 : 月 */
    public static final String WEEK_GETSU = "月";

    /** 曜日 : 火 */
    public static final String WEEK_KA = "火";

    /** 曜日 : 水 */
    public static final String WEEK_SUI = "水";

    /** 曜日 : 木 */
    public static final String WEEK_MOKU = "木";

    /** 曜日 : 金 */
    public static final String WEEK_KIN = "金";

    /** 曜日 : 土 */
    public static final String WEEK_DO = "土";

    /** 曜日 : 日 */
    public static final String WEEK_NICHI = "日";

    /** 遷移元画面区分 10 */
    public static final String GMNSENNIKBN_10 = "10";

    /** 遷移元画面区分 20 */
    public static final String GMNSENNIKBN_20 = "20";

    /** 遷移元画面区分 30 */
    public static final String GMNSENNIKBN_30 = "30";

    /** 画面モードID 10 */
    public static final String GMNID_10 = "10";

    /** 画面モードID 11 */
    public static final String GMNID_11 = "11";

    /** 画面モードID 21 */
    public static final String GMNID_21 = "21";

    /** 画面モードID 22 */
    public static final String GMNID_22 = "22";

    /** 画面モードID 23 */
    public static final String GMNID_23 = "23";

    /** 画面モードID 24 */
    public static final String GMNID_24 = "24";

    /** 画面モードID 31 */
    public static final String GMNID_31 = "31";

    /** 画面モードID 32 */
    public static final String GMNID_32 = "32";

    /** アクターコード 10 */
    public static final String ACTORCODE_10 = "10";

    /** アクターコード 20 */
    public static final String ACTORCODE_20 = "20";

    /** アクターコード 30 */
    public static final String ACTORCODE_30 = "30";

    /** アクターコード 40 */
    public static final String ACTORCODE_40 = "40";

    /** アクターコード 50 */
    public static final String ACTORCODE_50 = "50";

    /** アクターコード 60 */
    public static final String ACTORCODE_60 = "60";

    /** アクターコード 70 */
    public static final String ACTORCODE_70 = "70";

    /** アクターコード 80 */
    public static final String ACTORCODE_80 = "80";

    /** アクターコード C10 */
    public static final String ACTORCODE_C10 = "C10";

    /** アクターコード C20 */
    public static final String ACTORCODE_C20 = "C20";

    /** 会社区分コード 010 */
    public static final String KAISHA_KHN_CD_010 = "010";

    /** 会社区分コード 020 */
    public static final String KAISHA_KHN_CD_020 = "020";

    /** 会社区分コード 030 */
    public static final String KAISHA_KHN_CD_030 = "030";

    /** 会社区分コード 040 */
    public static final String KAISHA_KHN_CD_040 = "040";

    /** 会社区分コード 050 */
    public static final String KAISHA_KHN_CD_050 = "050";

    /** 会社区分コード 060 */
    public static final String KAISHA_KHN_CD_060 = "060";

    /** 会社区分コード 070 */
    public static final String KAISHA_KHN_CD_070 = "070";

    /** 会社区分コード 080 */
    public static final String KAISHA_KHN_CD_080 = "080";

    /** 会社区分コード 999 */
    public static final String KAISHA_KHN_CD_999 = "999";

    /** 採点依頼NO */
    public static final String SATEIRAINO = "採点依頼NO";

    /** 本登録の情報 */
    public static final String HONTOROKUNOJOHO = "本登録の情報";

    /** TR名以外の情報 */
    public static final String TRMEIIGAIJOHO = "TR名以外の情報";

    /** TR名項目の情報 */
    public static final String TRMEIKOMOKUJOHO = "TR名項目の情報";

    /** 物流伝票（サーベイ用） */
    public static final String BUTURYUDEN = "物流伝票（サーベイ用）";

    /** 901:R-CAP */
    public static final String RCAP901 = "901";

    /** 物流伝票_採点手配情報 */
    public static final String SAITENTEHAIJOHO = "物流伝票_採点手配情報";

    /** 受付No */
    public static final String UKETUKENO = "01";

    /** YSD */
    public static final String STR_YSD = "YSD";

    /** 、 */
    public static final String COMMA = "、";

    /** 「0：仮登録」 */
    public static final String TRKKBN_0 = "0";

    /** 「2：本登録」 */
    public static final String TRKKBN_2 = "2";

    /** 「3：取消」 */
    public static final String TRKKBN_3 = "3";

    /** 「4：削除」 */
    public static final String TRKKBN_4 = "4";

    /** 「0：仮登録」 */
    public static final String TRKKBNAME_0 = "仮登録";

    /** 「2：本登録」 */
    public static final String TRKKBNAME_2 = "本登録";

    /** 「3：取消」 */
    public static final String TRKKBNAME_3 = "取消";

    /** 「4：削除」 */
    public static final String TRKKBNAME_4 = "削除";

    /** 「01:YSD」 */
    public static final String SAKI_01 = "01";

    /** 「02:G戻し」 */
    public static final String SAKI_02 = "02";

    /** ＴＲ発送 */
    public static final String IRAIJIKOU_TEN = "10";

    /** 個別梱包 */
    public static final String IRAIJIKOU_TWN = "20";

    /** バインダー綴じ */
    public static final String IRAIJIKOU_THR = "30";

    /** 公開（事前） */
    public static final String IRAIJIKOU_FOU = "40";

    /** 公開（その他） */
    public static final String IRAIJIKOU_FI = "50";

    /** その他 */
    public static final String IRAIJIKOU_SIX = "60";

    /** 特別発送手配区分：「１：発送・サーベイ管理＜資料手配＞」 */
    public static final String TRYOHSTH_KBN_ONL = "1";

    /** 特別発送手配区分：「２：特別発送一覧」 */
    public static final String TRYOHSTH_KBN_TWL = "2";

    /** 一括ダウンロードボタン区分 : 「0：個人情報なしファイル」 */
    public static final String DOWNLOAD_KBN_NS = "0";

    /** 一括ダウンロードボタン区分 : 「1：個人情報ありファイル」 */
    public static final String DOWNLOAD_KBN_AL = "1";

    /** 選択 = 「0：未選択」 */
    public static final String CHOOSE_FLAG_OFF = "0";

    /** 選択 = 「1：選択」 */
    public static final String CHOOSE_FLAG_ON = "1";

    /** 変更箇所 1：ステータス */
    public static final String HENKOU_KASLYO1 = "1";

    /** 変更箇所 2：顧客非公開 */
    public static final String HENKOU_KASLYO2 = "2";

    /** 変更箇所 3：営業担当者 */
    public static final String HENKOU_KASLYO3 = "3";

    /** 変更箇所 4：納品スタッフ名 */
    public static final String HENKOU_KASLYO4 = "4";

    /** 変更箇所 5：顧客担当者_郵便番号 */
    public static final String HENKOU_KASLYO5 = "5";

    /** 変更箇所 6：顧客担当者_都道府県 */
    public static final String HENKOU_KASLYO6 = "6";

    /** 変更箇所 7：顧客担当者_所在地 */
    public static final String HENKOU_KASLYO7 = "7";

    /** 変更箇所 8：顧客担当者_会社名 */
    public static final String HENKOU_KASLYO8 = "8";

    /** 変更箇所 9：顧客担当者_部署名 */
    public static final String HENKOU_KASLYO9 = "9";

    /** 変更箇所 10：顧客担当者_氏名 */
    public static final String HENKOU_KASLYO10 = "10";

    /** 変更箇所 11：顧客担当者_電話番号 */
    public static final String HENKOU_KASLYO11 = "11";

    /** 変更箇所 12：実践ナビ */
    public static final String HENKOU_KASLYO12 = "12";

    /** 変更箇所 13：研修日程 */
    public static final String HENKOU_KASLYO13 = "13";

    /** 変更箇所 14：研修詳細日程 */
    public static final String HENKOU_KASLYO14 = "14";

    /** 変更箇所 15：商品 */
    public static final String HENKOU_KASLYO15 = "15";

    /** 変更箇所 16：研修名 */
    public static final String HENKOU_KASLYO16 = "16";

    /** 変更箇所 17：トレーナー数 */
    public static final String HENKOU_KASLYO17 = "17";

    /** 変更箇所 18：トレーナー名 */
    public static final String HENKOU_KASLYO18 = "18";

    /** 変更箇所 19：受講者人数 */
    public static final String HENKOU_KASLYO19 = "19";

    /** 変更箇所 20：グループ数 */
    public static final String HENKOU_KASLYO20 = "20";

    /** 変更箇所 21：オブザーブ人数（御社） */
    public static final String HENKOU_KASLYO21 = "21";

    /** 変更箇所 22：オブザーブ人数（RMS） */
    public static final String HENKOU_KASLYO22 = "22";

    /** 変更箇所 23：会場名 */
    public static final String HENKOU_KASLYO23 = "23";

    /** 変更箇所 24：会場_郵便番号 */
    public static final String HENKOU_KASLYO24 = "24";

    /** 変更箇所 25：会場_所在地都道府県 */
    public static final String HENKOU_KASLYO25 = "25";

    /** 変更箇所 26：会場_所在地 */
    public static final String HENKOU_KASLYO26 = "26";

    /** 変更箇所 27：会場_電話番号 */
    public static final String HENKOU_KASLYO27 = "27";

    /** 変更箇所 28：宿泊(TR)_前泊 */
    public static final String HENKOU_KASLYO28 = "28";

    /** 変更箇所 29：宿泊(TR)_中泊 */
    public static final String HENKOU_KASLYO29 = "29";

    /** 変更箇所 30：アンケート要否 */
    public static final String HENKOU_KASLYO30 = "30";

    /** 変更箇所 31：アンケート種類 */
    public static final String HENKOU_KASLYO31 = "31";

    /** 変更箇所 32：アンケート情報（個人情報なしファイル） */
    public static final String HENKOU_KASLYO32 = "32";

    /** 変更箇所 33：アンケート情報（個人情報ありファイル） */
    public static final String HENKOU_KASLYO33 = "33";

    /** 変更箇所 34：所感要否 */
    public static final String HENKOU_KASLYO34 = "34";

    /** 変更箇所 35：所感不要理由 */
    public static final String HENKOU_KASLYO35 = "35";

    /** 変更箇所 36：所感情報（個人情報ありファイル） */
    public static final String HENKOU_KASLYO36 = "36";

    /** 変更箇所 37：報告書（個人情報なしファイル） */
    public static final String HENKOU_KASLYO37 = "37";

    /** 変更箇所 38：報告書（個人情報ありファイル） */
    public static final String HENKOU_KASLYO38 = "38";

    /** 変更箇所 39：備考欄 */
    public static final String HENKOU_KASLYO39 = "39";

    /** 変更箇所 40：備考欄（TR共有） */
    public static final String HENKOU_KASLYO40 = "40";

    /** 変更箇所 41：備考欄（社内限定 ） */
    public static final String HENKOU_KASLYO41 = "41";

    /** 変更箇所 42：その他社内関係者 */
    public static final String HENKOU_KASLYO42 = "42";

    /** 変更箇所 43：ファイル添付欄（備品・レイアウト案内ファイル） */
    public static final String HENKOU_KASLYO43 = "43";

    /** 変更箇所 44：ファイル添付欄（プログラムファイル） */
    public static final String HENKOU_KASLYO44 = "44";

    /** 変更箇所 45：ファイル添付欄（その他個人情報なしファイル */
    public static final String HENKOU_KASLYO45 = "45";

    /** 変更箇所 46：ファイル添付欄（その他個人情報ありファイル） */
    public static final String HENKOU_KASLYO46 = "46";

    /** 変更箇所 47：ファイル添付欄_ＲＭＳ内共有（資料一覧ファイル） */
    public static final String HENKOU_KASLYO47 = "47";

    /** 変更箇所 48：ファイル添付欄_ＲＭＳ内共有（その他個人情報なしファイル） */
    public static final String HENKOU_KASLYO48 = "48";

    /** 変更箇所 49：ファイル添付欄_ＲＭＳ内共有（その他個人情報ありファイル） */
    public static final String HENKOU_KASLYO49 = "49";

    /** 表示フラグ１ */
    public static final String HYOJI_FLAG1 = "1";

    /** 表示フラグ2 */
    public static final String HYOJI_FLAG2 = "2";

    /** 表示フラグ3 */
    public static final String HYOJI_FLAG3 = "3";

    /** 表示フラグ4 */
    public static final String HYOJI_FLAG4 = "4";

    /** 表示フラグ5 */
    public static final String HYOJI_FLAG5 = "5";

    /** 表示フラグ6 */
    public static final String HYOJI_FLAG6 = "6";

    /** デフォールトドット */
    public static final String KEY_DOT = ".";

    /** デフォールトコンテントタイプの前 */
    public static final String KEY_CONTENTTYPE_PREFIX_IMAGE = "image/";

    /** デフォールトコンテントタイプの後 */
    public static final String KEY_CONTENTTYPE_SUFFIX_JPG = "jpg";

    /** 関係する全基本情報検索区分 0：検索しない */
    public static final String BASIC_INFO_SRCH_SORT_NO = "0";

    /** 関係する全基本情報検索区分 1：検索 */
    public static final String BASIC_INFO_SRCH_SORT_OK = "1";

    /** 日付連結文字 */
    public static final String HIDUKE_STR = "1";

    /** 遷移元画面区分：01 */
    public static final String KKYKHJNCD_01 = "01";

    /** 遷移元画面区分：02 */
    public static final String KKYKHJNCD_02 = "02";

    /** 遷移元画面区分：03 */
    public static final String KKYKHJNCD_03 = "03";

    /** 「遷移元画面区分」が1：201 */
    public static final String KKYKHJNCD_1 = "1";

    /** 「遷移元画面区分」が2：406 */
    public static final String KKYKHJNCD_2 = "2";

    /** 「遷移元画面区分」が3：407 */
    public static final String KKYKHJNCD_3 = "3";

    /** 前処理ID (他画面から、画面遷移初期表示) : 00 */
    public static final String BEFORE_SYORI_ID_00 = "00";

    /** 前処理ID セット追加 : 01 */
    public static final String BEFORE_SYORI_ID_01 = "01";

    /** 前処理ID 行追加 : 02 */
    public static final String BEFORE_SYORI_ID_02 = "02";

    /** 前処理ID 行削除 : 03 */
    public static final String BEFORE_SYORI_ID_03 = "03";

    /** 前処理ID ファイル添付 : 04 */
    public static final String BEFORE_SYORI_ID_04 = "04";

    /** 前処理ID 一括アップロード : 05 */
    public static final String BEFORE_SYORI_ID_05 = "05";

    /** 前処理ID 登録 : 06 */
    public static final String BEFORE_SYORI_ID_06 = "06";

    /** 前処理ID 一括ダウンロード : 07 */
    public static final String BEFORE_SYORI_ID_07 = "07";

    /** 前処理ID ファイルダウンロード : 08 */
    public static final String BEFORE_SYORI_ID_08 = "08";

    /** 前処理ID 閉じる : 09 */
    public static final String BEFORE_SYORI_ID_09 = "09";

    /** 前処理ID ファイル削除 : 10 */
    public static final String BEFORE_SYORI_ID_10 = "10";

    /** 前処理ID ファイル選択 : 11 */
    public static final String BEFORE_SYORI_ID_11 = "11";

    /** 前処理ID プログラムファイル(基本情報)ダウンロード : 12 */
    public static final String BEFORE_SYORI_ID_12 = "12";

    /** 前処理ID 特資差替申請 : 13 */
    public static final String BEFORE_SYORI_ID_13 = "13";

    /** 検索フラグ : 0：検索なし */
    public static final String SEARCHFLAG_NL = "0";

    /** 検索フラグ : 1：検索 */
    public static final String SEARCHFLAG_AR = "1";

    /** 個別設定 「１：チェックする」 */
    public static final String SENTAKU = "1";

    /** 個別設定 「0：チェックしない」 */
    public static final String SENTAKU_OFF = "0";

    /** 表示フラグ 「1：表示なし」 */
    public static final String HYJFLG_NS = "1";

    /** 表示フラグ 「0：表示」 */
    public static final String HYJFLG_ARI = "0";

    /** ファイル出力状態 1：未出力 */
    public static final String FILEOUTSTAT_ON = "1";

    /** ファイル出力状態 2：出力済 */
    public static final String FILEOUTSTAT_OFF = "2";

    /** ファイル出力状態 1：未出力 */
    public static final String FILEOUTSTAT_ONSTR = "未出力";

    /** ファイル出力状態 2：出力済 */
    public static final String FILEOUTSTAT_OFFSTR = "出力済";

    /** 「1：検索結果一覧.存在フラグ」 */
    public static final String SONNZAIFLG_1 = "1";

    /** 1：前日へリンク押下 */
    public static final String SENJICILING = "1";

    /** 2：3時間前へリンク押下 */
    public static final String SANJISENLING = "2";

    /** 3：3時間後へリンク押下 */
    public static final String SANJIATOLING = "3";

    /** 4：翌日へリンク押下 */
    public static final String LIRILING = "4";

    /** 「支払バッチ実行ステータス」10：未実行 */
    public static final String SHRJIKKOSTAT_TEN = "10";

    /** 「支払バッチ実行ステータス」20：実行依頼中」の場合 */
    public static final String SHRJIKKOSTAT_TWENTY = "20";

    /** 「支払バッチ実行ステータス」30：支払バッチ起動中 */
    public static final String SHRJIKKOSTAT_THIRTY = "30";

    /** 「支払バッチ実行ステータス」40：支払バッチ正常終了 */
    public static final String SHRJIKKOSTAT_FORTY = "40";

    /** 「支払バッチ実行ステータス」50：支払バッチ異常終了 */
    public static final String SHRJIKKOSTAT_FIFTY = "50";

    /** アップロードされた状態 2：リンク(アップロードされた) */
    public static final String UPLOAD_STATUS = "2";

    /** アップロードされた状態 String 1：テキスト */
    public static final String UPLOAD_STATUS_1 = "1";

    /** ファイル削除フラグ 1 */
    public static final String FILEDELETEFLG_1 = "1";

    /** ファイル削除フラグ 0：未削除 */
    public static final String FILEDELETEFLG_MSKJ = "0";

    /** ファイル新規フラグ 0：既存 */
    public static final String FILEADDEFLG_KZ = "0";

    /** ファイル新規フラグ １：新規 */
    public static final String FILEADDEFLG_SK = "1";

    /** 遷移元区分  = 「20：特別発送手配」 */
    public static final String SENNIMOTOKUBN_TFTP = "20";

    /** 「添付アップロードフラグ」が"1：添付" */
    public static final String TFUPLOADFLG_TF = "1";

    /** 「添付アップロードフラグ」が"2：アップロード" */
    public static final String TFUPLOADFLG_UL = "2";

    /** お知らせ分類コード String 「027：採点管理」 */
    public static final String SRSBR_CD_STKR = "027";

    /** ファイル添付用セットNO 0 */
    public static final String FILETFY_SETNO_0 = "0";

    /** コメント更新フラグ = 0 */
    public static final String CMT_UPDAE_FLG_0 = "0";

    /** コメント更新フラグ = 1 */
    public static final String CMT_UPDAE_FLG_1 = "1";

    /** 条件項目名：SEQ_FILE_NO */
    public static final String SEQ_FILE_NO = "SEQ_FILE_NO";

    /** 【置換文字列】：対象の資料 */
    public static final String OP_SRYO = "対象の資料";

    /** 【置換文字列】：基本情報のプログラムファイル */
    public static final String KHNINFO_PRGFILE = "基本情報のプログラムファイル";

    /** 【置換文字列】：指定したセットNoと行数 */
    public static final String SITEI_SETNO_GYOUSUU = "指定したセットNoと行数";

    /** 登録・更新区分 ＝ 「1：登録」 */
    public static final String INSERT_UPDATE_KBN1 = "1";

    /** 登録・更新区分 ＝ 「0：更新」 */
    public static final String INSERT_UPDATE_KBN0 = "0";

    /** 商品区分 ＝ 「2：標準」 */
    public static final String SHN_KBN_HYOJUN = "2";

    /** セットNOのpattern */
    public static final String SETNO_PATTERN = "000";

    /** 1：付随の場合 0件の場合「最大セットNO」="F000" */
    public static final String F000 = "F000";

    /** 2：特資一式’の場合 0件の場合「最大セットNO」="T000" */
    public static final String T000 = "T000";

    /** 3：特資差替の場合 0件の場合「最大セットNO」="S000" */
    public static final String S000 = "S000";

    /** 一括アップロードフラグ :"1" */
    public static final String IKOUPLOADFLG_01 = "1";

    /** 一括アップロードフラグ :"0" */
    public static final String IKOUPLOADFLG_00 = "0";

    /** 1：付随の場合 セットNOの前1桁"F" */
    public static final String SETNO_F = "F";

    /** 2：特資一式’の場合 セットNOの前1桁"T" */
    public static final String SETNO_T = "T";

    /** 3：特資差替の場合 セットNOの前1桁"S" */
    public static final String SETNO_S = "S";

    /** 置換文字列】："NO" */
    public static final String NO = "NO";

    /** 置換文字列】：「NO_MAX」 */
    public static final String NO_MAX = "100";

    /** 「画面遷移情報」．「画面ID」が"209" */
    public static final String GMNID_209 = "209";

    /** 「画面遷移情報」．「画面ID」が"210" */
    public static final String GMNID_210 = "210";

    /** 「付随特資区分」が’1：付随’ */
    public static final String FZTOKUSHIKBN_FZ = "1";

    /** 「付随特資区分」が’2：特資一式' */
    public static final String FZTOKUSHIKBN_TKSYSK = "2";

    /** 「付随特資区分」が’3：特資差替’ */
    public static final String FZTOKUSHIKBN_TKSSGE = "3";

    /** 【置換文字列】："付随セットNoの行" */
    public static final String FZ_SETNO = "付随セットNoの行";

    /** 【置換文字列】："特資一式セットNoの行" */
    public static final String TKSYJK_SETNO = "特資一式セットNoの行";

    /** 【置換文字列】："特資差替えセットNoの行" */
    public static final String TKSSGE_SETNO = "特資差替えセットNoの行";

    /** 【置換文字列】：資料情報 */
    public static final String SIRYOUJOHOU = "資料情報";

    /** 【置換文字列】：添付ファイル */
    public static final String TEPUFILE = "添付ファイル";

    /** 【置換文字列】：伝票NO */
    public static final String DEN_NO = "伝票NO";

    /** 出力完了フラグ String 0：未完了 */
    public static final String OUTKRFLG_MKR = "0";

    /** セット新規フラグ String 1：追加 */
    public static final String SETADDFLG_TIK = "1";

    /** ファイル新規フラグ String 1：追加 */
    public static final String FILEFLG_TIK = "1";

    /** 作業完了フラグ String 0：未完了 */
    public static final String SKYKRFLG_MKR = "0";

    /** 作業クリアフラグ  = 0の場合 */
    public static final String SKGCLEARFLG_0 = "0";

    /** 作業クリアフラグ  = 1の場合 */
    public static final String SKGCLEARFLG_1 = "1";

    /** 個人情報区分 String 0：個人情報なし */
    public static final String KJJHKB_NS = "0";

    /** 個人情報区分 String 1：個人情報あり */
    public static final String KJJHKB_AR = "1";

    /** String 0：押すなし */
    public static final String OS_NS = "0";

    /** String 0：チェックなし */
    public static final String CHK_NS = "0";

    /** String 1：チェック */
    public static final String CHK_YES = "1";

    /** 行追加フラグ String 0：既存 */
    public static final String GYOADDFLG_KZ = "0";

    /** 行追加フラグ String 1：追加 */
    public static final String GYOADDFLG_TIK = "1";

    /** 行削除フラグ String 1：削除 */
    public static final String GYODELFLG_SKJ = "1";

    /** 行削除フラグ String 0：未削除 */
    public static final String GYODELFLG_MSKJ = "0";

    /** 表示フラグ String 0：表示 */
    public static final String HJFLG_HJ = "0";

    /** 表示フラグ String 1：非表示 */
    public static final String HJFLG_HHJ = "1";

    /** 行新規フラグ String １：新規 */
    public static final String GSKFLG_SK = "1";

    /** NO String 1 採番処理 */
    public static final String NO_SBSR = "1";

    /** 部数 String 0 */
    public static final String BS_0 = "0";

    /** ファイル出力状態 String 1：未出力 */
    public static final String FILEOUTJYOTAI_MJTRK = "1";

    /** ファイル出力状態 String 2：出力済 */
    public static final String FILEOUTJYOTAI_JTRKZM = "2";

    /** 更新プログラム String "L209_01" */
    public static final String UPDATEPRRG_L209_01 = "L209_01";

    /** 全パス取得可能フラグ(一時変数) = 1の場合 */
    public static final String ALLPATH_TKKNFLG_1 = "1";

    /** 全パス取得可能フラグ(一時変数) = 2の場合 */
    public static final String ALLPATH_TKKNFLG_2 = "2";

    /** 資料状態更新フラグが’０：更新なし’ */
    public static final String UPDATE_NO = "0";

    /** 資料状態更新フラグが’１：更新する’ */
    public static final String UPDATE_YES = "1";

    /** 存在フラグ  = 0 */
    public static final String SONZAIFLG_0 = "0";

    /** 存在フラグ  = 1 */
    public static final String SONZAIFLG_1 = "1";

    /** 区切り */
    public static final String KANMA = ",";

    /** ログインユーザー情報のアクタ  01：営業 */
    public static final String AKTA_EIG_01 = "01";

    /** ログインユーザー情報のアクタ  02：納品スタッフ */
    public static final String AKTA_NHNMASTER_02 = "02";

    /** パターン */
    public static final String PATTERN = "0";

    /** 013：パスワード変更通知 */
    public static final String TEMPLATE_CD_013 = "013";

    /** 023：顧客ユーザID更新 */
    public static final String TEMPLATE_CD_023 = "023";

    /** 012：パスワード変更通知 */
    public static final String TEMPLATE_CD_012 = "012";

    /** テンプレート種別: 「031：ご意見・ご要望の受付」 */
    public static final String TEMPLATE_CD_031 = "031";

    /** テンプレート種別: 「011：ID通知」 */
    public static final String TEMPLATE_CD_011 = "011";

    /** 「操作フラグ」insert */
    public static final String SUSFLG_INSERT = "insert";

    /** 「操作フラグ」delete */
    public static final String SUSFLG_DELETE = "delete";

    /** 検索件数 */
    public static final String SEARCHCOUNT_START = "-1";

    /** 「置換文字列」 : "プログラムファイル" */
    public static final String MESSAGE_WORD_BUROGUURAMU = "プログラムファイル";

    /** 「置換文字列」 : "特資差替え資料No" */
    public static final String MESSAGE_WORD_SHIRYOU_NO = "特資差替え資料No";

    /** 「選択フラグ」 : "1：チェック" */
    public static final String CHOOSE_FLG_01 = "1";

    /** 「画面ID」 : "209" */
    public static final String GAMENNID_209 = "209";

    /** 「画面ID」 : "210" */
    public static final String GAMENNID_210 = "210";

    /** 「付随特資区分」: "1：付随" */
    public static final String FZTOKUSHI_KBN_01 = "1";

    /** 「付随特資区分」 : "2：特資一式" */
    public static final String FZTOKUSHI_KBN_02 = "2";

    /** 「付随特資区分」 : "3：特資差替" */
    public static final String FZTOKUSHI_KBN_03 = "3";

    /** 「作業完了フラグ」 : "1：完了" */
    public static final String SGY_KNRY_FLG_01 = "1";

    /** 「個人情報区分」 : "1：個人情報なし" */
    public static final String KJN_JOHO_KBN_01 = "1";

    /** 「個人情報区分」 : "2：個人情報あり" */
    public static final String KJN_JOHO_KBN_02 = "2";

    /** 「行削除フラグ」 : "１：削除" */
    public static final String GYO_DEL_FLG_01 = "1";

    /** 「行削除フラグ」 : 0：未削除 */
    public static final String GYO_DEL_FLG_00 = "1";

    /** 「ファイル削除フラグ」 : "１：削除" */
    public static final String FILE_DEL_FLAG_01 = "1";

    /** 「ファイル出力状態」 : "1：未出力" */
    public static final String FILE_OUT_STATUS_01 = "1";

    /** 「更新フラグ」 : "1：更新" */
    public static final String UPDATE_FLG_01 = "01";

    /** 更新区分 ＝ 「1：削除」 */
    public static final String KOUSHINN_KUBUNN_01 = "1";

    /** 処理区分 ＝ 「0：検索」 */
    public static final String SYORI_KUBUNN_00 = "0";

    /** 処理区分 ＝ 「1：追加」 */
    public static final String SYORI_KUBUNN_01 = "1";

    /** 「商品」 */
    public static final String STR_SHOHIN = "商品";

    /** 「資料」 */
    public static final String STR_SHIRYO = "資料";

    /** 検索フラグ ：(0：検索しない) */
    public static final String SECHFLG_0 = "0";

    /** 検索フラグ ：(１：検索する) */
    public static final String SECHFLG_1 = "1";

    /** 表示条件 ：(1：通常) */
    public static final String HYJJKN_1 = "1";

    /** 表示条件 ：(2：キャンセル) */
    public static final String HYJJKN_2 = "2";

    /** 課税対象外フラグ : 0課税対象) */
    public static final String KAZEITSFLG_0 = "0";

    /** PRISMデータを取得して表示 : １チェックする */
    public static final String PRISMDATEGETSHOW_1 = "1";

    /** PRISM商品チェック有無フラグ :(1：有) */
    public static final String PRISMSHNFLG_1 = "1";

    /** 押え区分コード : (99：手入力) */
    public static final String OSEKBNCD_99 = "99";

    /** 売上NO必須フラグ : (1：必須) */
    public static final String JCNOREQFLG_1 = "1";

    /** 項目NO 38 */
    public static final String ITEM_NO_38 = "38";

    /** ログインユーザー情報．アクター：（C10：顧客_管理者） */
    public static final String ACTOR_CD_C10 = "C10";

    /** ログインユーザー情報．アクター：（C20：顧客_担当者） */
    public static final String ACTOR_CD_C20 = "C20";

    /** 作成担当区分 : 印刷会社 */
    public static final String SAKUTTKBN_01 = "印刷会社";

    /** 遷移元画面区分：(1：初期表示) */
    public static final String SNIM_GMN_KBN1 = "1";

    /** 遷移元画面区分：(2：C204_パック資料マスタ登録・変更戻る */
    public static final String SNIM_GMN_KBN2 = "2";

    /** 検索済フラグ：(1：未検索) */
    public static final String SEARCH_ZIMI_FLAG1 = "1";

    /** 検索済フラグ：(2：検索済) */
    public static final String SEARCH_ZIMI_FLAG2 = "2";

    /** 無効データ：0 */
    public static final String INVALI_DATA0 = "0";

    /** 無効データ：1 */
    public static final String INVALI_DATA1 = "1";

    /** 「0：”いいえ”ボタン押下」 */
    public static final String COMFIRMFLG_ZERO = "0";

    /** 「1：”はい”ボタン押下」 */
    public static final String COMFIRMFLG_ONE = "1";

    /** 手入力フラグ 「0：自動入力」 */
    public static final String TE_INPUT_FLG_AUTO = "0";

    /** 手入力フラグ 「1：手入力」 */
    public static final String TE_INPUT_FLG_TE = "1";

    /** 画面設定区分 「Q：月次確定済み */
    public static final String GMN_SET_KBN_Q = "Q";

    /** 画面設定区分 「N：支払手入力 変更画面 */
    public static final String GMN_SET_KBN_N = "N";

    /** 画面設定区分 「O：支払自動作成（通常）変更画面 */
    public static final String GMN_SET_KBN_O = "O";

    /** 画面設定区分 「P：支払自動作成（キャンセル）変更画面」 */
    public static final String GMN_SET_KBN_P = "P";

    /** パックコード */
    public static final String HEAD_PACK_CODE = "パックコード";

    /** 資料コード */
    public static final String HEAD_SIRYO_CODE = "資料コード";

    /** メンバー数 */
    public static final String HEAD_MB_SU = "メンバー数";

    /** TR数 */
    public static final String HEAD_TR_SU = "TR数";

    /** グループ数 */
    public static final String HEAD_GRP_SU = "グループ数";

    /** 正規表現:大文字半角英数字 */
    public static final String EI_SUJI = "^[A-Z0-9]*$";

    /** 正規表現:半角数字 */
    public static final String SUJI = "^[0-9]*$";

    /** 登録・更新フラグ  = 「1：登録」 */
    public static final String TURKKUSHNFLG1 = "1";

    /** 登録・更新フラグ  = 「2：更新」 */
    public static final String TURKKUSHNFLG2 = "2";

    /** 登録・更新フラグ  = 「3：更新」 */
    public static final String TURKKUSHNFLG3 = "3";

    /** 「0：終了報告」と「1：所感」  1:所感 */
    public static final String SYR_AND_SYKN_1 = "1";

    /** 「0：終了報告」と「1：所感」  0:終了報告 */
    public static final String SYR_AND_SYKN_0 = "0";

    /** 「1：終了報告要」 */
    public static final String SYRHKKARI = "1";

    /** 「1：所感要」 */
    public static final String SYKNARI = "1";

    /** 所感ステータス存在フラグ ＝ ""1：存在"" */
    public static final String SYKNSTSARI = "1";

    /** 所感ステータス存在フラグ ＝ ""0：存在しない"" */
    public static final String SYKNSTSNASI = "0";

    /** 期間種別:「1：前の1週間へリンク押下」 */
    public static final String KKN_SHBTS_ONE = "1";

    /** 期間種別:「2：3日前へリンク押下」 */
    public static final String KKN_SHBTS_TWO = "2";

    /** 期間種別:「3：3日後へリンク押下」 */
    public static final String KKN_SHBTS_THREE = "3";

    /** 期間種別:「4：次の１週間へリンク押下」 */
    public static final String KKN_SHBTS_FOUR = "4";

    /** 活性表示 1：活性表示 */
    public static final String KASEI_HILYOJI1 = "1";

    /** 活性表示 非活性表示 */
    public static final String KASEI_HILYOJI2 = "2";

    /** 表示 0：非表示 */
    public static final String HILYOJI0 = "0";

    /** 表示 1：表示 */
    public static final String HILYOJI1 = "1";

    /** 1：チェック有非活性 */
    public static final String TIEKU_HILYOJI1 = "1";

    /** 2：チェック有活性 */
    public static final String TIEKU_HILYOJI2 = "2";

    /** 3：チェック無活性 */
    public static final String TIEKU_HILYOJI3 = "3";

    /** 個人情報ダウンロード権限フラグ */
    public static final String DNLODO_KENGEN_FLAG = "1";

    /** 閲覧不可フラグ 1：ON */
    public static final String ETURAN_FUKA_FLAG = "1";

    /** 変更申請中区分コード 0：非変更申請中 */
    public static final String HENKOU_SINSEICHU_KUBEN_CODE0 = "0";

    /** 変更申請中区分コード 1：変更申請中（TR変更有） */
    public static final String HENKOU_SINSEICHU_KUBEN_CODE = "1";

    /** 変更申請中区分コード 2：変更申請中（TR変更無） */
    public static final String HENKOU_SINSEICHU_KUBEN_CODE2 = "2";

    /** 基本情報ステータスコード 30：進行中 */
    public static final String KIBONJOUHOU_STATUS_CODE30 = "30";

    /** 基本情報ステータスコード 60：キャンセル */
    public static final String KIBONJOUHOU_STATUS_CODE = "60";

    /** 基本情報ロックフラグ 0：OFF */
    public static final String KIBONJOUHOU_LOG_FLAG = "0";

    /** 編集モード 1：編集モード */
    public static final String HENSIU_MOUDO = "1";

    /** ODP区分修正フラグ 0：修正なし */
    public static final String ODPKBN_SYUSEINASI = "0";

    /** ODP区分修正フラグ 1：修正あり */
    public static final String ODPKBN_SYUSEIARI = "1";

    /** 削除済みフラグ「「1：削除済み」」 */
    public static final String DELETE_FLG_1 = "1";

    /** TR月次請求確定区分 : 2：対象外 */
    public static final String TRMONTHKBN_TWO_02 = "2";

    /** TR月次請求確定区分 : 0：未確定 */
    public static final String TRMONTHKBN_TWO_00 = "0";

    /** 印刷済フラグ : 0：印刷未 */
    public static final String PRINT_FLG0 = "0";

    /** 支払伝票作成区分 : 0：手入力 */
    public static final String SHRDENSAKU_KBN = "0";

    /** 使用停止区分 : 0：未停止 */
    public static final String SYTESHI_KBN = "0";

    /** 検索区分 : 1：検索ボタン押下 */
    public static final String SEARCH_KBN_ONE = "1";

    /** 検索区分 : 2：承認待ち検索ボタン押下 */
    public static final String SEARCH_KBN_TWO = "2";

    /** 税区分 : 1：課税対象外 */
    public static final String TAXKBN_ONE = "1";

    /** 税区分 : 2：内税 */
    public static final String TAXKBN_TWO = "2";

    /** エリア : 20：海外 */
    public static final String ELIAI_TWO = "20";

    /** 1：都道府県 */
    public static final String TODOU_FUKENN = "1";

    /** 2：海外 */
    public static final String KI_GAI = "2";

    /** 分類コード:「1：経費」 */
    public static final String BUNNRUI_KEIHI = "1";

    /** 分類コード:「0：原価」 */
    public static final String BUNNRUI_GENNKA = "0";

    /** 未処理のみ:「1：checked」 */
    public static final String MSRNM_CHECKED = "1";

    /** 未処理のみ:「0：checked」 */
    public static final String MSRNM_CHECKNS = "0";

    /** 空「""：empty」 */
    public static final String EMPTY = "";

    /** 依頼種別「01：職場コード表」 */
    public static final String IRSBCD_SBCDH = "01";

    /** 依頼種別「04：CariCo回答者情報」 */
    public static final String IRSBCD_CCKTSJH = "04";

    /** 依頼種別「06：アセス採点依頼」 */
    public static final String IRSBCD_ASESTIR = "06";

    /** 依頼種別「12：スタイル入りメンバー表」 */
    public static final String IRSBCD_STIRIRMBH = "12";

    /** 依頼種別「13：回収状況」 */
    public static final String IRSBCD_KSJK = "13";

    /** 依頼種別「17：一括集計・出力指示」 */
    public static final String IRSBCD_IKSK_SRJJ = "17";

    /** 依頼種別「19：JSN実施情報」 */
    public static final String IRSBCD_JSNJSJH = "19";

    /** 依頼種別「20：アドバイスシートカスタマイズ申請書」 */
    public static final String IRSBCD_SSS = "20";

    /** 受付:「1：checked」 */
    public static final String UKTK_CHECKED = "1";

    /** 受付:「0：checked」 */
    public static final String UKTK_CHECKNS = "0";

    /** 所在地反映ボタン区分 : 「１：発送タブの所在地に反映ボタン」 */
    public static final String SSAI_HANE_BTNKBN_01 = "1";

    /** 所在地反映ボタン区分 : 「２：回収タブの返送先情報の所在地に反映ボタン」 */
    public static final String SSAI_HANE_BTNKBN_02 = "2";

    /** 所在地反映ボタン区分 : 「３：回収タブの回収先が資料発送先と異なる場合の所在地に反映ボタン」 */
    public static final String SSAI_HANE_BTNKBN_03 = "3";

    /** 郵便番号上３桁の桁数 : 「３」 */
    public static final String YUBIN_NO_03 = "3";

    /** 郵便番号下４桁の桁数 : 「４」 */
    public static final String YUBIN_NO_04 = "4";

    /** 郵便番号上3桁の置換文字列1 : 「郵便番号上3桁」 */
    public static final String YUBIN_NO3 = "郵便番号上3桁";

    /** 郵便番号下4桁の置換文字列1 : 「郵便番号下4桁」 */
    public static final String YUBIN_NO4 = "郵便番号下4桁";

    /** ( */
    public static final String LEFT_KATSU = "（";

    /** ) */
    public static final String RIGHT_KATSU = "）";

    /** 到着確認完了フラグ  = 0 */
    public static final String TOCYAKU_0 = "0";

    /** 到着確認完了フラグ  = 1 */
    public static final String TOCYAKU_1 = "1";

    /** パンチ処理完了フラグ  = 0 */
    public static final String BATCH_0 = "0";

    /** パンチ処理完了フラグ  = 1 */
    public static final String BATCH_1 = "1";

    /** 発送先区分/回収先区分 : 「2：先方」 */
    public static final String SENN_BOU_02 = "2";

    /** 発送先区分/回収先区分 : 「3：その他」 */
    public static final String SO_NO_TA_03 = "3";

    /** タブフラグ : 「3：発送」 */
    public static final String TAB_FLG_03 = "3";

    /** タブフラグ : 「4：回収」 */
    public static final String TAB_FLG_04 = "4";

    /** 発送先・回収先区分 : 「1：会場」 */
    public static final String KAYI_JYOU_01 = "1";

    /** 発送先・回収先区分 : 「4：担当者」 */
    public static final String TANN_TOU_SYA_04 = "4";

    /** 部署 : 「フロント気付 リクルートトレーナー」 */
    public static final String FURONNTO_KIZUKE_01 = "フロント気付 リクルートトレーナー";

    /** 部署 : フロント気付 「フロント気付 フランクリン・コヴィー・ジャパン講師」 */
    public static final String FURONNTO_KIZUKE_02 = "フロント気付 フランクリン・コヴィー・ジャパン講師";

    /** 【置換文字列】：コピー元伝票NO */
    public static final String COPYOLD_DENNO = "コピー元伝票No";

    /** 作成担当区分に固定値「印刷会社」 */
    public static final String SAKUTTKBN_YSKS = "印刷会社";

    /** 資料数量チェックなし */
    public static final String SR_CNT_NO = "0";

    /** 資料数量チェックあり */
    public static final String SR_CNT_YES = "1";

    /** 発送情報チェックなし */
    public static final String HS_INFO_NO = "0";

    /** 発送情報チェックあり */
    public static final String HS_INFO_YES = "1";

    /** 019：所感提出 */
    public static final String SYOKAN_TAISYUTU = "019";

    /** 022：特資申請 */
    public static final String TAKUSI_SINSEI = "022";

    /** 014：①B202_基本情報詳細【社内】 ②S203_ＴＲ押え変更依頼 */
    public static final String KHJH_TROSE = "014";

    /** 010：基本情報詳細【社内】 */
    public static final String KHJH_SYAN = "010";

    /** 012：TR押え変更依頼 */
    public static final String TROSAE_HENKO = "012";

    /** 011：基本情報詳細【TR】 */
    public static final String KHJH_TR = "011";

    /** 017：タスク一覧【社内・TR】 */
    public static final String TASKU_SYANATR = "017";

    /** 1：社内テーブルフラグ */
    public static final String SYAN_TBRFLG = "1";

    /** 1：TRテーブルフラグ */
    public static final String TR_TBRFLG = "2";

    /** 1：顧客テーブルフラグ */
    public static final String KOKKU_TBRFLG = "3";

    /** 期間区分 : 1：1日 */
    public static final String KKN_KBN_ONE = "1";

    /** 期間区分 : 2：2日 */
    public static final String KKN_KBN_TWO = "2";

    /** 期間区分 : 3：3日以上 */
    public static final String KKN_KBN_THREE = "3";

    /** 活性・非活性フラグ :0：非活性 */
    public static final String ABLEDFLG_ZERO = "0";

    /** 活性・非活性フラグ : 1：活性 */
    public static final String ABLEDFLG_ONE = "1";

    /** チェック有無フラグ : 0：無 */
    public static final String CHECKEDFLG_ZERO = "0";

    /** チェック有無フラグ  : 1：有 */
    public static final String CHECKEDFLG_ONE = "1";

    /** 日程詳細履歴作成フラグ 0：作成しない */
    public static final String KHN_INFO_RTESYS_RRK = "0";

    /** 添付ファイル履歴作成フラグ 0：作成しない */
    public static final String TNP_FILE_RRK_SKS_FLAG = "0";

    /** その他社内関係者履歴作成フラグ 0：作成しない */
    public static final String SNT_SYN_KNKSY_RRK_SKS_FLAG = "0";

    /** 研修本押えＴＲ履歴作成フラグ 0：作成しない */
    public static final String KNSY_MTOSE_TR_RRK_SKS_FLAG = "0";

    /** 変更履歴作成フラグ 1：作成する */
    public static final String HNK_RRK_SKS_FLAG = "1";

    /** 変更通知モーダル表示フラグ１：表示 */
    public static final String HK_ALERTMDIHI_FLAG = "1";

    /** 画面遷移 1：一覧画面から */
    public static final String SENI_FLAG_1 = "1";

    /** 画面遷移 2：自画面遷移 */
    public static final String SENI_FLAG_2 = "2";

    /** マスター報酬フラグ ：0：未チェック */
    public static final String MST_HOSYU_FLAG_NOCHECK = "0";

    /** マスター報酬フラグ ：1：チェック済 */
    public static final String MST_HOSYU_FLAG_YESCHECK = "1";

    /** 登録・更新フラグ：[1：新規] */
    public static final String TURK_KUSHN_FLG_SHINKI = "1";

    /** 登録・更新フラグ：[2：更新] */
    public static final String TURK_KUSHN_FLG_KUSHN = "2";

    /** 分類確定フラグ  = [1：確定] */
    public static final String BNRI_KKT_FLG_KKT = "1";

    /** サブTRフラグ ：0：未チェック */
    public static final String SUB_TR_FLG_ZERO = "0";

    /** サブTR活性・非活性状態フラグ ：0：非活性 */
    public static final String TRSUB_HIK_STATUS_FLAG_ZERO = "0";

    /** サブTR活性・非活性状態フラグ ：1：活性 */
    public static final String TRSUB_HIK_STATUS_FLAG_ONE = "1";

    /** 3.5H以下活性・非活性状態フラグ ：0：非活性 */
    public static final String TN5IKK_HIK_STATUS_FLAG_ZERO = "0";

    /** 3.5H以下活性・非活性状態フラグ ：1：活性 */
    public static final String TN5IKK_HIK_STATUS_FLAG_ONE = "1";

    /** マスタ報酬活性・非活性状態フラグ ：0：非活性 */
    public static final String MST_HOSYU_HIK_STATUS_FLAG_ZERO = "0";

    /** マスタ報酬活性・非活性状態フラグ ：1：活性 */
    public static final String MST_HOSYU_HIK_STATUS_FLAG_ONE = "1";

    /** 稼動統合活性・非活性状態フラグ ：0：非活性 */
    public static final String KDUSUGU_HIK_STATUS_FLAG_ZERO = "0";

    /** 稼動統合活性・非活性状態フラグ ：1：活性 */
    public static final String KDUSUGU_HIK_STATUS_FLAG_ONE = "1";

    /** 3.5H以下フラグ ：0：未チェック */
    public static final String SJK_FLAG_ZERO = "0";

    /** 3.5H以下フラグ ：1：チェック済 */
    public static final String SJK_FLAG_ONE = "1";

    /** 稼動統合フラグ ：0：未チェック */
    public static final String KD_TOUGO_FLAG_NOCHECK = "0";

    /** 日程詳細履歴作成フラグ ：0：作成しない */
    public static final String KHNINFORTESYRRK_ZERO = "0";

    /** 日程詳細履歴作成フラグ ：1：作成する */
    public static final String KHNINFORTESYRRK_ONE = "1";

    /** 添付ファイル履歴作成フラグ ：0：作成しない */
    public static final String KTNPFILERRKSKSFLG_ZERO = "0";

    /** 添付ファイル履歴作成フラグ ：1：作成する */
    public static final String KTNPFILERRKSKSFLG_ONE = "1";

    /** 研修本押えＴＲ履歴作成フラグ ：0：作成しない */
    public static final String SNTSYNKNKSYRRKSKSFLG_ZERO = "0";

    /** 研修本押えＴＲ履歴作成フラグ ：1：作成する */
    public static final String SNTSYNKNKSYRRKSKSFLG_ONE = "1";

    /** その他社内関係者履歴作成フラグ ：0：作成しない */
    public static final String KNSYMTOSETRRRKSKSFLG_ZERO = "0";

    /** その他社内関係者履歴作成フラグ ：1：作成する */
    public static final String KNSYMTOSETRRRKSKSFLG_ONE = "1";

    /** 変更履歴作成フラグ ：0：作成しない */
    public static final String HNKRRKSKSFLG_ZERO = "0";

    /** 変更履歴作成フラグ ：1：作成する */
    public static final String HNKRRKSKSFLG_ONE = "1";

    /** 遷移ボタン区分 ：「1：資料発送手配」 */
    public static final String SNI_BTN_KBN_SHRYU_HSSU_THI = "1";

    /** 遷移ボタン区分 ：「2：サーベイ手配」 */
    public static final String SNI_BTN_KBN_SIBI_THI = "2";

    /** 遷移ボタン区分 ：「3：サーベイ事前伝票」 */
    public static final String SNI_BTN_KBN_SIBI_JZNDNPYU = "3";

    /** 遷移ボタン区分 ：「4：サーベイ事前伝票以外」 */
    public static final String SNI_BTN_KBN_SIBIJ_ZNDNPYU_IGI = "4";

    /** DB存在フラグ ＝「0：存在なし」 */
    public static final String DB_SNZI_FLG_SNZI_NSH = "0";

    /** 資料パック区分＝「S：資料」 */
    public static final String SIRYO_PACK_KBN_S_SIRYO = "S";

    /** 言語区分再設定フラグ : 0：再設定不要 */
    public static final String GNG_KBN_SAI_STTE_FLAG_ZERO = "0";

    /** 言語区分再設定フラグ : 1：設定必要 */
    public static final String GNG_KBN_SAI_STTE_FLAG_ONE = "1";

    /** サブＴＲ再設定フラグ : 0：再設定不要 */
    public static final String SUB_TR_SAI_STTE_FLAG_ZERO = "0";

    /** サブＴＲ再設定フラグ : 1：設定必要 */
    public static final String SUB_TR_SAI_STTE_FLAG_ONE = "1";

    /** 3.5H以下再設定フラグ : 0：再設定不要 */
    public static final String SAI_STTE_FLAG_3TN5LKK_ZERO = "0";

    /** 3.5H以下再設定フラグ : 1：設定必要 */
    public static final String SAI_STTE_FLAG_3TN5LKK_ONE = "1";

    /** マスタ報酬フラグ＝0 */
    public static final String KSI_FLG_MATER_HSYU_ZERO = "0";

    /** マスター報酬再設定フラグ : 0：再設定不要 */
    public static final String MATER_HSYU_SAI_STTE_FLAG_ZERO = "0";

    /** マスター報酬再設定フラグ : 1：設定必要 */
    public static final String MATER_HSYU_SAI_STTE_FLAG_ONE = "1";

    /** 稼動統合再設定フラグ : 0：再設定不要 */
    public static final String KDU_SUGU_SAI_STTE_FLAG_ZERO = "0";

    /** 稼動統合再設定フラグ : 1：設定必要 */
    public static final String KDU_SUGU_SAI_STTE_FLAG_ONE = "1";

    /** 登録結果 0：エラー */
    public static final String TRKKEKA_ZERO = "0";

    /** 登録結果 1：正常終了 */
    public static final String TRKKEKA_ONE = "1";

    /** 追加タスクフラグ:0：非追加タスク */
    public static final String ADDTSTFLG_ZERO = "0";

    /** 資料選択 コピー処理のID */
    public static final String SHIRYUSENNTAKU_COPY_SYOURYOUID = "L201_01";

    /** アンケート実施有無：「0：なし」 */
    public static final String ANKTJSSHUMU_00 = "0";

    /** アンケート実施有無：「1：あり」 */
    public static final String ANKTJSSHUMU_01 = "1";

    /** アンケート種類コード：「40：提携先」 */
    public static final String ENQUETEKBNCD_40 = "40";

    /** 処理のID(L201):「本処理のID」 */
    public static final String SIRYOUSENNTAKU_KIHOUJYOUHO_SYORIID = "0";

    /** 処理区分 1：商品コード指定なし */
    public static final String SHO_RI_KBN = "1";

    /** 背景色  = 「１：薄ピンク」 */
    public static final String HAIKEI_IRO_USUPINK = "1";

    /** 背景色  = 「０：デフォルト」 */
    public static final String HAIKEI_IRO_DEFAULT = "0";

    /** 「パックコード」 */
    public static final String PACKCD = "パックコード";

    /** 「パック漢字名」 */
    public static final String PACKKJ = "パック漢字名";

    /** 「資料コード」 */
    public static final String SHRYOCD = "資料コード";

    /** 「入力値．資料数量」  = 「チェックあり」 */
    public static final String SIRYO_SU_CHECK = "チェックあり";

    /** 「入力値．資料数量」  = 「チェックなし」 */
    public static final String SIRYO_SU_CHECK_NSH = "チェックなし";

    /** 「入力値．発送情報」  = 「チェックあり」 */
    public static final String HASSO_CHECK = "チェックあり";

    /** 「印刷会社」 */
    public static final String INSTS_KISH = "印刷会社";

    /** 「003:基本情報ロック」 */
    public static final String KHNLNFO_LOG = "003";

    /** お知らせ分類コード ＝ 「004：終了報告（資料納品分）」 */
    public static final String SRSBR_CD_LSTHKK = "004";

    /** 処理区分 : 変更依頼申請時 */
    public static final String SHORIKBN_HNKIRITRK = "3";

    /** 処理区分 : 登録可能な履歴NO取得 */
    public static final String SHORIKBN_TRKKNURRNOSUTK = "1";

    /** 表示パターン : 2：ラベル表示フラグ */
    public static final String HYJPTN_TWO = "2";

    /** 表示パターン : 1：リスト表示 */
    public static final String HYJPTN_ONE = "1";

    /** 押え区分コード ：01：研修 */
    public static final String OSE_KBN_CD_ONE = "01";

    /** 押え区分コード ：08：研修アシトレ */
    public static final String OSE_KBN_CD_TWO = "08";

    /** 押え区分コード ：09：ＲＬＣ */
    public static final String OSE_KBN_CD_THREE = "09";

    /** 終了コード : 0：正常終了 */
    public static final String SYURYUCD_ZERO = "0";

    /** 終了コード : 9：異常終了 */
    public static final String SYURYUCD_NINE = "9";

    /** 開始終了区分 : 1：開始日 */
    public static final String KAS_HUKBN_ONE = "1";

    /** 開始終了区分 : 2：期間日 */
    public static final String KAS_HUKBN_TWO = "2";

    /** 開始終了区分 : 3：終了日 */
    public static final String KAS_HUKBN_THREE = "3";

    /** 開始終了区分 : 4：開始終了同日 */
    public static final String KAS_HUKBN_FOUR = "4";

    /** rmsCalendar.js ファイルパース TODO ファイルのパースは方式を待っている。鄧超 */
    public static final String RMSCALENDAR_FILE_PATH = "D:\\javaTest\\";

    /** trnv_yakan_syuryo.js ファイルパース */
    public static final String TRNV_YAKAN_SYURYO = "D:\\test\\";

    /** 拡張子：.js */
    public static final String KKTYSI = ".js";

    /** ファイル名前 拡張子がある */
    public static final String FILE_NAME_KKTYSI = "rmsCalendar.js";

    /** ファイル名前 拡張子がない */
    public static final String FILE_NAME = "rmsCalendar";

    /** 「006：仮押え期限切れ」 */
    public static final String KRIOSAKGNYMD_006 = "006";

    /** 「007：仮押え期限切れ（提携向け）」 */
    public static final String KRIOSAKGNYMD_007 = "007";

    /** ステータス 「1：チェック済」 */
    public static final String STR_TYKKSM = "1";

    /** 1：1日 */
    public static final String ONE_DAY = "1";

    /** 2：2日 */
    public static final String TWO_DAY = "2";

    /** 3：3日以上 */
    public static final String THREE_DAY = "3";

    /** 固定値：0 */
    public static final int KHNINFORRKINO_ZERO = 0;

    /** 基本情報_日程詳細_履歴のテーブル名 */
    public static final String BT_KHNINFO_RTESYS_RRK = "BT_KHNINFO_RTESYS_RRK";

    /** 基本情報_添付ファイル_履歴のテーブル名 */
    public static final String BT_KHNINFO_FILE_RRK = "BT_KHNINFO_FILE_RRK";

    /** 基本情報_その他社内関係者_履歴 */
    public static final String BT_KHNINFO_OTS_RELAT_RRK = "BT_KHNINFO_OTS_RELAT_RRK";

    /** 基本情報_研修本押えＴＲ_履歴のテーブル名 */
    public static final String BT_KHNINFO_KESHU_HOSA_TR_RRK = "BT_KHNINFO_KESHU_HOSA_TR_RRK";

    /** 1：押え日程ベースにTR日単位情報を再設定する */
    public static final String SYONIKUBEN_ONE = "1";

    /** 2：TR情報リストで変更前情報引き継ぎTR日単位情報を再設定する */
    public static final String SYONIKUBEN_TWO = "2";

    /** 3：TR日単位情報リストで変更前情報引き継ぎTR日単位情報を再設定する */
    public static final String SYONIKUBEN_THREE = "3";

    /** 4：TR日単位情報リストで押え日程ベースにTR日単位情報を再設定する */
    public static final String SYONIKUBEN_FOUR = "4";

    /** 固定値：00 */
    public static final String OSANITKA_JIKAN = "00";

    /** 固定値：24 */
    public static final String OSANITKA_JIKAN_KANRYOJI = "24";

    /** 固定値：0 */
    public static final String DELFLG = "0";

    /** TR情報単独選択 */
    public static final String SYONIKUBEN_TR_ONE = "1";

    /** TR情報複数選択 */
    public static final String SYONIKUBEN_TR_TWO = "2";

    /** 冒号：":" */
    public static final String COLON = ":";

    /** 押えステータス表示名 ：仮押え申請 */
    public static final String HYJNM_KRIOSMSIKMI = "仮押え申請";

    /** 押えステータス表示名 ：仮押え否認 */
    public static final String HYJNM_KRIOSHININ = "仮押え否認";

    /** 押えステータス表示名 ：仮押え保留 */
    public static final String HYJNM_KRIOSHRYUU = "仮押え保留";

    /** 押えステータス表示名 ：本押え保留 */
    public static final String HYJNM_HNOSHRYUU = "本押え保留";

    /** 押えステータス表示名 ：本押え申請 */
    public static final String HYJNM_HNOSMSIKMI = "本押え申請";

    /** 押えステータス表示名 ：仮押え */
    public static final String HYJNM_KRIOS = "仮押え";

    /** 押えステータス表示名 ：本押え */
    public static final String HYJNM_HNOS = "本押え";

    /** 押えステータス表示名 ：仮押えキャンセル */
    public static final String HYJNM_KRIOSKNSR = "仮押えキャンセル";

    /** 押えステータス表示名 ：本押えキャンセル */
    public static final String HYJNM_HONSKNSR = "本押えキャンセル";

    /** 押えステータス表示名 ：仮押え期限切れ */
    public static final String HYJNM_KRIOSKGNKR = "仮押え期限切れ";

    /** 押えステータス表示名 ：完了 */
    public static final String HYJNM_KNRY = "完了";

    /** 個人情報無効フラグ : ON */
    public static final String KNJHMK_ON = "ON";

    /** ■廃止： */
    public static final String HASHIJI = "■廃止：";

    /** システム番号管理区分 10：基本情報No */
    public static final String SYSNN_KBN_10 = "10";

    /** システム番号管理区分 20：くくりNo */
    public static final String SYSNN_KBN_20 = "20";

    /** システム番号管理区分 30：アンケートNO */
    public static final String SYSNN_KBN_30 = "30";

    /** システム番号管理区分 40：報告書NO */
    public static final String SYSNN_KBN_40 = "40";

    /** システム番号管理区分 50：研修伝票NO */
    public static final String SYSNN_KBN_50 = "50";

    /** システム番号管理区分 51：サーベイ伝票NO */
    public static final String SYSNN_KBN_51 = "51";

    /** システム番号管理区分 60：支払伝票No */
    public static final String SYSNN_KBN_60 = "60";

    /** システム番号管理区分 70：ライセンス管理No */
    public static final String SYSNN_KBN_70 = "70";

    /** システム番号管理区分 80：スケジュールNo */
    public static final String SYSNN_KBN_80 = "80";

    /** STRING:000001 */
    public static final String STR_000001 = "000001";

    /** STRING:0000001 */
    public static final String STR_0000001 = "0000001";

    /** STRING:00000001 */
    public static final String STR_00000001 = "00000001";

    /** 「宛先パターン」2:押え系 */
    public static final String ATSK_PTN_TWO = "2";

    /** 「宛先パターン」0:固定アドレス */
    public static final String ATSK_PTN_ZERO = "0";

    /** 「宛先パターン」1:基本情報系 */
    public static final String ATSK_PTN_ONE = "1";

    /** 「お知らせ対象」1:送付する */
    public static final String OSRS_TSY_ONE = "1";

    /** 「お知らせ対象」2:任意 */
    public static final String OSRS_TSY_TWO = "2";

    /** 「お知らせ対象」3:送付しない */
    public static final String OSRS_TSY_THREE = "3";

    /** 「顧客送付区分」1:送付する */
    public static final String KKYKSNDBN_ONE = "1";

    /** 「メール本文パターン?」1:汎用 */
    public static final String MAILHNBN_PTN_ONE = "1";

    /** 「メール本文パターン?」3:押え申請系 */
    public static final String MAILHNBN_PTN_THREE = "3";

    /** 「メール本文パターン?」4:押え変更依頼系 */
    public static final String MAILHNBN_PTN_FOUR = "4";

    /** 「メール本文パターン?」2:基本情報系 */
    public static final String MAILHNBN_PTN_TWO = "2";

    /** 「メール小分類?」1 */
    public static final String MAILTYPE_ONE = "1";

    /** 「メール小分類?」2 */
    public static final String MAILTYPE_TWO = "2";

    /** 「メール小分類?」3 */
    public static final String MAILTYPE_THREE = "3";

    /** 「メール小分類?」4 */
    public static final String MAILTYPE_FOUR = "4";

    /** 「メール小分類?」5 */
    public static final String MAILTYPE_FIVE = "5";

    /** 「メール小分類?」6 */
    public static final String MAILTYPE_SIX = "6";

    /** 「メール小分類?」7 */
    public static final String MAILTYPE_SEVEN = "7";

    /** 「メール小分類?」8 */
    public static final String MAILTYPE_EIGHT = "8";

    /** セル結合区分 1：有 */
    public static final String SR_KTGO_KBN_ONE = "1";

    /** セル結合区分 0：無 */
    public static final String SR_KTGO_KBN_ZERO = "0";

    /** その他項目表示フラグ 0 : 閉じる */
    public static final String HK_HYJ_FLAG = "0";

    /** 遷移元画面区分 1：基本情報詳細【社内】から来た場合 */
    public static final String SNIM_GMN_KBN_ONE = "1";

    /** 遷移元画面区分 2：ＴＲ押え画面から来た場合 */
    public static final String SNIM_GMN_KBN_TWO = "2";

    /** 遷移元画面区分 3：グロナビから来た場合（ポップアップ） */
    public static final String SNIM_GMN_KBN_THREE = "3";

    /** 遷移ステータス 1：TR検索日画面へ遷移 */
    public static final String SNI_STATUS_ONE = "1";

    /** 遷移ステータス 2：TR検索日画面ポップアップ */
    public static final String SNI_STATUS_TWO = "2";

    /** 遷移ステータス 3：TR検索時間画面へ遷移 */
    public static final String SNI_STATUS_THREE = "3";

    /** 遷移ステータス 4：TR検索時間画面ポップアップ */
    public static final String SNI_STATUS_FOUR = "4";

    /** テンプレート種別 041：お知らせ_汎用 */
    public static final String TEMPLATE_CD_HNYN = "041";

    /** テンプレート種別 042：お知らせ_基本情報系 */
    public static final String TEMPLATE_CD_KHNJYHNK = "042";

    /** テンプレート種別 043：お知らせ_押え申請系 */
    public static final String TEMPLATE_CD_OSA_MNSKM = "043";

    /** テンプレート種別 044：お知らせ_押え変更依頼系 */
    public static final String TEMPLATE_CD_OSAHNNKOU = "044";

    /** STRING : No. */
    public static final String STR_NUMBER = "No.";

    /** STRING : 　様 */
    public static final String STR_SAMA = "　様";

    /** STRING : 概要： */
    public static final String STR_GAIYOU = "概要：";

    /** STRING : 基本情報No　： */
    public static final String STR_KHNINFONO = "基本情報No　：";

    /** STRING : 社名／拠点名　： */
    public static final String STR_SYNM_OR_SYTNNM = "社名／拠点名　：";

    /** STRING : 商品名　　　： */
    public static final String STR_SYHN_NM = "商品名　　　：";

    /** STRING : "研修名　　　：" */
    public static final String STR_KNSYN_NM = "研修名　　　：";

    /** STRING : "研修日程　　：" */
    public static final String STR_KNSYN_NT = "研修日程　　：";

    /** STRING : 左括弧 "(" */
    public static final String LEFT_KAKKO = "（";

    /** STRING : 右括弧 ")" */
    public static final String RIGHT_KAKKO = "）";

    /** STRING : スケジュールNo： */
    public static final String STR_SCR_NUMBER = "スケジュールNo：";

    /** STRING : 押えステータス： */
    public static final String STR_OSA_STS = "押えステータス：";

    /** STRING : 押え日程　　　： */
    public static final String STR_OSA_NT = "押え日程　　　：";

    /** STRING : 押え内容　　　： */
    public static final String STR_OSA_NAIYOU = "押え内容　　　：";

    /** STRING : 会場都道府県　： */
    public static final String STR_OSA_AREA = "会場都道府県　：";

    /** STRING : トレーナー　　： */
    public static final String STR_TORENA = "トレーナー　　：";

    /** 波形 : ～ */
    public static final String CHAR_HAKEI = "～";

    /** 斜線 : / */
    public static final String CHAR_SHASEN = "/";

    /** 全角コンマ : */
    public static final String CHAR_KONMA_ZENKAKU = "、";

    /** 記号 "≪" */
    public static final String SYMBOL_NIJYUYAMA_KAKKO_SHI = "≪";

    /** 記号 "≫" */
    public static final String SYMBOL_NIJYUYAMA_KAKKO_SHUU = "≫";

    /** String : 申請区分　　　　： */
    public static final String STR_MSKMKBNN = "申請区分　　　　：";

    /** String : 現押えステータス： */
    public static final String STR_GNZI_STS = "現押えステータス：";

    /** 既読フラグ : 0：未読 */
    public static final String SKYM_FLG_MYM = "0";

    /** 基本情報区分コード 「20：資料納品」 */
    public static final String KHNINFO_KBN_CD = "20";

    /** お知らせ分類コード : 001：進行中ステータス変更 */
    public static final String SRSBR_CD_STS_HENKO = "001";

    /** お知らせ分類コード : 002：基本情報ロックアラーム */
    public static final String SRSBR_CD_BASE_INFO_LOCK = "002";

    /** お知らせ分類コード : 005：仮押え期限切れアラーム */
    public static final String SRSBR_CD_KRIOSA_KGN_PASS = "005";

    /** お知らせ分類コード : 008：本押え追加・変更 */
    public static final String SRSBR_CD_HOSA_INUP = "008";

    /** YSD発送ロック */
    public static final String YSD_HASSO = "YSD_HASSO";

    /** FCJ発送回収ロック */
    public static final String FCJ_HASSO_KAISHU = "FCJ_HASSO_KAISHU";

    /** YSD回収ロック */
    public static final String YSD_KAISHU = "YSD_KAISHU";

    /** 採点物流センター営業日フラグ  1：営業日 */
    public static final String EGY_FLG_ONE = "1";

    /** 拡張子 */
    public static final String STR_KKTYSI = ".csv";

    /** 条件項目名：KHNINFO_NO */
    public static final String STR_KHNINFO_NO = "KHNINFO_NO";

    /** 条件項目名：SCHE_NO */
    public static final String STR_SCHE_NO = "SCHE_NO";

    /** 条件項目名：TR_ID */
    public static final String STR_TR_ID = "TR_ID";

    /** 条件項目名：UT_YMD */
    public static final String STR_UT_YMD = "UT_YMD";

    /** 条件項目名：BATCH_DUMMY_USER */
    public static final String STR_BATCH_DUMMY_USER = "BATCH_DUMMY_USER";

    /** 条件項目名：IRA_SEQ */
    public static final String IRA_SEQ = "IRA_SEQ";

    /** 「031：押え変更依頼申請（提携分）」 */
    public static final String OSAE_KRIOSMSIKMI = "031";

    /** 処理区分：「1：受付」 */
    public static final String SYRKBN_ONE = "1";

    /** 処理区分：「2：受付不可」 */
    public static final String SYRKBN_TWO = "2";

    /** 処理区分：「0：申請」 */
    public static final String SYRKBN_ZERO = "0";

    /** 固定値「029」 */
    public static final String KOTEI_NE = "029";

    /** 固定値「10：本申請」 */
    public static final String KOTEI_NE_TEN = "10";

    /** 削除確認フラグ 「0：不要」 */
    public static final String DELETE_FLG_ZERO = "0";

    /** 削除フラグ 「1：削除済」 */
    public static final String DEL_FLG_ONE = "1";

    /** ファイル名 : trnv_yakan_syuryo.js */
    public static final String FILE_NAME_TRNV_YAKAN_SYURYO = "trnv_yakan_syuryo.js";

    /** 条件項目名：DISP_KBN */
    public static final String DISP_KBN = "DISP_KBN";

    /** TR情報．TR種別コード（hidden）＝「210：提携」 */
    public static final String TR_SHUBE_CD = "210";

    /** 条件項目値 String 2：既存データ表示 */
    public static final String HYU_SHIKI = "2";

    /** C510 登録者数 上限「30」 */
    public static final String MAX_NUM_30 = "30";

    /** 会場都道府県コード:海外 */
    public static final String KJYOTDFKN_CD_KGI = "99";

    /** 売上NO必須フラグ: 任意 */
    public static final String JCNOREQFLG_ZERO = "0";

    /** 売上NO必須フラグ: 任意 */
    public static final String JCNOREQFLG_ONE = "1";

    /** TR請求書反映フラグ: 請求書に反映する */
    public static final String TRSKYSHHNFLG_SR = "1";

    /** TR請求書反映フラグ: 請求書に反映しない */
    public static final String TRSKYSHHNFLG_SN = "0";

    /** サブTRフラグ: サブTR */
    public static final String SUBTRFLG_SUBTR = "1";

    /** 3.5H以下フラグ: 3.5H以下 */
    public static final String SJKFLG_SJK = "1";

    /** 研修日額適用外フラグ：適用外 */
    public static final String KNSHNTGKTKYGFLG_TKYG = "1";

    /** 研修日額適用外フラグ：適用 */
    public static final String KNSHNTGKTKYGFLG_TKY = "0";

    /** アセス報酬フラグは：アセス報酬 */
    public static final String ASSHSHFLG_ASSHSH = "1";

    /** アセス報酬フラグは：アセス報酬外 */
    public static final String ASSHSHFLG_ASSHSHG = "0";

    /** マスター報酬フラグは ：マスター報酬 */
    public static final String MSTHSHFLG_MSTHSH = "1";

    /** マスター報酬フラグは ：マスター報酬外 */
    public static final String MSTHSHFLG_MSTHSHG = "0";

    /** 在住エリアコード ：海外 */
    public static final String ZJAREACD_KG = "99";

    /** 顧客コード */
    public static final String KAMK_KKYK_CD1 = "605506001";

    /** 顧客コード */
    public static final String KAMK_KKYK_CD2 = "630789001";

    /** 費用負担コード */
    public static final String KAMK_HIFT_CD = "240117";

    /** 押えキャンセル : チェック済 */
    public static final String OSACANCEL_CHECKSM = "1";

    /** 処理区分 : 研修 */
    public static final String SYORI_KNSH = "1";

    /** 処理区分 : ＲＬＣ */
    public static final String SYORI_RLC = "2";

    /** 処理区分 : 研修外 */
    public static final String SYORI_KNSHG = "3";

    /** ＲＬＣ販促セミナー商品コード */
    public static final String RLC_SEM_SHN_CD = "S0170";

    /** 報酬日額＝「0：0円」 */
    public static final String HOU_HI_GK = "0";

    /** 作成要否フラグ＝「1：要作成」 */
    public static final String SAKU_FLG = "1";

    /** 作成要否フラグ＝「0：作成不要」 */
    public static final String SAKU_FLG_ZERO = "0";

    /** 支払区分＝「0：作成無」 */
    public static final String SHR_KBN_ZERO = "0";

    /** 支払区分＝「1：ＴＲ報酬Ｘ日数」 */
    public static final String SHR_KBN_ONE = "1";

    /** 支払区分＝支払区分＝「2：支払額Ｘ日数」 */
    public static final String SHR_KBN_TWO = "2";

    /** キャンセル請求支払区分＝「2：作成無」 */
    public static final String CSHR_KBN = "2";

    /** キャンセル請求支払区分＝「0：0円で作成」 */
    public static final String CSHR_KBN_ZERO = "0";

    /** 押え区分＝「02：研修外」 */
    public static final String OSA_KBN_TWO = "02";

    /** 押え区分＝「01：研修」 */
    public static final String OSA_KBN_ONE = "01";

    /** 押え区分＝「08：研修アシトレ」 */
    public static final String OSA_KBN_EIGHT = "08";

    /** 押え区分＝「09：ＲＬＣ」 */
    public static final String OSA_KBN_NINE = "09";

    /** 固定値:02 */
    public static final String STRING_TWO = "02";

    /** 固定値:01 */
    public static final String STRING_ONE = "01";

    /** 取得区分＝「1：DOCODEMOから」 */
    public static final String SYUTOKU_KUBEN = "1";

    /** 新旧情報フラグ 1：新情報 */
    public static final String SNKYJYH_FLG_ONE = "1";

    /** 新旧情報フラグ 0：旧情報 */
    public static final String SNKYJYH_FLG_ZERO = "0";

    /** 担当営業変更PRISM連携フラグ 1：連携済 */
    public static final String PRISM_RNK_FLG_ONE = "1";

    /** 担当営業変更PRISM連携フラグ 0：未連携 */
    public static final String PRISM_RNK_FLG_ZERO = "0";

    /** 連携項目変更有無フラグ 1：変更あり */
    public static final String RNKKMK_HNKYM_FLG_ONE = "1";

    /** 連携項目変更有無フラグ 0：変更なし */
    public static final String RNKKMK_HNKYM_FLG_ZERO = "0";

    /** 更新区分 0：開始終了時間更新 */
    public static final String UPDATE_KBN_ZERO = "0";

    /** 更新区分 1：本押え申請の受付処理 または 開始時間のみ更新 */
    public static final String UPDATE_KBN_ONE = "1";

    /** 更新区分 2 : 終了時間のみ更新 */
    public static final String UPDATE_KBN_TWO = "2";

    /** 更新区分 3：変更の申請処理 */
    public static final String UPDATE_KBN_THREE = "3";

    /** 更新区分 4：変更の受付処理 */
    public static final String UPDATE_KBN_FOUR = "4";

    /** 更新区分 5：変更の受付不可処理 */
    public static final String UPDATE_KBN_FIVE = "5";

    /** 更新区分 6：キャンセル申請の申請処理 */
    public static final String UPDATE_KBN_SIX = "6";

    /** 更新区分 7：キャンセル申請の受付処理 */
    public static final String UPDATE_KBN_SEVEN = "7";

    /** 更新区分 8：キャンセル申請の受付不可処理 */
    public static final String UPDATE_KBN_EIGHT = "8";

    /** 商品変更有無フラグ 1：変更あり */
    public static final String SYHHN_YM_FLG_ONE = "1";

    /** 商品変更有無フラグ 0：変更なし */
    public static final String SYHHN_YM_FLG_ZERO = "0";

    /** 日程変更有無フラグ 2：時間変更あり */
    public static final String NTHNK_YM_FLG_TWO = "2";

    /** 日程変更有無フラグ  1：日程変更あり */
    public static final String NTHNK_YM_FLG_ONE = "1";

    /** 日程変更有無フラグ 0：変更なし */
    public static final String NTHNK_YM_FLG_ZERO = "0";

    /** お知らせ分類コード : 013：基本情報更新&研修本押え変更受付不可 */
    public static final String SRSBR_CD_BASE_INFO_UP = "013";

    /** String UPD_RRKI_NO */
    public static final String STR_UPD_RRKI_NO = "UPD_RRKI_NO";

    /** 所感なしに変更 */
    public static final String HENKOU_NASHI = "1";

    /** 所感ありに変更 */
    public static final String HENKOU_ARI = "2";

    /** 基本情報ステータス区分 1：進行中・実施済 */
    public static final String KIHN_ST_KBN1 = "1";

    /** ワーニング insert */
    public static final String WARNING_INSERT = "insert";

    /** ワーニング insert */
    public static final String WARNING_COUNT = "count";

    /** 固定文言 （本登録の物流伝票あり） */
    public static final String KOTEI_STRING = "（本登録の物流伝票あり）";

    /** 処理区分 1：変更申請 */
    public static final String SYR_KBN_HNNKMSKM = "1";

    /** 処理区分 1：新規登録 */
    public static final String SYR_KBN_SNK_TRK = "1";

    /** 処理区分 2：受付 */
    public static final String SYR_KBN_UKTSK = "2";

    /** 処理区分 2：データ更新 */
    public static final String SYR_KBN_DATA_KOSIN = "2";

    /** 基本情報区分コード (10：研修納品) */
    public static final String KHNINFO_KBN_CD_TEN = "10";

    /** システム番号管理区分 (30：アンケートNO) */
    public static final String SYS_BANGO_KANRI_KUBEN = "30";

    /** アンケート有フラグ (1：あり) */
    public static final String ENQUETE_ARI_FLG = "1";

    /** アンケート種類コード (40:提携先) */
    public static final String ENQUETE_KBN_CD = "40";

    /** 集計単位フラグ (0：非一括) */
    public static final String SK_FLG = "0";

    /** アンケート実施有無フラグ (1：あり) */
    public static final String AKT_JISYUM_FLG = "1";

    /** アンケートステータスコード (10：研修終了前) */
    public static final String ATK_STS_CD_TEN = "10";

    /** アンケートステータスコード (20：到着待ち) */
    public static final String ATK_STS_CD_TWENTY = "20";

    /** STS集計有無フラグ (1：あり) */
    public static final String STS_SYK_FLG = "1";

    /** UP希望区分コード (10：標準) */
    public static final String UP_KIBO_KBN_CD = "10";

    /** 最終原本情報区分コード (10：ＳＴＳにて廃棄) */
    public static final String LAST_GENBIN_FOKBN_CD = "10";

    /** 原本戻し有無フラグ (0：なし) */
    public static final String GEN_BMDOS_FLG = "0";

    /** 削除フラグ (0) */
    public static final String DEL_FLG = "0";

    /** 所感有フラグ (1：あり) */
    public static final String SYOKAN_UM_FLG = "1";

    /** 終了報告ステータスコード (10：報告待ち) */
    public static final String END_HHK_STS_CD = "10";

    /** 人数報告不要フラグ (0) */
    public static final String JUMCNT_HKKFYO_FLG = "0";

    /** 特記事項有フラグ (0) */
    public static final String TKK_JKK_FLG = "0";

    /** PageLinkStartIndex (0) */
    public static final String PAGELINKSTARTINDEX = "0";

    /** FCJ対象フラグ ：対象データなし */
    public static final String FCJ_TAISH_NS_FLG = "0";

    /** FCJ対象フラグ ：対象データあり */
    public static final String FCJ_TAISH_AR_FLG = "1";

    /** 作成要否フラグ ：作成不要 */
    public static final String SKS_YM_FY_FLG = "0";

    /** チェック済み状態 : (1) */
    public static final String CHECK_STATUS_ONE = "1";

    /** 新規遷移区分 「1：新規発番」 */
    public static final String SHINKIGMNSENIKBN_01 = "1";

    /** 新規遷移区分 「2：新規」 */
    public static final String SHINKIGMNSENIKBN_02 = "2";

    /** 新規遷移区分「3：差替え」 */
    public static final String SHINKIGMNSENIKBN_03 = "3";

    /** ステータス区分 「1：β版」 */
    public static final String STKBN_01 = "3";

    /** ステータス区分 「2：廃版」 */
    public static final String STKBN_02 = "3";

    /** ステータス区分 「3：現行版」 */
    public static final String STKBN_03 = "3";

    /** ステータス区分 「4：旧版」 */
    public static final String STKBN_04 = "3";

    /** 出庫有効区分 0：出庫可 */
    public static final String SYUKOYKKBN_00 = "0";

    /** 出庫有効区分 2：出庫不可 */
    public static final String SYUKOYKKBN_02 = "2";

    /** 商品区分 ＝ 「0：特資」 */
    public static final String SHN_KBN_00 = "0";

    /** 商品区分 ＝ 「1：付随」 */
    public static final String SHN_KBN_01 = "1";

    /** 商品区分 ＝ 「2：標準」 */
    public static final String SHN_KBN_02 = "2";

    /** 研修開始日(FROM) */
    public static final String KESHUSHU_YMD_FROM = "研修開始日(FROM)";

    /** 研修開始日(TO) */
    public static final String KESHUSHU_YMD_TO = "研修開始日(TO)";

    /** 研修終了日(FROM) */
    public static final String KESHUKA_YMD_FROM = "研修終了日(FROM)";

    /** 研修終了日(TO) */
    public static final String KESHUKA_YMD_TO = "研修終了日(TO)";

    /** エリア区分「4:その他」 */
    public static final String AREA_KBN_SNT = "4";

    /** 課税対象外フラグ : 1課税対象外 */
    public static final String KAZEITS_FLG_1 = "1";

    /** 外税 */
    public static final String OUT_TAX = "（外税）";

    /** 遷移ボタン区分：3 */
    public static final String SENI_BTN_KBN_3 = "3";

    /** 前処理ID：96登録（失敗) */
    public static final String BEFORE_SYORI_ID_96 = "96";

    /** 【置換文字列】：　ID */
    public static final String DISP_STR_ID = "ID";

    /** 遷移ボタン区分 ＝「１：発送・サーベイ管理画面の「イレギュラー（資料発送手配）」ボタン」 */
    public static final String SENI_BTN_KBN_SIRYOHSTH_TEHAI = "1";

    /** 遷移ボタン区分 ＝「２：発送・サーベイ管理画面の「イレギュラー（サーベイ手配）」ボタン」 */
    public static final String SENI_BTN_KBN_SURVEY_TEHAI = "2";

    /** 遷移ボタン区分 ＝「３：発送手配画面の「イレギュラー依頼」ボタン」 */
    public static final String SENI_BTN_KBN_IRR_IRA = "3";

    /** 遷移ボタン区分 ＝「４：発送・サーベイ管理画面の「伝票No」リンク」 */
    public static final String SENI_BTN_KBN_SURVEY_DENNO_LINK = "4";

    /** 遷移ボタン区分 ＝「５：データ管理画面の「伝票No」リンク」 */
    public static final String SENI_BTN_KBN_DATA_DENNO_LINK = "5";

    /** 【置換文字列】：到着日 */
    public static final String DISP_STR_TCK_YMD = "到着日";

    /** 【置換文字列】：研修開始日 */
    public static final String DISP_STR_KEN_KA_YMD = "研修開始日";

    /** 【置換文字列】：後 */
    public static final String DISP_STR_LATER = "後";

    /** 【置換文字列】：回収日 */
    public static final String DISP_STR_KAISHU_YMD = "回収日";

    /** 【置換文字列】：前 */
    public static final String DISP_STR_BEFORE = "前";

    /** 【置換文字列】：前 */
    public static final String IN_EGYO_TWODAY = "2営業日以内";

    /** 【置換文字列】：前 */
    public static final String IN_EGYO_FOURDAY = "4営業日以内";

    /** 【置換文字列】：元伝票に職場コード表が添付されています。イレギュラー受付後、新しい伝票Noで職場コード表 */
    public static final String DISP_STR_GEN_DEN_INFO = "元伝票に職場コード表が添付されています。イレギュラー受付後、新しい伝票Noで職場コード表";

    /** チェックボックス「0：チェックなし」 */
    public static final String CHECK_BOX_UNCHECK = "0";

    /** チェックボックス「1：チェックあり」 */
    public static final String CHECK_BOX_CHECKED = "1";

    /** UNION連結：0 不要 */
    public static final String UNION_ALL_NO = "0";

    /** UNION連結：1 要 */
    public static final String UNION_ALL_YES = "1";

    /** 【置換文字列】：研修終了日 */
    public static final String DISP_STR_KEN_SR_YMD = "研修終了日";

    /** HTTPアクセスURL */
    public static final String STR_HTTP_URL = "property.http.url";

    /** 処理区分：3相談×商品のみ */
    public static final String SHORI_KBN_SDSYHNM = "3";

    /** お知らせ分類コード：007「仮押え期限切れ（提携向け）」 */
    public static final String SRSBR_CD_KRIOSA_KGN = "007";

    /** 文字列：内税 */
    public static final String INNER_TAX = "（内税）";

    /** 文字列：課税対象外 */
    public static final String KZI_TSH_GAI = "（課税対象外）";

    /** 時間状態区分 : 空欄 */
    public static final String TIME_STATUS_KRN = "1";

    /** 時間状態区分 : 相談 */
    public static final String TIME_STATUS_SD = "2";

    /** 時間状態区分 : （研） */
    public static final String TIME_STATUS_KN = "3";

    /** 時間状態区分 : 研修 */
    public static final String TIME_STATUS_KNSH = "4";

    /** 時間状態区分 : ×（自主） */
    public static final String TIME_STATUS_JSH = "5";

    /** 時間状態区分 : 連続稼働不可 */
    public static final String TIME_STATUS_KTHK = "6";

    /** 個人情報ダウンロード権限表示フラグ「0：非活性」 */
    public static final String DL_KGHJ_FLAG_ZERO = "0";

    /** 個人情報ダウンロード権限表示フラグ「1：活性」 */
    public static final String DL_KGHJ_FLAG_ONE = "1";

    /** 個人情報ダウンロード権限フラグ「0：なし」 */
    public static final String DL_KENGEN_FLAG_NASI = "0";

    /** ID権限表示フラグ「0：非活性」 */
    public static final String ID_KENGEN_FLAG_ZERO = "0";

    /** ID権限表示フラグ「1：活性」 */
    public static final String ID_KENGEN_FLAG_ONE = "1";

    /** 認証ミス回数 "0" */
    public static final String PASS_MISS_SU_ZERO = "0";

    /** テンプレート種別 ： 021顧客ID発行(ID) */
    public static final String TEMPLATE_CD_KYKID_HKID = "021";

    /** テンプレート種別 ： 022顧客ID発行(PW) */
    public static final String TEMPLATE_CD_KYKID_HKPW = "022";

    /** テンプレート種別 ： 023顧客ID更新 */
    public static final String TEMPLATE_CD_KYKID_UPDATE = "023";

    /** 日付社名あり区分 = '1' */
    public static final String YMD_SHAMEI_YES = "1";

    /** 新規遷移区分 「0：更新」 */
    public static final String NEW_SENI_KBN_UPDATE = "0";

    /** ALL_分類確定フラグ「1：確定」 */
    public static final String ALL_BRKAKTEI_FLG_KKT = "1";

    /** アクター = 「20：納品スタッフ」 */
    public static final String ACTOR_NOHIN_NM = "20";

    /** 商品区分 = 「0：付・特」 */
    public static final String SHN_KBN_FUTK = "0";

    /** 商品区分 = 「3：パック」 */
    public static final String SHN_KBN_PACK = "3";

    /** ALL_分類確定フラグ「0：未確定」 */
    public static final String ALL_BRKAKTEI_FLG_MKKT = "0";

    /** 作業不要フラグ「0：要」 */
    public static final String SKFY_FLG_ZERO = "0";

    /** 作業不要フラグ 「1：不要」 */
    public static final String SKFY_FLG_ONE = "1";

    /** 出力完了フラグ 「0：未出力」 */
    public static final String OUTKRFLG_ZERO = "0";

    /** 出力完了フラグ 「1：出力済」 */
    public static final String OUTKRFLG_ONE = "1";

    /** 全作業完了フラグ 「0：未完了」 */
    public static final String ZSKKR_FLG_ZERO = "0";

    /** 全作業完了フラグ 「1：完了」 */
    public static final String ZSKKR_FLG_ONE = "1";

    /** 特資完了フラグ 「0：未完了 」 */
    public static final String TOKUKR_FLG_ZERO = "0";

    /** 特資完了フラグ 「1：完了」 */
    public static final String TOKUKR_FLG_ONE = "1";

    /** 特資一式フラグ「0：未一式 」 */
    public static final String TOKUYSK_FLG_ZERO = "0";

    /** 特資一式フラグ 「1：一式あり」 */
    public static final String TOKUYSK_FLG_ONE = "1";

    /** 特資差替フラグ 「0：未差替 」 */
    public static final String TOKUSHI_FLG_ZERO = "0";

    /** 特資差替フラグ「1：差替あり」 */
    public static final String TOKUSHI_FLG_ONE = "1";

    /** 画面表示パターン 「1：パターン1」 */
    public static final String GMHYJ_PATTERN_ONE = "1";

    /** 画面表示パターン 「2：パターン2」 */
    public static final String GMHYJ_PATTERN_TWO = "2";

    /** 画面表示パターン 「3：パターン3」 */
    public static final String GMHYJ_PATTERN_THREE = "3";

    /** タブフラグ「１：＜ＡＬＬ＞タブ」 */
    public static final String TAB_FLG_ALL = "1";

    /** タブフラグ「２：＜付随資料＞タブ」 */
    public static final String TAB_FLG_FSSRY = "2";

    /** タブフラグ「３：＜印刷会社＞タブ」 */
    public static final String TAB_FLG_ISTKS = "3";

    /** タブフラグ「４：＜採点＞タブ」 */
    public static final String TAB_FLG_ISAITEN = "4";

    /** ソートキー:19 */
    public static final String SORT_KEY_19 = "19";

    /** ソートキー:20 */
    public static final String SORT_KEY_20 = "20";

    /** ソートキー:21 */
    public static final String SORT_KEY_21 = "21";

    /** ソートキー:22 */
    public static final String SORT_KEY_22 = "22";

    /** ソートキー:23 */
    public static final String SORT_KEY_23 = "23";

    /** ソートキー:24 */
    public static final String SORT_KEY_24 = "24";

    /** ソートキー:25 */
    public static final String SORT_KEY_25 = "25";

    /** お知らせ分類コード 025：付随資料更新 */
    public static final String SRSBR_CD_FZSR_UPDATE = "025";

    /** お知らせ分類コード 026：特資ファイル更新 */
    public static final String SRSBR_CD_TZFILE_UPDATE = "026";

    /** 「発送ロックフラグ」= 1 */
    public static final String HASSO_LOCK_FLG = "1";

    /** 事前手配ステータス 「1:選択」 */
    public static final String JIZEN_TEHAYI_STS_CHECK = "1";

    /** 採点依頼ステータス 「2:選択」 */
    public static final String SATE_IRA_STS_CHECK = "2";

    /** サーベイ種別ステータス 「3:選択」 */
    public static final String SURVEY_SHUBE_STS_CHECK = "3";

    /** 研修のみ支払区分＝「1：研修のみ支払」 */
    public static final String KS_ONLY_SIHARAI = "1";

    /** 処理区分＝「0：バッチ」 */
    public static final String SHO_RI_KBN_BATCH = "0";

    /** 【置換文字列】：出庫有効区分 */
    public static final String DISP_STR_SKYK_KBN = "出庫有効区分";

    /** 【置換文字列】：権限グループ */
    public static final String DISP_STR_KGGRP = "権限グループ";

    /** 【置換文字列】：アクター */
    public static final String DISP_STR_ACTOR = "アクター";

    /** 【置換文字列】：有効/無効 */
    public static final String DISP_STR_VALID_INVALID = "有効/無効";

    /** 【置換文字列】：会社区分 */
    public static final String DISP_STR_KAISHA_KBN = "会社区分";

    /** お知らせ分類コード 09：基本情報画面の更新（顧客） */
    public static final String SRSBR_CD_UPDATE_KYAKU = "09";

    /** お知らせ分類コード 10：基本情報画面の更新（社内） */
    public static final String SRSBR_CD_UPDATE_SHANAI = "10";

    /** お知らせ分類コード 11：基本情報画面の更新（TR） */
    public static final String SRSBR_CD_UPDATE_TR = "11";

    /** お知らせ分類コード 12：基本情報更新&研修本押え変更依頼 */
    public static final String SRSBR_CD_UPDATE_INRAI = "12";

    /** お知らせ分類コード 14：基本情報のキャンセル */
    public static final String SRSBR_CD_CANCLE = "14";

    /** 基本情報営業担当ID更新フラグ「１：ON」 */
    public static final String KHNJH_EGYTNT_ID_UP_FLG_ON = "1";

    /** 基本情報営業担当ID更新フラグ「0：OFF」 */
    public static final String KHNJH_EGYTNT_ID_UP_FLG_OFF = "0";

    /** 基本情報研修納品スタッフID更新フラグ */
    public static final String KHNJH_KNSH_NHN_STFID_UP_FLG_ON = "1";

    /** 基本情報研修納品スタッフID更新フラグ */
    public static final String KHNJH_KNSH_NHN_STFID_UP_FLG_OFF = "0";

    /** 基本情報担当営業変更PRISM連携フラグ更新フラグ */
    public static final String KHNJH_EGYTNT_HNK_PRISM_UP_FLG_ON = "1";

    /** 基本情報担当営業変更PRISM連携フラグ更新フラグ */
    public static final String KHNJH_EGYTNT_HNK_PRISM_UP_FLG_OFF = "0";

    /** 基本情報担当研スタ変更PRISM連携フラグ更新フラグ */
    public static final String KHNJH_TNTKN_HNK_PRISM_UP_FLG_ON = "1";

    /** 基本情報担当研スタ変更PRISM連携フラグ更新フラグ */
    public static final String KHNJH_TNTKN_HNK_PRISM_UP_FLG_OFF = "0";

    /** 押え情報営業担当ID更新フラグ */
    public static final String OSAJH_EGYTNT_UP_FLG_ON = "1";

    /** 押え情報営業担当ID更新フラグ */
    public static final String OSAJH_EGYTNT_UP_FLG_OFF = "0";

    /** 押え情報担当営業変更PRISM連携フラグ更新フラグ */
    public static final String OASJH_TNTEGY_PRISM_UP_FLG_ON = "1";

    /** 押え情報担当営業変更PRISM連携フラグ更新フラグ */
    public static final String OASJH_TNTEGY_PRISM_UP_FLG_OFF = "0";

    /** 押え情報費用負担組織コード_A更新フラグ */
    public static final String OASJH_HY_FTN_A_UP_FLG_ON = "1";

    /** 押え情報費用負担組織コード_A更新フラグ */
    public static final String OASJH_HY_FTN_A_UP_FLG_OFF = "0";

    /** 押え情報費用負担組織コード_B更新フラグ */
    public static final String OASJH_HY_FTN_B_UP_FLG_ON = "1";

    /** 押え情報費用負担組織コード_B更新フラグ */
    public static final String OASJH_HY_FTN_B_UP_FLG_OFF = "0";

    /** お知らせ分類コード String 「028：各種手配」 */
    public static final String SRSBR_CD_KSSP = "028";

    /** 基本情報NOの物理名 */
    public static final String KHNINFO_NO_NAME = "khnInfoNo";

    /** 名称コード区分 */
    public static final String NAME_CODE_KUBEN = "MAGYOSHU";

    /** 【置換文字列】：PRISM連携 */
    public static final String DISP_STR_PRISM_REN = "PRISM連携";

    /** 項目NO 33 */
    public static final String ITEM_NO_33 = "33";

    /** 項目NO 46 */
    public static final String ITEM_NO_46 = "46";

    /** 条件項目名：SKOTYU_KKT_YMD */
    public static final String STR_SKOTYU_KKT_YMD = "SKOTYU_KKT_YMD";

    /** 変更通知モーダル表示フラグ0：非表示 */
    public static final String HK_ALERTMDIHI_FLAG_HIHYOUJI = "0";

    /** ワーニングフラグ = 「0：ワーニングではない」 */
    public static final String WANING_FLG_NO = "0";

    /** ワーニングフラグ = 「1：ワーニング」 */
    public static final String WANING_FLG_YES = "1";

    /** ワーニングチェック有りフラグ ＝ 「1：チェック有り」 */
    public static final String WANING_CHECK_ARI = "1";

    /** ワーニングダイアログ出力フラグ = 「1：出力」 */
    public static final String WANING_DAIALOGU_SHUTURYOKU = "1";

    /** その他社内関係者存在フラグ ＝ 「1：存在」 */
    public static final String SNT_SYANAI_KANKEISYA_ARI = "1";

    /** コントロール区分 固定値：HCSIMEZUMIYM */
    public static final String STR_HCSIMEZUMIYM = "HCSIMEZUMIYM";

    /** 固定値：出荷伝票No */
    public static final String STR_SHUQKA_DEN_NO = "出荷伝票No";

    /** 返送先：「1：会場」 */
    public static final String HENSAKI_KJ = "1";

    /** 返送先：「2：先方」 */
    public static final String HENSAKI_SH = "2";

    /** 返送先：「3：その他」 */
    public static final String HENSAKI_SNT = "3";

    /** 返送先：「4：担当者」 */
    public static final String HENSAKI_TTS = "4";

    /** 回収先：「1：会場」 */
    public static final String KAISHU_KJ = "1";

    /** 回収先：「2：先方」 */
    public static final String KAISHU_SH = "2";

    /** 回収先：「3：その他」 */
    public static final String KAISHU_SNT = "3";

    /** 回収先：「4：担当者」 */
    public static final String KAISHU_TTS = "4";

    /** 処理区分：「1：オンライン」 */
    public static final String SHO_RI_KBN_ONLINE = "1";

    /** コード一覧リストから取得した権限グループ名 */
    public static final String CD_LIST_KGGRP_NM = "C0140CodeList";

    /** コード一覧リストから取得したアクター名 */
    public static final String CD_LIST_ACTOR_NM = "C0136CodeList";

    /** 固定値：2 */
    public static final int COUNT_TWO = 2;

    /** パック資料名データ */
    public static final String PACK_SIRYOU_DATA = "パック資料名データ";

    /** 拡張子：.xlsx */
    public static final String SUFFIX_NA = ".xlsx";

    /** 遷移元区分 = "16：報告書作成依頼画面" */
    public static final String SENYIGENKUBUN_16 = "16";

    /** 基本情報区分コード (30：公開・開発トライアル) */
    public static final String KHNINFO_KBN_CD_TTEN = "30";

    /** ＴＲスケジュール参照 */
    public static final String TR_SKJYUR_SNSYOU = "ＴＲスケジュール参照";

    /** ＴＲ支払月次集計 */
    public static final String TR_SHR_GTJ_SYOUK = "ＴＲ支払月次集計";

    /** 管理会計データ */
    public static final String KNRKIKI_DATA = "管理会計データ";

    /** 置換文字列 ： 基本情報一覧【顧客】 */
    public static final String DISP_KHINFO_IRNN_KYJSNN = "基本情報一覧【顧客】";

    /** シート名 ： 基本情報一覧（社内） */
    public static final String STNA_KHINFO_IRNN_SYNI = "基本情報一覧（社内）";

    /** 置換文字列 ：基本情報一覧【社内・ＴＲ】 */
    public static final String DISP_KHINFO_IRNN_SYN = "基本情報一覧【社内・ＴＲ】";

    /** 画面遷移ID 「1：B101_基本情報一覧(社内)」 */
    public static final String GMNSNNY_ID_IRNN_SYNI = "1";

    /** 画面遷移ID 「2：B102_基本情報一覧(TR)」 */
    public static final String GMNSNNY_ID_IRNN_TR = "2";

    /** ファイル名 ：基本情報一覧（顧客） */
    public static final String FILE_KHINFO_IRNN_KYJSNN = "基本情報一覧（顧客）";

    /** DATEフォーマット ： yyyyMMdd_hhmmss */
    public static final String DATE_FORMAT_YYYYMMDD_HHMMSS = "yyyyMMdd_HHmmss";

    /** 【置換文字列】 受渡日 */
    public static final String DISP_JYHNCH = "受渡日";

    /** 【置換文字列】 付随シール区分 */
    public static final String DISP_HUSUSHEET_GUKU = "付随シール区分";

    /** 【置換文字列】 印刷区分 */
    public static final String DISP_INZA_GUKU = "印刷区分";

    /** 【置換文字列】 到着日 */
    public static final String DISP_TCHAKUYMD = "到着日";

    /** 【置換文字列】 200 */
    public static final String DISP_NIPYAKU = "200";

    /** 付随シール区分＝「01：付随資料」 */
    public static final String HUSUSHEET_GUKU_HUSUSHRYO = "01";

    /** 付随シール区分＝「02：印刷会社」 */
    public static final String HUSUSHEET_GUKU_INZAKASYA = "02";

    /** 付随シール区分＝「03：採点」 */
    public static final String HUSUSHEET_GUKU_SATE = "03";

    /** 付随シール(付随資料) */
    public static final String HUSUSHEET_HUSUSHRYO = "付随シール(付随資料)";

    /** 付随シール(印刷会社) */
    public static final String HUSUSHEET_INZAKASYA = "付随シール(印刷会社)";

    /** 付随シール(採点) */
    public static final String HUSUSHEET_SATE = "付随シール(採点)";

    /** 設定コード L308_TEMPLE_1 */
    public static final String L308_TEMPLE_1 = "L308_TEMPLE_1";

    /** 設定コード L309_TEMPLE_1 */
    public static final String L309_TEMPLE_1 = "L309_TEMPLE_1";

    /** 設定コード L310_TEMPLE_1 */
    public static final String L310_TEMPLE_1 = "L310_TEMPLE_1";

    /** 設定コード SUBNM_BUTURYU */
    public static final String SUBNM_BUTURYU = "SUBNM_BUTURYU";

    /** 記号"_" */
    public static final String ONDER_LINE = "_";

    /** 【同梱伝票NO】"無し" */
    public static final String DODENHYO_NASHI = "無し";

    /** 【置換文字列】 ライセンス一覧 */
    public static final String DISP_RASEINNSU_ITIRANN = "ライセンス一覧";

    /** 固定文字：9 */
    public static final String STR_NINE = "9";

    /** ＴＲ契約・報酬一覧 */
    public static final String TR_KEIYAKU_HOUSHUU = "ＴＲ契約・報酬一覧";

    /** 呼び出すボタン区分（特資申請） = 「１：特資新規」 */
    public static final String OUTBTN_KBN_TSSK = "1";

    /** 呼び出すボタン区分（特資申請） = 「２：特資新規更新」 */
    public static final String OUTBTN_KBN_TSSKKS = "2";

    /** 呼び出すボタン区分（特資申請） = 「３：閲覧可差替新規」 */
    public static final String OUTBTN_KBN_ERKSKSK = "3";

    /** 呼び出すボタン区分（特資申請） = 「４：差替新規」 */
    public static final String OUTBTN_KBN_KSSK = "4";

    /** 呼び出すボタン区分（特資申請） = 「５：差替更新」 */
    public static final String OUTBTN_KBN_KSKS = "5";

    /** 呼び出すボタン区分（特資申請） = 「６：特資ファイル登録完了」 */
    public static final String OUTBTN_KBN_TSFTRKR = "6";

    /** 呼び出すボタン区分（特資申請） = 「７：特資ファイル差替完了」 */
    public static final String OUTBTN_KBN_TSFKSKR = "7";

    /** ファイル名 ：基本情報一覧（社内・ＴＲ） */
    public static final String FILE_KHINFO_IRNN_SYNI = "基本情報一覧（社内・ＴＲ）";

    /** シート名 ：基本情報一覧 */
    public static final String STNA_KHINFO_IRNN_KYJSNN = "基本情報一覧";

    /** 置換文字列:ＴＲ稼動月次集計 */
    public static final String DISP_TRKADO_GETUJI_SYUKEI = "ＴＲ稼動月次集計";

    /** ファイル名:ＴＲ稼動月次集計表 */
    public static final String FILE_TRKADO_GETUJI_SYUKEI_HYO = "ＴＲ稼動月次集計表";

    /** シート名 ：ＴＲ報酬・契約一覧 */
    public static final String STNA_TR_HOUSYOU_KEIYAKU = "ＴＲ報酬・契約一覧";

    /** シート名 ：TR日程検索 */
    public static final String STNA_TR_NT_KNSK = "ＴＲ日程検索";

    /** シート名 ：ＴＲ押え一覧 */
    public static final String STNA_TR_OSA_ITRN = "ＴＲ押え一覧";

    /** シート名 ：管理会計データ */
    public static final String STNA_KANRIKK_DATE = "管理会計データ";

    /** シート名 ：TR支払一覧 */
    public static final String STNA_TR_SHR_YTI_RAN = "ＴＲ支払一覧";

    /** C0001：基本情報区分 */
    public static final String CODE_LIST_C0001 = "C0001CodeList";

    /** C0002：基本情報ステータス */
    public static final String CODE_LIST_C0002 = "C0002CodeList";

    /** C0007：アンケート有フラグ */
    public static final String CODE_LIST_C0007 = "C0007CodeList";

    /** C0005：アンケート種類 */
    public static final String CODE_LIST_C0005 = "C0005CodeList";

    /** C0006：所感不要理由コード */
    public static final String CODE_LIST_C0006 = "C0006CodeList";

    /** C0003：手配 */
    public static final String CODE_LIST_C0003 = "C0003CodeList";

    /** C0004：負担 */
    public static final String CODE_LIST_C0004 = "C0004CodeList";

    /** 固定値：03 */
    public static final String STR_ZEROTHREE = "03";

    /** 固定値：04 */
    public static final String STR_ZEROFOUR = "04";

    /** 固定値:SEQ_COMMON_SIRYO_NO */
    public static final String SEQ_COMMON_SIRYO_NO = "SEQ_COMMON_SIRYO_NO";

    /** 固定値:RLC */
    public static final String RYOIKI_RLC = "RLC";

    /** 固定値:カウンセリング */
    public static final String RYOIKI_CONSELINK = "カウンセリング";

    /** 固定値:イン */
    public static final String RYOIKI_INN = "イン";

    /** カウント区分 = 「0：日数」 */
    public static final String COUNTKBN_ZERO = "0";

    /** カウント区分 = 「1：件数」 */
    public static final String COUNTKBN_ONE = "1";

    /** ＴＲ支払一覧（キャンセル） */
    public static final String DISP_TRSHIRN_CANCEL = "ＴＲ支払一覧（キャンセル）";

    /** 帳票テンプレートファイル名 */
    public static final String L215_TEMPLE_1 = "L215_TEMPLE_1";

    /** 伝票検索（回収単位） */
    public static final String DISP_DENSEARCH_KAISUTAI = "伝票検索(回収単位)";

    /** 帳票テンプレートファイル名 */
    public static final String L207_TEMPLE_1 = "L207_TEMPLE_1";

    /** 発注書 */
    public static final String DISP_HATYUSYO = "発注書";

    /** お知らせ分類コード＝"022" 申請（営業・ＴＲ） */
    public static final String SRSBR_CD_SINSEI_EG_TR = "022";

    /** 新規更新フラグ　0：更新 */
    public static final String NEW_UPDATE_FLG_UPDATE = "0";

    /** 新規更新フラグ　1：新規 */
    public static final String NEW_UPDATE_FLG_NEW = "1";

    /** 新規差替区分 1：新規 */
    public static final String NEW_SKE_KBN_NEW = "1";

    /** 新規差替区分 2：差替 */
    public static final String NEW_SKE_KBN_SKE = "2";

    /** 【置換文字列】：表示順 */
    public static final String DISP_STR_HYOUJI_JUN = "表示順";

    /** 【置換文字列】：ファイル */
    public static final String DISP_STR_FILE = "ファイル";

    /** 【置換文字列】：空白以外 */
    public static final String DISP_STR_KOUBAI_OUT = "空白以外";

    /** 押え区分リストコード */
    public static final String OSAKBN_RISUTO_CODE = "C0031CodeList";

    /** 【置換文字列】： G000000_職場コード表(紙) */
    public static final String DISP_SYOKUBA_CODE = "G000000_職場コード表(紙)";

    /** シート名 ：職場コード表_紙用 */
    public static final String STNA_SYOKUBA_CODE = "職場コード表_紙用";

    /** ファイル名 ：G000000_職場コード表(紙版) */
    public static final String FILE_SYOKUBA_CODE = "G000000_職場コード表(紙版)";

    /** 【置換文字列】：G000000_職場コード表(WEB) */
    public static final String DISP_SYOKUBA_CODE_WEB = "G000000_職場コード表(WEB)";

    /** シート名 ：職場コード表_WEB用 */
    public static final String STNA_SYOKUBA_CODE_WEB = "職場コード表_WEB用";

    /** ファイル名 ：G000000_職場コード表(WEB版) */
    public static final String FILE_SYOKUBA_CODE_WEB = "G000000_職場コード表(WEB版)";

    /** シート名：発注書 */
    public static final String STNA_HATYUSYO = "発注書";

    /** シート名：実践ナビ実施情報 */
    public static final String STNA_JKEN_NABI = "実践ナビ実施情報";

    /** 【置換文字列】：JSN実施情報 */
    public static final String DISP_JSN_JSHI_INFO = "JSN実施情報";

    /** 帳票テンプレートファイル名 */
    public static final String L208_TEMPLE_1 = "L208_TEMPLE_1";

    /** 【設定コード】L205_TEMPLE_1
L205 */
    public static final String L205_TEMPLE_1 = "L205_TEMPLE_1";

    /** 【置換文字列】
アセス採点依頼書
L205 */
    public static final String DISP_ACS_ST_YR_S = "アセス採点依頼書";

    /** 【置換文字列】
サーベイスケジュール
L206 */
    public static final String DISP_SB_SCJR = "サーベイスケジュール";

    /** 【sheetName】
L206
 */
    public static final String STNA_TSH_SCJR = "調査票スケジュール";

    /** 【設定コード】L206_TEMPLE_1
L206 */
    public static final String L206_TEMPLE_1 = "L206_TEMPLE_1";

    /** 【置換文字列】
科目組み合わせマスタ
T301 */
    public static final String DISP_KMK_KMAWS_MST = "科目組み合わせマスタ";

    /** 【置換文字列】
売上No
T301 */
    public static final String DISP_URI_NO = "売上No";

    /** 【置換文字列】
売上情報
T301 */
    public static final String DISP_URI_JH = "売上情報";

    /** 【置換文字列】
DOCODEMO科目マスタ
T301 */
    public static final String DISP_DOCODEMO_KMK_MST = "DOCODEMO科目マスタ";

    /** 【置換文字列】
DOCODEMO補助科目マスタ
T301 */
    public static final String DISP_DOCODEMO_HJ_KMK_MST = "DOCODEMO補助科目マスタ";

    /** 【置換文字列】
DOCODEMO部門マスタ
T301 */
    public static final String DISP_DOCODEMO_BM_MST = "DOCODEMO部門マスタ";

    /** 【置換文字列】
交通費
T301 */
    public static final String DISP_KTH = "交通費";

    /** 【置換文字列】
宿泊費
T301 */
    public static final String DISP_SHKHKH = "宿泊費";

    /** 【置換文字列】：サーベイ資料発送伝票（Carico） */
    public static final String DISP_SABEII_SHIRYOU_HATUHYOU = "サーベイ資料発送伝票（Carico）";

    /** シート名：サーベイ資料発送伝票 (CariCo) */
    public static final String STNA_SABEII_SHIRYOU_HATUHYOU = "サーベイ資料発送伝票 (CariCo)";

    /** 伝票検索（資料明細単位） */
    public static final String STNA_DENBYOU_KENSAKU_SIR = "伝票検索(資料明細単位)";

    /** 伝票検索（伝票単位) */
    public static final String STNA_DENBYOU_KENSAKU_TANI = "伝票検索(伝票単位)";

    /** C0082：伝票種別 */
    public static final String CODE_LIST_C0082 = "C0082CodeList";

    /** C0081：伝票処理区分 */
    public static final String CODE_LIST_C0081 = "C0081CodeList";

    /** C0083：発送先 */
    public static final String CODE_LIST_C0083 = "C0083CodeList";

    /** C0087：実施形態 */
    public static final String CODE_LIST_C0087 = "C0087CodeList";

    /** C0124：サーベイ種別 */
    public static final String CODE_LIST_C0124 = "C0124CodeList";

    /** C0089：納品形態 */
    public static final String CODE_LIST_C0089 = "C0089CodeList";

    /** C0090：報告書レイアウト */
    public static final String CODE_LIST_C0090 = "C0090CodeList";

    /** C0088：商品詳細 */
    public static final String CODE_LIST_C0088 = "C0088CodeList";

    /** 【置換文字列】：採点依頼伝票（CariCo） */
    public static final String DISP_SATENDENHYO_CARICO = "採点依頼伝票（CariCo）";

    /** 【置換文字列】：採点依頼伝票（DeruCo） */
    public static final String DISP_SATENDENHYO_DERUCO = "採点依頼伝票(DeruCo)";

    /** シート名：伝票No（CariCo） */
    public static final String STNA_DENNO_CARICO = "伝票No";

    /** シート名：伝票No（DeruCo） */
    public static final String STNA_DENNO_DERUCO = "伝票No";

    /** C0135：伝票処理区分 */
    public static final String CODE_LIST_C0135 = "C0135CodeList";

    /** C0029：発送方法区分 */
    public static final String CODE_LIST_C0029 = "C0029CodeList";

    /** C0109：納品先 */
    public static final String CODE_LIST_C0109 = "C0109CodeList";

    /** 帳票テンプレート名 */
    public static final String T301_TEMPLE_1 = "T301_TEMPLE_1";

    /** 【置換文字列】：空白 */
    public static final String DISP_STR_KOUBAI = "空白";

    /** C0098:資料形態 */
    public static final String CODE_LIST_C0098 = "C0098CodeList";

    /** C0100:出力形式 */
    public static final String CODE_LIST_C0100 = "C0100CodeList";

    /** C0101:資料出力サイズ */
    public static final String CODE_LIST_C0101 = "C0101CodeList";

    /** C0102:用紙・色 */
    public static final String CODE_LIST_C0102 = "C0102CodeList";

    /** C0103:穴・綴じ */
    public static final String CODE_LIST_C0103 = "C0103CodeList";

    /** C0104:折り */
    public static final String CODE_LIST_C0104 = "C0104CodeList";

    /** C0105:縮小・拡大 */
    public static final String CODE_LIST_C0105 = "C0105CodeList";

    /** シート名：サーベイ進捗一覧（ＣａｒｉＣｏ） */
    public static final String STNA_SABEII_SHNCHK_ITRN_CRC = "サーベイ進捗一覧（Carico）";

    /** 【置換文字列】：資料詳細Excel */
    public static final String DISP_SR_SHS_EXCEL = "資料詳細Excel";

    /** シート名：資料詳細 */
    public static final String STNA_SR_SHS_EXCEL = "資料詳細";

    /** シート名：定期便受渡台帳（ALL-到着） */
    public static final String STNA_TKBN_UKWTSH_DCH_PRT_SHR = "定期便受渡台帳（印刷会社→資料）";

    /** シート名：定期便受渡台帳（印刷会社→資料） */
    public static final String STNA_TKBN_UKWTSH_DCH_ALL_TCHK = "定期便受渡台帳（ALL-到着）";

    /** お知らせ分類コード＝"023" */
    public static final String SRSBR_CD_SINSEI_023 = "023";

    /** お知らせ分類コード＝"024" */
    public static final String SRSBR_CD_SINSEI_024 = "024";

    /** 【置換文字列】：処理中以外 */
    public static final String DISP_STR_SINS_SHRCH_OUT = "処理中以外";

    /** 【置換文字列】：差替申請中以外 */
    public static final String DISP_STR_SINS_SSKESNSCH_OUT = "差替申請中以外";

    /** 【置換文字列】：研修資料発送伝票 */
    public static final String DISP_KENSYU_SHIRYOU_HATTSO_DENBYOU = "研修資料発送伝票";

    /** C0084：資料回収有無区分 */
    public static final String CODE_LIST_C0084 = "C0084CodeList";

    /** C0085：返送先区分 */
    public static final String CODE_LIST_C0085 = "C0085CodeList";

    /** 固定値:名 */
    public static final String STR_MEI = "名";

    /** ファイル名 ：研修資料発送伝票 */
    public static final String FILE_STR_SINS_SSKESNSCH_OUT = "研修資料発送伝票";

    /** ファイル名 ：付随明細一覧（付随） */
    public static final String DISP_FZIMSIRN_MS_FZ = "付随明細一覧（付随）";

    /** ファイル名 ：付随明細一覧（ALL） */
    public static final String DISP_FZIMSIRN_MS_ALL = "付随明細一覧（ALL）";

    /** 資料種別 */
    public static final String SRYO_KBN_TWO = "2";

    /** 帳票テンプレート名 */
    public static final String L401_TEMPLE_1 = "L401_TEMPLE_1";

    /** 帳票テンプレート名 */
    public static final String L402_TEMPLE_1 = "L402_TEMPLE_1";

    /** 帳票テンプレート名 */
    public static final String L403_TEMPLE_1 = "L403_TEMPLE_1";

    /** 研修用袋詰方法 */
    public static final String CODE_LIST_C0110 = "C0110CodeList";

    /** DATEフォーマット ：yyyy年MM月dd日 hh:mm */
    public static final String YYYYMMDD_KANNJI_HM = "yyyy年MM月dd日 hh:mm";

    /** 【設定コード】L316_TEMPLE_1
L316 */
    public static final String L316_TEMPLE_1 = "L316_TEMPLE_1";

    /** 【置換文字列】データ管理一覧L316 */
    public static final String DISP_DT_KR_YTR = "データ管理一覧";

    /** C0132：個別梱包データ管理一覧L316 */
    public static final String CODE_LIST_C0132 = "C0132CodeList";

    /** C0134：バインダー綴じデータ管理一覧L316 */
    public static final String CODE_LIST_C0134 = "C0134CodeList";

    /** C0133：タイムサービスデータ管理一覧L316 */
    public static final String CODE_LIST_C0133 = "C0133CodeList";

    /** ファイル名 ：付随明細一覧（印刷会社） */
    public static final String DISP_FZIMSIRN_KISYA = "付随明細一覧（印刷会社）";

    /** ファイル名 ：付随明細一覧（採点） */
    public static final String DISP_FZIMSIRN_SATEN = "付随明細一覧（採点）";

    /** C0117:アドバイスシート有無区分 */
    public static final String CODE_LIST_C0117 = "C0117CodeList";

    /** 固定値:伝票No */
    public static final String STR_DENNO = "伝票No";

    /** 付随一覧（伝票単位） */
    public static final String STNA_FUZUI_ITIRAN = "付随一覧（伝票単位）";

    /** 【置換文字列】サーベイ進捗一覧（DeruCo）L403 */
    public static final String DISP_SVKB_YT_RAN = "サーベイ進捗一覧（DeruCo）";

    /** C0086：タイムサービスサーベイ種別L403 */
    public static final String CODE_LIST_C0086 = "C0086CodeList";

    /** 付随一覧（資料明細単位） */
    public static final String STNA_FUZUI_ITIRAN_SIRYO = "付随一覧（資料明細単位）";

    /** odp_irai */
    public static final String DISP_ODP_IRAI = "odp_irai";

    /** ファイル名:発注書 */
    public static final String FILE_HATYUSYO = "発注書";

    /** ファイル名:JSN実施情報 */
    public static final String FILE_JSN_JISHI_INFO = "JSN実施情報";

    /** ファイル名:伝票検索（回収単位）_ */
    public static final String FILE_DENHYO_KENSAK_KAI = "伝票検索（回収単位）";

    /** ファイル名：採点依頼伝票（Deruco) */
    public static final String FILE_SATEIRA_DERUCO = "採点依頼伝票（Deruco)";

    /** ファイル名：採点依頼伝票 (Carico) */
    public static final String FILE_SATEIRA_CARICO = "採点依頼伝票（CariCo）";

    /** ファイル名：siryo */
    public static final String FILE_SIRYO = "siryo";

    /** 登録・更新後区分  「2：更新」 */
    public static final String AFTER_TRKUPDATE_KBN_2 = "2";

    /** 登録・更新後区分  「1：登録」 */
    public static final String AFTER_TRKUPDATE_KBN_1 = "1";

    /** 【置換文字列】到着日From */
    public static final String MSG_STR_TCK_YMD_FROM = "到着日From";

    /** 【置換文字列】到着日To */
    public static final String MSG_STR_TCK_YMD_TO = "到着日To";

    /** 【置換文字列】研修開始日To */
    public static final String MSG_STR_KEN_KA_YMD_TO = "研修開始日To";

    /** 【置換文字列】受渡日From */
    public static final String MSG_JYHNCH_FROM = "受渡日From";

    /** 【置換文字列】受渡日To */
    public static final String MSG_JYHNCH_TO = "受渡日To";

    /** 【置換文字列】分類確定日To */
    public static final String MSG_BRKAKTE_YMD_TO = "分類確定日To";

    /** 【置換文字列】区分 */
    public static final String MSG_KUBEN = "区分";

    /** 【置換文字列】付随シール出力単位 */
    public static final String MSG_HZSR_KBN = "付随シール出力単位";

    /** 【置換文字列】印刷出力単位 */
    public static final String MSG_INSTU_KBN = "印刷出力単位";

    /** 【置換文字列】定期便台帳出力単位 */
    public static final String MSG_TEKIBNTACYO_TY = "定期便台帳出力単位";

    /** 【置換文字列】Excel出力単位 */
    public static final String MSG_EXCEL_TY = "Excel出力単位";

    /** 【置換文字列】印刷対象 */
    public static final String MSG_INSTU_TAISYOU = "印刷対象";

    /** 【置換文字列】：サーベイ資料発送伝票 (Deruco) */
    public static final String DISP_SABEII_SHIRYOU_HASSO_DENPO = "サーベイ資料発送伝票 (Deruco)";

    /** シート名：G000000_CariCo回答者情報(紙版) */
    public static final String STNA_GOOOOOOO_CRC_KTSH_INFO_KMBN = "G000000_CariCo回答者情報(紙版)";

    /** シート名：G000000_CariCo回答者情報(WEB版) */
    public static final String STNA_GOOOOOOO_CRC_KTSH_INFO_WEBBN = "G000000_CariCo回答者情報(WEB版)";

    /** 【置換文字列】pack_master */
    public static final String DISP_PACK_MASTER = "pack_master";

    /** 【置換文字列】siiresaki_master */
    public static final String DISP_SIIRESAKI_MASTER = "siiresaki_master";

    /** 【置換文字列】siryo_master */
    public static final String DISP_SIRYO_MASTER = "siryo_master";

    /** 遷移元画面区分：(30：L502：採点管理一覧) */
    public static final String YSD_SUTAFFU = "30";

    /** 更新フラグ（変数） = 「0：更新」 */
    public static final String UPDATE_HENSU_YES = "0";

    /** 更新フラグ（変数） = 「1：更新不要」 */
    public static final String UPDATE_HENSU_NO = "1";

    /** 【置換文字列】定期便受渡台帳（付随→資料） */
    public static final String DISP_TKBN_UKWTSH_DCH_BZI_SRYO = "定期便受渡台帳（付随→資料）";

    /** シート名：定期便受渡台帳（付随→資料） */
    public static final String STNA_TKBN_UKWTSH_DCH_BZI_SRYO = "定期便受渡台帳（付随→資料）";

    /** ファイル名 ：定期便受渡台帳（付随→資料） */
    public static final String FILE_TKBN_UKWTSH_DCH_BZI_SRYO = "定期便受渡台帳（付随→資料）";

    /** 固定値:A */
    public static final String STR_A = "A";

    /** 個別梱包又はアドバイスがあるの場合 ： 有 */
    public static final String ARU_YOU = "有";

    /** 帳票のヘーダ：伝票No */
    public static final String HEAD_DEN_NO = "伝票No";

    /** サーベイ種別が選択の場合 = 「3:選中」 */
    public static final String SA_BEYI_SYUBETSU = "3";

    /** 回答者情報 */
    public static final String KTSH_INFO = "回答者情報";

    /** 申請（営業・ＴＲ）フラグ "1" */
    public static final String SNSEETFLG_1 = "1";

    /** 遷移先区分の物理名 */
    public static final String FRWDESTSORT_NAME = "frwdDestSort";

    /** 条件項目値＝"6" */
    public static final String PRO_VALUE_6 = "6";

    /** 条件項目値＝"7" */
    public static final String PRO_VALUE_7 = "7";

    /** 帳票部品出力フラグ "L201" */
    public static final String EXCEL_OUT_FLG_L201 = "L201";

    /** 帳票部品出力フラグ "L202" */
    public static final String EXCEL_OUT_FLG_L202 = "L202";

    /** 帳票部品出力フラグ "L203" */
    public static final String EXCEL_OUT_FLG_L203 = "L203";

    /** 帳票部品出力フラグ "L204" */
    public static final String EXCEL_OUT_FLG_L204 = "L204";

    /** 帳票部品出力フラグ "L205" */
    public static final String EXCEL_OUT_FLG_L205 = "L205";

    /** 帳票部品出力フラグ "L206" */
    public static final String EXCEL_OUT_FLG_L206 = "L206";

    /** 帳票部品出力フラグ "L207" */
    public static final String EXCEL_OUT_FLG_L207 = "L207";

    /** 帳票部品出力フラグ "L208" */
    public static final String EXCEL_OUT_FLG_L208 = "L208";

    /** 【置換文字列】研修開始日From */
    public static final String MSG_STR_KEN_KA_YMD_FROM = "研修開始日From";

    /** 【置換文字列】分類確定日From */
    public static final String MSG_BRKAKTE_YMD_FROM = "分類確定日From";

    /** 基本情報区分コード:40 */
    public static final String KHNINFO_KBNCODE_40 = "40";

    /** 操作フラグ:insert */
    public static final String SUS_INSERT = "insert";

    /** 操作フラグ:delete */
    public static final String SUS_DELETE = "delete";

    /** 操作フラグ:update */
    public static final String SUS_UPDATE = "update";

    /** 作成担当区分:印刷会社 */
    public static final String SAKUNAME_1 = "印刷会社";

    /** 作成担当区分:Ｙ添付物 */
    public static final String SAKUNAME_2 = "Ｙ添付物";

    /** 作成担当区分:Ｙ研修資料 */
    public static final String SAKUNAME_3 = "Ｙ研修採点";

    /** 作成担当区分:Ｙ研修採点 */
    public static final String SAKUNAME_4 = "Ｙ研修採点";

    /** 作成担当区分:納品スタッフ */
    public static final String SAKUNAME_5 = "納品スタッフ";

    /** L304 -- L307 のテンプレートシート名 */
    public static final String SHEET_NAME_DNPYNO = "伝票No";

    /** 背景色フラグ＝「３：グレ」 */
    public static final String BACK_COLOR_FLAG_GRAY = "3";

    /** 差替申請Ｎoの物理名 */
    public static final String SKSS_NO_NAME = "skSsNo";

    /** 遷移元画面区分  = 「6：×登録画面」 */
    public static final String X_INSERT_GAMEN = "6";

    /** シート名：G000000_CariCo回答者情報(紙版) */
    public static final String STNA_DENNO = "伝票No";

    /** シート名：G000000_CariCo回答者情報(紙版) */
    public static final String STNA_NHN_MSSH = "納品明細書";

    /** 固定値:GIAL */
    public static final String STR_GIAL = "GIAL";

    /** 固定値:WVI */
    public static final String STR_WVI = "WVI";

    /** 固定値:BSI */
    public static final String STR_BSI = "BSI";

    /** 固定値:CD */
    public static final String STR_CD = "CD";

    /** 固定値:CI */
    public static final String STR_CI = "CI";

    /** 固定値:JFI */
    public static final String STR_JFI = "JFI";

    /** 固定値:CIS */
    public static final String STR_CIS = "CIS";

    /** 新規顧客コード_拠点 */
    public static final String KKYK_KYTN_CD_NEW = "000";

    /** 暗号化・復号化用の秘密鍵 */
    public static final String CRYPT_KEY = "CRYPT_KEY";

    /** アンケート作成フラグ（一時変数）「1：作成」 */
    public static final String ANQUETE_SK_FLG_1 = "1";

    /** アンケート論理削除フラグ（一時変数）「1：論理削除」 */
    public static final String ANQUETE_RINRI_DEL_1 = "1";

    /** 所感作成フラグ（一時変数）「1：作成」 */
    public static final String SYOKAN_SK_FLG_1 = "1";

    /** 所感論理削除フラグ（一時変数）「1：論理削除」 */
    public static final String SYOKAN_RINRI_DEL_FLG_1 = "1";

    /** 登録・更新区分 ＝ 「2：新規登録後」 */
    public static final String INSERT_UPDATE_AFTER_KBN2 = "2";

    /** "スケジュールNo：　" */
    public static final String STR_SCR_NUMBER_SPACE = "スケジュールNo　：";

    /** STR："ＴＲ月次請求書" */
    public static final String SHEET_NAME_YYYY_MM = "YYYY年MM月請求書 ";

    /** STR："YYYY年MM月請求書" */
    public static final String FILE_NAME_TR_GTSUSY = "ＴＲ月次請求書";

    /** 支払種別  01：通常 */
    public static final String SHRSHUBE_CD_ONE = "01";

    /** 課税対象外フラグ  1：非課税対象 */
    public static final String KAZEITSFLG_ONE = "1";

    /** 文字 : 確定 */
    public static final String MONJI_KAKUTEI = "確定";

    /** 文字 : 無 */
    public static final String MONJI_MU = "無";

    /** 文字 : 有 */
    public static final String MONJI_ARI = "有";

    /** 法人区分コード 1:法人 */
    public static final String HJNKBNCD_ONE = "1";

    /** 源泉徴収区分 0:無 */
    public static final String GENSENKBN_ZERO = "0";

    /** 請求書状態 1:確定 */
    public static final String SEKYUSTATUS_ONE = "1";

    /** パックフラグ:0:資料 */
    public static final String PACK_FLAG_SIRYO = "0";

    /** パックフラグ:1:パック */
    public static final String PACK_FLAG_PACK = "1";

    /** コピー元伝票No */
    public static final String COPY_GEN_DEN_NO = "コピー元伝票No";

    /** 資料詳細Excel */
    public static final String SRYO_EXCEL = "資料詳細Excel";

    /** 伝票印刷 */
    public static final String DEN_PRINT = "伝票印刷";

    /** 基本情報反映 */
    public static final String KIHNINFO_HE = "基本情報反映";

    /** パラメータ： お知らせ分類コード ＝ "027" */
    public static final String OSRS_BR_CODE_027 = "027";

    /** 【置換文字列】特資申請一覧 */
    public static final String DISP_TOKUSITU_SINNSEI_ITIRANN = "特資申請一覧";

    /** C0099:原稿サイズ */
    public static final String CODE_LIST_C0099 = "C0099CodeList";

    /** シート名：特資発番一覧 */
    public static final String STNA_TOKUSITU_HAQPYOU_ITIRANN = "特資発番一覧";

    /** 終了報告ステータスコード (20：完了) */
    public static final String END_HHK_STS_CD_END = "20";

    /** ファイル区分 (1：資料　) */
    public static final String FILE_KBN_SL = "1";

    /** ファイル区分 (2：資料一覧　) */
    public static final String FILE_KBN_SL_YR = "2";

    /** ファイル区分 (3:プログラム　) */
    public static final String FILE_KBN_PGM = "3";

    /** 資料区分 (標準資料) */
    public static final String SRYO_KBN_HJSR = "標準資料";

    /** 資料区分 (資料一覧) */
    public static final String SRYO_KBN_SRYR = "資料一覧";

    /** 資料区分 (プログラム) */
    public static final String SRYO_KBN_PGM = "プログラム";

    /** 固定値:サブTR */
    public static final String STR_SUBTR = "サブＴＲ";

    /** 基本情報ステータスコード   10 : 起票済 */
    public static final String KHNINFOSTSCD_10 = "10";

    /** 帳票出力フラグ :0 */
    public static final String REPORT_OUTPUT_FLG = "0";

    /** C0128:商品区分 */
    public static final String CODE_LIST_C0128 = "C0128CodeList";

    /** 日時の格式："yyyy/MM/dd（E）" */
    public static final String FORMART_YYYYMMDD_E = "yyyy/MM/dd（E）";

    /** 項目NO_50 */
    public static final String HENKOU_KASLYO50 = "50";

    /** 5：TR日単位情報リストで変更前既存TR情報そのままコピー追加TR押え日程ベースで再設定する場合 */
    public static final String SYONIKUBEN_FIVE = "5";

    /** 拡張子：.xlsｍ */
    public static final String SUFFIX_XLSM = ".xlsm";

    /** お知らせ分類コード String 「029：受注確定バッチ連携エラー」 */
    public static final String SRSBR_CD_NE = "029";

    /** 文字 : Sheet1 */
    public static final String SHEET1 = "Sheet1";

    /** 条件項目名:基本情報No */
    public static final String URL_JK_KHNINFONO = "khnInfoNo";

    /** 条件項目名:スケジュールNO */
    public static final String URL_JK_SCHENO = "scheNo";

    /** 条件項目名:変更依頼No */
    public static final String URL_JK_IRASEQ = "iraSeq";

    /** 条件項目名:差替申請No */
    public static final String URL_JK_SKSSNO = "skSsNo";

    /** 条件項目名:お知らせNO */
    public static final String URL_JK_NOTICENO = "noticeNo";

    /** 条件項目名:表示区分 */
    public static final String URL_JK_HYJKBN = "hyjKbn";

    /** 固定値:・ */
    public static final String STR_TENN = "・";

    /** 拡張子：.xls */
    public static final String SUFFIX_XLS = ".xls";

    /** サーベイ資料発送伝票 (Deruco) */
    public static final String DISP_SABEII_SHIRYOU_HASSO_DENPO_NOSPACE = "サーベイ資料発送伝票(Deruco)";

    /** 回収先区分:C0125 */
    public static final String CODE_LIST_C0125 = "C0125CodeList";

    /** ファイル名：サーベイ資料発送伝票(Carico) */
    public static final String FILE_SABEII_SHIRYOU_HATUHYOU = "サーベイ資料発送伝票(Carico)";

    /** 【置換文字列】：差替処理中以外 */
    public static final String DISP_STR_SYORI_SSKESNSCH_OUT = "差替処理中以外";

    /** CHARSET_NAME */
    public static final String CHARSET_NAME = "MS932";

    /** 【置換文字列】：手入力 */
    public static final String STR_TE_INPUT = "手入力";

    /** C0031：押え区分 */
    public static final String CODE_LIST_C0031 = "C0031CodeList";

    /** 固定文字：： */
    public static final String STR_COLON = "：";

    /** 固定文字：- */
    public static final String STR_YOKO = "-";

    /** ファイルULフラグ＝0 */
    public static final String FILE_UL_FLG_ZERO = "0";

    /** ファイルULフラグ＝1 */
    public static final String FILE_UL_FLG_ONE = "1";

    /** 【置換文字列】：手入力 */
    public static final String STR_SAKUJYO_BATCH = "一時ファイル自動削除バッチ";

    /** 半角カナリスト */
    public static final String[] HANKAKU_LIST = {
            "ｰ", "ｧ", "ｱ", "ｨ", "ｲ", "ｩ", "ｳ", "ｪ", "ｴ", "ｫ", "ｵ", "ｶ", "ｷ",
            "ｸ", "ｹ", "ｺ", "ｻ", "ｼ", "ｽ", "ｾ", "ｿ", "ﾀ", "ﾁ", "ｯ", "ﾂ", "ﾃ",
            "ﾄ", "ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ", "ﾊ", "ﾋ", "ﾌ", "ﾍ", "ﾎ", "ﾏ", "ﾐ",
            "ﾑ", "ﾒ", "ﾓ", "ｬ", "ﾔ", "ｭ", "ﾕ", "ｮ", "ﾖ", "ﾗ", "ﾘ", "ﾙ", "ﾚ",
            "ﾛ", "ﾜ", "ｦ", "ﾝ", "｡", "｢", "｣", "､", "･", "ﾞ", "ﾟ", "ｶﾞ", "ｷﾞ",
            "ｸﾞ", "ｹﾞ", "ｺﾞ", "ｻﾞ", "ｼﾞ", "ｽﾞ", "ｾﾞ", "ｿﾞ", "ﾀﾞ", "ﾁﾞ", "ﾂﾞ",
            "ﾃﾞ", "ﾄﾞ", "ﾊﾞ", "ﾋﾞ", "ﾌﾞ", "ﾍﾞ", "ﾎﾞ", "ｳﾞ", "ﾊﾟ", "ﾋﾟ", "ﾌﾟ",
            "ﾍﾟ", "ﾎﾟ"                                                     };

    /** 全角カナリスト */
    public static final String[] ZENKAKU_LIST = {
            "ー", "ァ", "ア", "ィ", "イ", "ゥ", "ウ", "ェ", "エ", "ォ", "オ", "カ", "キ",
            "ク", "ケ", "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ッ", "ツ", "テ",
            "ト", "ナ", "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ", "ヘ", "ホ", "マ", "ミ",
            "ム", "メ", "モ", "ャ", "ヤ", "ュ", "ユ", "ョ", "ヨ", "ラ", "リ", "ル", "レ",
            "ロ", "ワ", "ヲ", "ン", "。", "「", "」", "、", "・", "゛", "゜", "ガ", "ギ",
            "グ", "ゲ", "ゴ", "ザ", "ジ", "ズ", "ゼ", "ゾ", "ダ", "ヂ", "ヅ", "デ", "ド",
            "バ", "ビ", "ブ", "ベ", "ボ", "ヴ", "パ", "ピ", "プ", "ペ", "ポ"          };

    /** 記号 "「" */
    public static final String SYMBOL_LEFT = "「";

    /** 記号 "」" */
    public static final String SYMBOL_RIGHT = "」";

    /** C0158：登録区分（発送手配） */
    public static final String CODE_LIST_C0158 = "C0158CodeList";

    /** 半角カナリスト（包含半角スペース） */
    public static final String[] HANKAKU_LIST_SP = {
            "ｰ", "ｧ", "ｱ", "ｨ", "ｲ", "ｩ", "ｳ", "ｪ", "ｴ", "ｫ", "ｵ", "ｶ", "ｷ",
            "ｸ", "ｹ", "ｺ", "ｻ", "ｼ", "ｽ", "ｾ", "ｿ", "ﾀ", "ﾁ", "ｯ", "ﾂ", "ﾃ",
            "ﾄ", "ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ", "ﾊ", "ﾋ", "ﾌ", "ﾍ", "ﾎ", "ﾏ", "ﾐ",
            "ﾑ", "ﾒ", "ﾓ", "ｬ", "ﾔ", "ｭ", "ﾕ", "ｮ", "ﾖ", "ﾗ", "ﾘ", "ﾙ", "ﾚ",
            "ﾛ", "ﾜ", "ｦ", "ﾝ", "｡", "｢", "｣", "､", "･", "ﾞ", "ﾟ", "ｶﾞ", "ｷﾞ",
            "ｸﾞ", "ｹﾞ", "ｺﾞ", "ｻﾞ", "ｼﾞ", "ｽﾞ", "ｾﾞ", "ｿﾞ", "ﾀﾞ", "ﾁﾞ", "ﾂﾞ",
            "ﾃﾞ", "ﾄﾞ", "ﾊﾞ", "ﾋﾞ", "ﾌﾞ", "ﾍﾞ", "ﾎﾞ", "ｳﾞ", "ﾊﾟ", "ﾋﾟ", "ﾌﾟ",
            "ﾍﾟ", "ﾎﾟ", " "                                                    };

    /** 全角カナリスト（包含全角スペース） */
    public static final String[] ZENKAKU_LIST_SP = {
            "ー", "ァ", "ア", "ィ", "イ", "ゥ", "ウ", "ェ", "エ", "ォ", "オ", "カ", "キ",
            "ク", "ケ", "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ッ", "ツ", "テ",
            "ト", "ナ", "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ", "ヘ", "ホ", "マ", "ミ",
            "ム", "メ", "モ", "ャ", "ヤ", "ュ", "ユ", "ョ", "ヨ", "ラ", "リ", "ル", "レ",
            "ロ", "ワ", "ヲ", "ン", "。", "「", "」", "、", "・", "゛", "゜", "ガ", "ギ",
            "グ", "ゲ", "ゴ", "ザ", "ジ", "ズ", "ゼ", "ゾ", "ダ", "ヂ", "ヅ", "デ", "ド",
            "バ", "ビ", "ブ", "ベ", "ボ", "ヴ", "パ", "ピ", "プ", "ペ", "ポ", "　"         };

    /** 押えステータス : 13：本押え保留 */
    public static final String OSASTS_BTU_THIRTEEN = "13";

    /** 変更依頼ステータス :0：変更依頼中でない */
    public static final String HNKIR_STATUS_ZERO = "0";

    /** 変更依頼ステータス :1：変更依頼中であり */
    public static final String HNKIR_STATUS_ONE = "1";
    /** シートＡ４ */
    public static final String PAGESIZE_A4 = "A4";

    /** シートＢ５ */
    public static final String PAGESIZE_B5 = "B5";

    /** 「メール小分類?」9 */
    public static final String MAILTYPE_NINE = "9";

    /** 「メール小分類?」a */
    public static final String MAILTYPE_A = "a";

    /** 「メール小分類?」b */
    public static final String MAILTYPE_B = "b";

    /** 「メール小分類?」c */
    public static final String MAILTYPE_C = "c";

    /** 営業担当　： */
    public static final String STR_OSA_NAME_NEW = "営業担当　：";

    /** 営業連絡先　： */
    public static final String STR_OSA_MAIL_NEW = "営業連絡先　：";

}