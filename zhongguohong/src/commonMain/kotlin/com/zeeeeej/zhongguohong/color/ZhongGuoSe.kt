/*
 * 中国色（一共526种颜色）
 */
enum class 中国色 (val text : String,val pinyin : String,val value : Long) {
   /* 暗玉紫(anyuzi) */
   暗玉紫("暗玉紫","anyuzi",0xff5c2223),
   /* 牡丹粉红(mudanfenhong) */
   牡丹粉红("牡丹粉红","mudanfenhong",0xffeea2a4),
   /* 栗紫(lizi) */
   栗紫("栗紫","lizi",0xff5a191b),
   /* 香叶红(xiangyehong) */
   香叶红("香叶红","xiangyehong",0xfff07c82),
   /* 葡萄酱紫(putaojiangzi) */
   葡萄酱紫("葡萄酱紫","putaojiangzi",0xff5a1216),
   /* 艳红(yanhong) */
   艳红("艳红","yanhong",0xffed5a65),
   /* 玉红(yuhong) */
   玉红("玉红","yuhong",0xffc04851),
   /* 茶花红(chahuahong) */
   茶花红("茶花红","chahuahong",0xffee3f4d),
   /* 高粱红(gaolianghong) */
   高粱红("高粱红","gaolianghong",0xffc02c38),
   /* 满江红(manjianghong) */
   满江红("满江红","manjianghong",0xffa7535a),
   /* 鼠鼻红(shubihong) */
   鼠鼻红("鼠鼻红","shubihong",0xffe3b4b8),
   /* 合欢红(hehuanhong) */
   合欢红("合欢红","hehuanhong",0xfff0a1a8),
   /* 春梅红(chunmeihong) */
   春梅红("春梅红","chunmeihong",0xfff1939c),
   /* 苋菜红(xiancaihong) */
   苋菜红("苋菜红","xiancaihong",0xffa61b29),
   /* 烟红(yanhong) */
   烟红("烟红","yanhong",0xff894e54),
   /* 莓红(meihong) */
   莓红("莓红","meihong",0xffc45a65),
   /* 鹅冠红(eguanhong) */
   鹅冠红("鹅冠红","eguanhong",0xffd11a2d),
   /* 枫叶红(fengyehong) */
   枫叶红("枫叶红","fengyehong",0xffc21f30),
   /* 唐菖蒲红(tangchangpuhong) */
   唐菖蒲红("唐菖蒲红","tangchangpuhong",0xffde1c31),
   /* 枣红(zaohong) */
   枣红("枣红","zaohong",0xff7c1823),
   /* 猪肝紫(zhuganzi) */
   猪肝紫("猪肝紫","zhuganzi",0xff541e24),
   /* 葡萄紫(putaozi) */
   葡萄紫("葡萄紫","putaozi",0xff4c1f24),
   /* 暗紫苑红(anziyuanhong) */
   暗紫苑红("暗紫苑红","anziyuanhong",0xff82202b),
   /* 殷红(yanhong) */
   殷红("殷红","yanhong",0xff82111f),
   /* 草茉莉红(caomolihong) */
   草茉莉红("草茉莉红","caomolihong",0xffef475d),
   /* 酱紫(jiangzi) */
   酱紫("酱紫","jiangzi",0xff4d1018),
   /* 山茶红(shanchahong) */
   山茶红("山茶红","shanchahong",0xffed556a),
   /* 锌灰(xinhui) */
   锌灰("锌灰","xinhui",0xff7a7374),
   /* 海棠红(haitanghong) */
   海棠红("海棠红","haitanghong",0xfff03752),
   /* 蓟粉红(jifenhong) */
   蓟粉红("蓟粉红","jifenhong",0xffe6d2d5),
   /* 石蕊红(shiruihong) */
   石蕊红("石蕊红","shiruihong",0xfff0c9cf),
   /* 淡曙红(danshuhong) */
   淡曙红("淡曙红","danshuhong",0xffee2746),
   /* 李紫(lizi) */
   李紫("李紫","lizi",0xff2b1216),
   /* 石竹红(shizhuhong) */
   石竹红("石竹红","shizhuhong",0xffee4863),
   /* 淡茜红(danqianhong) */
   淡茜红("淡茜红","danqianhong",0xffe77c8e),
   /* 金鱼紫(jinyuzi) */
   金鱼紫("金鱼紫","jinyuzi",0xff500a16),
   /* 山黎豆红(shanlidouhong) */
   山黎豆红("山黎豆红","shanlidouhong",0xffc27c88),
   /* 鼠背灰(shubeihui) */
   鼠背灰("鼠背灰","shubeihui",0xff73575c),
   /* 淡蕊香红(danruixianghong) */
   淡蕊香红("淡蕊香红","danruixianghong",0xffee4866),
   /* 甘蔗紫(ganzhezi) */
   甘蔗紫("甘蔗紫","ganzhezi",0xff621624),
   /* 月季红(yuejihong) */
   月季红("月季红","yuejihong",0xffce5777),
   /* 尖晶玉红(jianjingyuhong) */
   尖晶玉红("尖晶玉红","jianjingyuhong",0xffcc163a),
   /* 水红(shuihong) */
   水红("水红","shuihong",0xfff1c4cd),
   /* 姜红(jianghong) */
   姜红("姜红","jianghong",0xffeeb8c3),
   /* 芦灰(luhui) */
   芦灰("芦灰","luhui",0xff856d72),
   /* 茄皮紫(qiepizi) */
   茄皮紫("茄皮紫","qiepizi",0xff2d0c13),
   /* 苍蝇灰(cangyinghui) */
   苍蝇灰("苍蝇灰","cangyinghui",0xff36282b),
   /* 锦葵红(jinkuihong) */
   锦葵红("锦葵红","jinkuihong",0xffbf3553),
   /* 粉团花红(fentuanhuahong) */
   粉团花红("粉团花红","fentuanhuahong",0xffec9bad),
   /* 石竹紫(shizhuzi) */
   石竹紫("石竹紫","shizhuzi",0xff63071c),
   /* 卵石紫(luanshizi) */
   卵石紫("卵石紫","luanshizi",0xff30161c),
   /* 晶红(jinghong) */
   晶红("晶红","jinghong",0xffeea6b7),
   /* 芝兰紫(zhilanzi) */
   芝兰紫("芝兰紫","zhilanzi",0xffe9ccd3),
   /* 芍药耕红(shaoyaogenghong) */
   芍药耕红("芍药耕红","shaoyaogenghong",0xffeba0b3),
   /* 暮云灰(muyunhui) */
   暮云灰("暮云灰","muyunhui",0xff4f383e),
   /* 豇豆红(jiangdouhong) */
   豇豆红("豇豆红","jiangdouhong",0xffed9db2),
   /* 报春红(baochunhong) */
   报春红("报春红","baochunhong",0xffec8aa4),
   /* 淡绛红(danjianghong) */
   淡绛红("淡绛红","danjianghong",0xffec7696),
   /* 凤仙花红(fengxianhuahong) */
   凤仙花红("凤仙花红","fengxianhuahong",0xffea7293),
   /* 霞光红(xiaguanghong) */
   霞光红("霞光红","xiaguanghong",0xffef82a0),
   /* 喜蛋红(xidanhong) */
   喜蛋红("喜蛋红","xidanhong",0xffec2c64),
   /* 夹竹桃红(jiazhutaohong) */
   夹竹桃红("夹竹桃红","jiazhutaohong",0xffeb507e),
   /* 松叶牡丹红(songyemudanhong) */
   松叶牡丹红("松叶牡丹红","songyemudanhong",0xffeb3c70),
   /* 莲瓣红(lianbanhong) */
   莲瓣红("莲瓣红","lianbanhong",0xffea517f),
   /* 白芨红(baijihong) */
   白芨红("白芨红","baijihong",0xffde7897),
   /* 隐红灰(yinhonghui) */
   隐红灰("隐红灰","yinhonghui",0xffb598a1),
   /* 榲桲红(wenpohong) */
   榲桲红("榲桲红","wenpohong",0xffed2f6a),
   /* 酢酱草红(cujiangcaohong) */
   酢酱草红("酢酱草红","cujiangcaohong",0xffc5708b),
   /* 火鹅紫(huoezi) */
   火鹅紫("火鹅紫","huoezi",0xff33141e),
   /* 鹞冠紫(yaoguanzi) */
   鹞冠紫("鹞冠紫","yaoguanzi",0xff621d34),
   /* 品红(pinhong) */
   品红("品红","pinhong",0xffef3473),
   /* 磨石紫(moshizi) */
   磨石紫("磨石紫","moshizi",0xff382129),
   /* 墨紫(mozi) */
   墨紫("墨紫","mozi",0xff310f1b),
   /* 檀紫(tanzi) */
   檀紫("檀紫","tanzi",0xff381924),
   /* 初荷红(chuhehong) */
   初荷红("初荷红","chuhehong",0xffe16c96),
   /* 菜头紫(caitouzi) */
   菜头紫("菜头紫","caitouzi",0xff951c48),
   /* 葡萄酒红(putaojiuhong) */
   葡萄酒红("葡萄酒红","putaojiuhong",0xff62102e),
   /* 淡青紫(danqingzi) */
   淡青紫("淡青紫","danqingzi",0xffe0c8d1),
   /* 菠根红(bogenhong) */
   菠根红("菠根红","bogenhong",0xffd13c74),
   /* 海象紫(haixiangzi) */
   海象紫("海象紫","haixiangzi",0xff4b1e2f),
   /* 兔眼红(tuyanhong) */
   兔眼红("兔眼红","tuyanhong",0xffec4e8a),
   /* 嫩菱红(nenlinghong) */
   嫩菱红("嫩菱红","nenlinghong",0xffde3f7c),
   /* 洋葱紫(yangcongzi) */
   洋葱紫("洋葱紫","yangcongzi",0xffa8456b),
   /* 吊钟花红(diaozhonghuahong) */
   吊钟花红("吊钟花红","diaozhonghuahong",0xffce5e8a),
   /* 绀紫(ganzi) */
   绀紫("绀紫","ganzi",0xff461629),
   /* 紫荆红(zijinghong) */
   紫荆红("紫荆红","zijinghong",0xffee2c79),
   /* 扁豆花红(biandouhuahong) */
   扁豆花红("扁豆花红","biandouhuahong",0xffef498b),
   /* 马鞭草紫(mabiancaozi) */
   马鞭草紫("马鞭草紫","mabiancaozi",0xffede3e7),
   /* 藏花红(canghuahong) */
   藏花红("藏花红","canghuahong",0xffec2d7a),
   /* 斑鸠灰(banjiuhui) */
   斑鸠灰("斑鸠灰","banjiuhui",0xff482936),
   /* 古铜紫(gutongzi) */
   古铜紫("古铜紫","gutongzi",0xff440e25),
   /* 丹紫红(danzihong) */
   丹紫红("丹紫红","danzihong",0xffd2568c),
   /* 丁香淡紫(dingxiangdanzi) */
   丁香淡紫("丁香淡紫","dingxiangdanzi",0xffe9d7df),
   /* 玫瑰红(meiguihong) */
   玫瑰红("玫瑰红","meiguihong",0xffd2357d),
   /* 古鼎灰(gudinghui) */
   古鼎灰("古鼎灰","gudinghui",0xff36292f),
   /* 菱锰红(lingmenghong) */
   菱锰红("菱锰红","lingmenghong",0xffd276a3),
   /* 樱草紫(yingcaozi) */
   樱草紫("樱草紫","yingcaozi",0xffc06f98),
   /* 龙须红(longxuhong) */
   龙须红("龙须红","longxuhong",0xffcc5595),
   /* 电气石红(dianqishihong) */
   电气石红("电气石红","dianqishihong",0xffc35691),
   /* 玫瑰紫(meiguizi) */
   玫瑰紫("玫瑰紫","meiguizi",0xffba2f7b),
   /* 苋菜紫(xiancaizi) */
   苋菜紫("苋菜紫","xiancaizi",0xff9b1e64),
   /* 紫灰(zihui) */
   紫灰("紫灰","zihui",0xff5d3f51),
   /* 龙睛鱼紫(longjingyuzi) */
   龙睛鱼紫("龙睛鱼紫","longjingyuzi",0xff4e2a40),
   /* 青蛤壳紫(qinghakezi) */
   青蛤壳紫("青蛤壳紫","qinghakezi",0xffbc84a8),
   /* 萝兰紫(luolanzi) */
   萝兰紫("萝兰紫","luolanzi",0xffc08eaf),
   /* 荸荠紫(biqizi) */
   荸荠紫("荸荠紫","biqizi",0xff411c35),
   /* 豆蔻紫(doukouzi) */
   豆蔻紫("豆蔻紫","doukouzi",0xffad6598),
   /* 扁豆紫(biandouzi) */
   扁豆紫("扁豆紫","biandouzi",0xffa35c8f),
   /* 牵牛紫(qianniuzi) */
   牵牛紫("牵牛紫","qianniuzi",0xff681752),
   /* 芓紫(zizi) */
   芓紫("芓紫","zizi",0xff894276),
   /* 葛巾紫(gejinzi) */
   葛巾紫("葛巾紫","gejinzi",0xff7e2065),
   /* 青莲(qinglian) */
   青莲("青莲","qinglian",0xff8b2671),
   /* 芥花紫(jiehuazi) */
   芥花紫("芥花紫","jiehuazi",0xff983680),
   /* 凤信紫(fengxinzi) */
   凤信紫("凤信紫","fengxinzi",0xffc8adc4),
   /* 深牵牛紫(shenqianniuzi) */
   深牵牛紫("深牵牛紫","shenqianniuzi",0xff1c0d1a),
   /* 魏紫(weizi) */
   魏紫("魏紫","weizi",0xff7e1671),
   /* 乌梅紫(wumeizi) */
   乌梅紫("乌梅紫","wumeizi",0xff1e131d),
   /* 桔梗紫(jiegengzi) */
   桔梗紫("桔梗紫","jiegengzi",0xff813c85),
   /* 淡牵牛紫(danqianniuzi) */
   淡牵牛紫("淡牵牛紫","danqianniuzi",0xffd1c2d3),
   /* 剑锋紫(jianfengzi) */
   剑锋紫("剑锋紫","jianfengzi",0xff3e3841),
   /* 蕈紫(xunzi) */
   蕈紫("蕈紫","xunzi",0xff815c94),
   /* 槿紫(jinzi) */
   槿紫("槿紫","jinzi",0xff806d9e),
   /* 芡食白(qianshibai) */
   芡食白("芡食白","qianshibai",0xffe2e1e4),
   /* 龙葵紫(longkuizi) */
   龙葵紫("龙葵紫","longkuizi",0xff322f3b),
   /* 藤萝紫(tengluozi) */
   藤萝紫("藤萝紫","tengluozi",0xff8076a3),
   /* 沙鱼灰(shayuhui) */
   沙鱼灰("沙鱼灰","shayuhui",0xff35333c),
   /* 暗龙胆紫(anlongdanzi) */
   暗龙胆紫("暗龙胆紫","anlongdanzi",0xff22202e),
   /* 暗蓝紫(anlanzi) */
   暗蓝紫("暗蓝紫","anlanzi",0xff131124),
   /* 野葡萄紫(yeputaozi) */
   野葡萄紫("野葡萄紫","yeputaozi",0xff302f4b),
   /* 野菊紫(yejuzi) */
   野菊紫("野菊紫","yejuzi",0xff525288),
   /* 水牛灰(shuiniuhui) */
   水牛灰("水牛灰","shuiniuhui",0xff2f2f35),
   /* 远山紫(yuanshanzi) */
   远山紫("远山紫","yuanshanzi",0xffccccd6),
   /* 螺甸紫(luodianzi) */
   螺甸紫("螺甸紫","luodianzi",0xff74759b),
   /* 晶石紫(jingshizi) */
   晶石紫("晶石紫","jingshizi",0xff1f2040),
   /* 满天星紫(mantianxingzi) */
   满天星紫("满天星紫","mantianxingzi",0xff2e317c),
   /* 淡蓝紫(danlanzi) */
   淡蓝紫("淡蓝紫","danlanzi",0xffa7a8bd),
   /* 山梗紫(shangengzi) */
   山梗紫("山梗紫","shangengzi",0xff61649f),
   /* 牛角灰(niujiaohui) */
   牛角灰("牛角灰","niujiaohui",0xff2d2e36),
   /* 鱼尾灰(yuweihui) */
   鱼尾灰("鱼尾灰","yuweihui",0xff5e616d),
   /* 瓦罐灰(waguanhui) */
   瓦罐灰("瓦罐灰","waguanhui",0xff47484c),
   /* 钢蓝(ganglan) */
   钢蓝("钢蓝","ganglan",0xff0f1423),
   /* 燕颔蓝(yanhanlan) */
   燕颔蓝("燕颔蓝","yanhanlan",0xff131824),
   /* 鲸鱼灰(jingyuhui) */
   鲸鱼灰("鲸鱼灰","jingyuhui",0xff475164),
   /* 青灰(qinghui) */
   青灰("青灰","qinghui",0xff2b333e),
   /* 鸽蓝(gelan) */
   鸽蓝("鸽蓝","gelan",0xff1c2938),
   /* 暗蓝(anlan) */
   暗蓝("暗蓝","anlan",0xff101f30),
   /* 钢青(gangqing) */
   钢青("钢青","gangqing",0xff142334),
   /* 海涛蓝(haitaolan) */
   海涛蓝("海涛蓝","haitaolan",0xff15559a),
   /* 飞燕草蓝(feiyancaolan) */
   飞燕草蓝("飞燕草蓝","feiyancaolan",0xff0f59a4),
   /* 靛青(dianqing) */
   靛青("靛青","dianqing",0xff1661ab),
   /* 安安蓝(ananlan) */
   安安蓝("安安蓝","ananlan",0xff3170a7),
   /* 海军蓝(haijunlan) */
   海军蓝("海军蓝","haijunlan",0xff346c9c),
   /* 景泰蓝(jingtailan) */
   景泰蓝("景泰蓝","jingtailan",0xff2775b6),
   /* 品蓝(pinlan) */
   品蓝("品蓝","pinlan",0xff2b73af),
   /* 尼罗蓝(niluolan) */
   尼罗蓝("尼罗蓝","niluolan",0xff2474b5),
   /* 蝶翅蓝(diechilan) */
   蝶翅蓝("蝶翅蓝","diechilan",0xff4e7ca1),
   /* 花青(huaqing) */
   花青("花青","huaqing",0xff2376b7),
   /* 鷃蓝(yanlan) */
   鷃蓝("鷃蓝","yanlan",0xff144a74),
   /* 星蓝(xinglan) */
   星蓝("星蓝","xinglan",0xff93b5cf),
   /* 虹蓝(honglan) */
   虹蓝("虹蓝","honglan",0xff2177b8),
   /* 柏林蓝(bolinlan) */
   柏林蓝("柏林蓝","bolinlan",0xff126bae),
   /* 群青(qunqing) */
   群青("群青","qunqing",0xff1772b4),
   /* 云水蓝(yunshuilan) */
   云水蓝("云水蓝","yunshuilan",0xffbaccd9),
   /* 羽扇豆蓝(yushandoulan) */
   羽扇豆蓝("羽扇豆蓝","yushandoulan",0xff619ac3),
   /* 战舰灰(zhanjianhui) */
   战舰灰("战舰灰","zhanjianhui",0xff495c69),
   /* 晴山蓝(qingshanlan) */
   晴山蓝("晴山蓝","qingshanlan",0xff8fb2c9),
   /* 睛蓝(jinglan) */
   睛蓝("睛蓝","jinglan",0xff5698c3),
   /* 搪磁蓝(tangcilan) */
   搪磁蓝("搪磁蓝","tangcilan",0xff11659a),
   /* 潮蓝(chaolan) */
   潮蓝("潮蓝","chaolan",0xff2983bb),
   /* 天蓝(tianlan) */
   天蓝("天蓝","tianlan",0xff1677b3),
   /* 大理石灰(dalishihui) */
   大理石灰("大理石灰","dalishihui",0xffc4cbcf),
   /* 牵牛花蓝(qianniuhualan) */
   牵牛花蓝("牵牛花蓝","qianniuhualan",0xff1177b0),
   /* 宝石蓝(baoshilan) */
   宝石蓝("宝石蓝","baoshilan",0xff2486b9),
   /* 淡蓝灰(danlanhui) */
   淡蓝灰("淡蓝灰","danlanhui",0xff5e7987),
   /* 嫩灰(nenhui) */
   嫩灰("嫩灰","nenhui",0xff74787a),
   /* 银鱼白(yinyubai) */
   银鱼白("银鱼白","yinyubai",0xffcdd1d3),
   /* 釉蓝(youlan) */
   釉蓝("釉蓝","youlan",0xff1781b5),
   /* 涧石蓝(jianshilan) */
   涧石蓝("涧石蓝","jianshilan",0xff66a9c9),
   /* 远天蓝(yuantianlan) */
   远天蓝("远天蓝","yuantianlan",0xffd0dfe6),
   /* 云山蓝(yunshanlan) */
   云山蓝("云山蓝","yunshanlan",0xff2f90b9),
   /* 秋波蓝(qiubolan) */
   秋波蓝("秋波蓝","qiubolan",0xff8abcd1),
   /* 井天蓝(jingtianlan) */
   井天蓝("井天蓝","jingtianlan",0xffc3d7df),
   /* 鸢尾蓝(yuanweilan) */
   鸢尾蓝("鸢尾蓝","yuanweilan",0xff158bb8),
   /* 云峰白(yunfengbai) */
   云峰白("云峰白","yunfengbai",0xffd8e3e7),
   /* 星灰(xinghui) */
   星灰("星灰","xinghui",0xffb2bbbe),
   /* 钴蓝(gulan) */
   钴蓝("钴蓝","gulan",0xff1a94bc),
   /* 碧青(biqing) */
   碧青("碧青","biqing",0xff5cb3cc),
   /* 苍蓝(canglan) */
   苍蓝("苍蓝","canglan",0xff134857),
   /* 深灰蓝(shenhuilan) */
   深灰蓝("深灰蓝","shenhuilan",0xff132c33),
   /* 灰蓝(huilan) */
   灰蓝("灰蓝","huilan",0xff21373d),
   /* 湖水蓝(hushuilan) */
   湖水蓝("湖水蓝","hushuilan",0xffb0d5df),
   /* 海青(haiqing) */
   海青("海青","haiqing",0xff22a2c3),
   /* 黄昏灰(huanghunhui) */
   黄昏灰("黄昏灰","huanghunhui",0xff474b4c),
   /* 霁青(jiqing) */
   霁青("霁青","jiqing",0xff63bbd0),
   /* 玉鈫蓝(yuqinlan) */
   玉鈫蓝("玉鈫蓝","yuqinlan",0xff126e82),
   /* 胆矾蓝(danfanlan) */
   胆矾蓝("胆矾蓝","danfanlan",0xff0f95b0),
   /* 樫鸟蓝(jianniaolan) */
   樫鸟蓝("樫鸟蓝","jianniaolan",0xff1491a8),
   /* 鸥蓝(oulan) */
   鸥蓝("鸥蓝","oulan",0xffc7d2d4),
   /* 翠蓝(cuilan) */
   翠蓝("翠蓝","cuilan",0xff1e9eb3),
   /* 蜻蜓蓝(qingtinglan) */
   蜻蜓蓝("蜻蜓蓝","qingtinglan",0xff3b818c),
   /* 孔雀蓝(kongquelan) */
   孔雀蓝("孔雀蓝","kongquelan",0xff0eb0c9),
   /* 蔚蓝(weilan) */
   蔚蓝("蔚蓝","weilan",0xff29b7cb),
   /* 瀑布蓝(pubulan) */
   瀑布蓝("瀑布蓝","pubulan",0xff51c4d3),
   /* 闪蓝(shanlan) */
   闪蓝("闪蓝","shanlan",0xff7cabb1),
   /* 甸子蓝(dianzilan) */
   甸子蓝("甸子蓝","dianzilan",0xff10aec2),
   /* 晚波蓝(wanbolan) */
   晚波蓝("晚波蓝","wanbolan",0xff648e93),
   /* 清水蓝(qingshuilan) */
   清水蓝("清水蓝","qingshuilan",0xff93d5dc),
   /* 夏云灰(xiayunhui) */
   夏云灰("夏云灰","xiayunhui",0xff617172),
   /* 海天蓝(haitianlan) */
   海天蓝("海天蓝","haitianlan",0xffc6e6e8),
   /* 虾壳青(xiakeqing) */
   虾壳青("虾壳青","xiakeqing",0xff869d9d),
   /* 石绿(shilv) */
   石绿("石绿","shilv",0xff57c3c2),
   /* 穹灰(qionghui) */
   穹灰("穹灰","qionghui",0xffc4d7d6),
   /* 美蝶绿(meidielv) */
   美蝶绿("美蝶绿","meidielv",0xff12aa9c),
   /* 垩灰(ehui) */
   垩灰("垩灰","ehui",0xff737c7b),
   /* 蓝绿(lanlv) */
   蓝绿("蓝绿","lanlv",0xff12a182),
   /* 竹绿(zhulv) */
   竹绿("竹绿","zhulv",0xff1ba784),
   /* 亚丁绿(yadinglv) */
   亚丁绿("亚丁绿","yadinglv",0xff428675),
   /* 月影白(yueyingbai) */
   月影白("月影白","yueyingbai",0xffc0c4c3),
   /* 海王绿(haiwanglv) */
   海王绿("海王绿","haiwanglv",0xff248067),
   /* 深海绿(shenhailv) */
   深海绿("深海绿","shenhailv",0xff1a3b32),
   /* 绿灰(lvhui) */
   绿灰("绿灰","lvhui",0xff314a43),
   /* 青矾绿(qingfanlv) */
   青矾绿("青矾绿","qingfanlv",0xff2c9678),
   /* 苍绿(canglv) */
   苍绿("苍绿","canglv",0xff223e36),
   /* 飞泉绿(feiquanlv) */
   飞泉绿("飞泉绿","feiquanlv",0xff497568),
   /* 莽丛绿(mangconglv) */
   莽丛绿("莽丛绿","mangconglv",0xff141e1b),
   /* 梧枝绿(wuzhilv) */
   梧枝绿("梧枝绿","wuzhilv",0xff69a794),
   /* 铜绿(tonglv) */
   铜绿("铜绿","tonglv",0xff2bae85),
   /* 草原远绿(caoyuanyuanlv) */
   草原远绿("草原远绿","caoyuanyuanlv",0xff9abeaf),
   /* 蛙绿(walv) */
   蛙绿("蛙绿","walv",0xff45b787),
   /* 浪花绿(langhualv) */
   浪花绿("浪花绿","langhualv",0xff92b3a5),
   /* 苷蓝绿(ganlanlv) */
   苷蓝绿("苷蓝绿","ganlanlv",0xff1f2623),
   /* 粉绿(fenlv) */
   粉绿("粉绿","fenlv",0xff83cbac),
   /* 淡绿灰(danlvhui) */
   淡绿灰("淡绿灰","danlvhui",0xff70887d),
   /* 麦苗绿(maimiaolv) */
   麦苗绿("麦苗绿","maimiaolv",0xff55bb8a),
   /* 翠绿(cuilv) */
   翠绿("翠绿","cuilv",0xff20a162),
   /* 葱绿(conglv) */
   葱绿("葱绿","conglv",0xff40a070),
   /* 荷叶绿(heyelv) */
   荷叶绿("荷叶绿","heyelv",0xff1a6840),
   /* 淡绿(danlv) */
   淡绿("淡绿","danlv",0xff61ac85),
   /* 田园绿(tianyuanlv) */
   田园绿("田园绿","tianyuanlv",0xff68b88e),
   /* 玉簪绿(yuzanlv) */
   玉簪绿("玉簪绿","yuzanlv",0xffa4cab6),
   /* 蟾绿(chanlv) */
   蟾绿("蟾绿","chanlv",0xff3c9566),
   /* 蔻梢绿(koushaolv) */
   蔻梢绿("蔻梢绿","koushaolv",0xff5dbe8a),
   /* 薄荷绿(bohelv) */
   薄荷绿("薄荷绿","bohelv",0xff207f4c),
   /* 月白(yuebai) */
   月白("月白","yuebai",0xffeef7f2),
   /* 蛋白石绿(danbaishilv) */
   蛋白石绿("蛋白石绿","danbaishilv",0xff579572),
   /* 竹篁绿(zhuhuanglv) */
   竹篁绿("竹篁绿","zhuhuanglv",0xffb9dec9),
   /* 孔雀绿(kongquelv) */
   孔雀绿("孔雀绿","kongquelv",0xff229453),
   /* 宫殿绿(gongdianlv) */
   宫殿绿("宫殿绿","gongdianlv",0xff20894d),
   /* 云杉绿(yunshanlv) */
   云杉绿("云杉绿","yunshanlv",0xff15231b),
   /* 毛绿(maolv) */
   毛绿("毛绿","maolv",0xff66c18c),
   /* 冰山蓝(bingshanlan) */
   冰山蓝("冰山蓝","bingshanlan",0xffa4aca7),
   /* 明灰(minghui) */
   明灰("明灰","minghui",0xff8a988e),
   /* 明绿(minglv) */
   明绿("明绿","minglv",0xff9eccab),
   /* 松霜绿(songshuanglv) */
   松霜绿("松霜绿","songshuanglv",0xff83a78d),
   /* 白屈菜绿(baiqucailv) */
   白屈菜绿("白屈菜绿","baiqucailv",0xff485b4d),
   /* 狼烟灰(langyanhui) */
   狼烟灰("狼烟灰","langyanhui",0xff5d655f),
   /* 瓦松绿(wasonglv) */
   瓦松绿("瓦松绿","wasonglv",0xff6e8b74),
   /* 槲寄生绿(hujishenglv) */
   槲寄生绿("槲寄生绿","hujishenglv",0xff2b312c),
   /* 淡翠绿(dancuilv) */
   淡翠绿("淡翠绿","dancuilv",0xffc6dfc8),
   /* 玉髓绿(yusuilv) */
   玉髓绿("玉髓绿","yusuilv",0xff41b349),
   /* 鲜绿(xianlv) */
   鲜绿("鲜绿","xianlv",0xff43b244),
   /* 油绿(youlv) */
   油绿("油绿","youlv",0xff253d24),
   /* 宝石绿(baoshilv) */
   宝石绿("宝石绿","baoshilv",0xff41ae3c),
   /* 嘉陵水绿(jialingshuilv) */
   嘉陵水绿("嘉陵水绿","jialingshuilv",0xffadd5a2),
   /* 田螺绿(tianluolv) */
   田螺绿("田螺绿","tianluolv",0xff5e665b),
   /* 水绿(shuilv) */
   水绿("水绿","shuilv",0xff8cc269),
   /* 鹦鹉绿(yingwulv) */
   鹦鹉绿("鹦鹉绿","yingwulv",0xff5bae23),
   /* 艾背绿(aibeilv) */
   艾背绿("艾背绿","aibeilv",0xffdfecd5),
   /* 艾绿(ailv) */
   艾绿("艾绿","ailv",0xffcad3c3),
   /* 镍灰(niehui) */
   镍灰("镍灰","niehui",0xff9fa39a),
   /* 橄榄石绿(ganlanshilv) */
   橄榄石绿("橄榄石绿","ganlanshilv",0xffb2cf87),
   /* 芽绿(yalv) */
   芽绿("芽绿","yalv",0xff96c24e),
   /* 嫩菊绿(nenjulv) */
   嫩菊绿("嫩菊绿","nenjulv",0xfff0f5e5),
   /* 芦苇绿(luweilv) */
   芦苇绿("芦苇绿","luweilv",0xffb7d07a),
   /* 姚黄(yaohuang) */
   姚黄("姚黄","yaohuang",0xffd0deaa),
   /* 蒽油绿(enyoulv) */
   蒽油绿("蒽油绿","enyoulv",0xff373834),
   /* 苹果绿(pingguolv) */
   苹果绿("苹果绿","pingguolv",0xffbacf65),
   /* 海沬绿(haimeilv) */
   海沬绿("海沬绿","haimeilv",0xffe2e7bf),
   /* 橄榄黄绿(ganlanhuanglv) */
   橄榄黄绿("橄榄黄绿","ganlanhuanglv",0xffbec936),
   /* 槐花黄绿(huaihuahuanglv) */
   槐花黄绿("槐花黄绿","huaihuahuanglv",0xffd2d97a),
   /* 蝶黄(diehuang) */
   蝶黄("蝶黄","diehuang",0xffe2d849),
   /* 象牙白(xiangyabai) */
   象牙白("象牙白","xiangyabai",0xfffffef8),
   /* 橄榄绿(ganlanlv) */
   橄榄绿("橄榄绿","ganlanlv",0xff5e5314),
   /* 雪白(xuebai) */
   雪白("雪白","xuebai",0xfffffef9),
   /* 淡灰绿(danhuilv) */
   淡灰绿("淡灰绿","danhuilv",0xffad9e5f),
   /* 佛手黄(foshouhuang) */
   佛手黄("佛手黄","foshouhuang",0xfffed71a),
   /* 乳白(rubai) */
   乳白("乳白","rubai",0xfff9f4dc),
   /* 香蕉黄(xiangjiaohuang) */
   香蕉黄("香蕉黄","xiangjiaohuang",0xffe4bf11),
   /* 新禾绿(xinhelv) */
   新禾绿("新禾绿","xinhelv",0xffd2b116),
   /* 油菜花黄(youcaihuahuang) */
   油菜花黄("油菜花黄","youcaihuahuang",0xfffbda41),
   /* 秋葵黄(qiukuihuang) */
   秋葵黄("秋葵黄","qiukuihuang",0xffeed045),
   /* 柚黄(youhuang) */
   柚黄("柚黄","youhuang",0xfff1ca17),
   /* 草黄(caohuang) */
   草黄("草黄","caohuang",0xffd2b42c),
   /* 硫华黄(liuhuahuang) */
   硫华黄("硫华黄","liuhuahuang",0xfff2ce2b),
   /* 姜黄(jianghuang) */
   姜黄("姜黄","jianghuang",0xffe2c027),
   /* 潭水绿(tanshuilv) */
   潭水绿("潭水绿","tanshuilv",0xff645822),
   /* 金瓜黄(jinguahuang) */
   金瓜黄("金瓜黄","jinguahuang",0xfffcd217),
   /* 麦秆黄(maiganhuang) */
   麦秆黄("麦秆黄","maiganhuang",0xfff8df70),
   /* 蒿黄(haohuang) */
   蒿黄("蒿黄","haohuang",0xffdfc243),
   /* 茉莉黄(molihuang) */
   茉莉黄("茉莉黄","molihuang",0xfff8df72),
   /* 藤黄(tenghuang) */
   藤黄("藤黄","tenghuang",0xffffd111),
   /* 芒果黄(mangguohuang) */
   芒果黄("芒果黄","mangguohuang",0xffddc871),
   /* 海参灰(haishenhui) */
   海参灰("海参灰","haishenhui",0xfffffefa),
   /* 碧螺春绿(biluochunlv) */
   碧螺春绿("碧螺春绿","biluochunlv",0xff867018),
   /* 苔绿(tailv) */
   苔绿("苔绿","tailv",0xff887322),
   /* 柠檬黄(ningmenghuang) */
   柠檬黄("柠檬黄","ningmenghuang",0xfffcd337),
   /* 草灰绿(caohuilv) */
   草灰绿("草灰绿","caohuilv",0xff8e804b),
   /* 向日葵黄(xiangrikuihuang) */
   向日葵黄("向日葵黄","xiangrikuihuang",0xfffecc11),
   /* 素馨黄(suxinhuang) */
   素馨黄("素馨黄","suxinhuang",0xfffccb16),
   /* 乳鸭黄(ruyahuang) */
   乳鸭黄("乳鸭黄","ruyahuang",0xffffc90c),
   /* 月灰(yuehui) */
   月灰("月灰","yuehui",0xffb7ae8f),
   /* 葵扇黄(kuishanhuang) */
   葵扇黄("葵扇黄","kuishanhuang",0xfff8d86a),
   /* 大豆黄(dadouhuang) */
   大豆黄("大豆黄","dadouhuang",0xfffbcd31),
   /* 金盏黄(jinzhanhuang) */
   金盏黄("金盏黄","jinzhanhuang",0xfffcc307),
   /* 菊蕾白(juleibai) */
   菊蕾白("菊蕾白","juleibai",0xffe9ddb6),
   /* 黄连黄(huanglianhuang) */
   黄连黄("黄连黄","huanglianhuang",0xfffcc515),
   /* 杏仁黄(xingrenhuang) */
   杏仁黄("杏仁黄","xingrenhuang",0xfff7e8aa),
   /* 谷黄(guhuang) */
   谷黄("谷黄","guhuang",0xffe8b004),
   /* 木瓜黄(muguahuang) */
   木瓜黄("木瓜黄","muguahuang",0xfff9c116),
   /* 淡茧黄(danjianhuang) */
   淡茧黄("淡茧黄","danjianhuang",0xfff9d770),
   /* 雅梨黄(yalihuang) */
   雅梨黄("雅梨黄","yalihuang",0xfffbc82f),
   /* 银白(yinbai) */
   银白("银白","yinbai",0xfff1f0ed),
   /* 棕榈绿(zonglvlv) */
   棕榈绿("棕榈绿","zonglvlv",0xff5b4913),
   /* 鹦鹉冠黄(yingwuguanhuang) */
   鹦鹉冠黄("鹦鹉冠黄","yingwuguanhuang",0xfff6c430),
   /* 枯绿(kulv) */
   枯绿("枯绿","kulv",0xffb78d12),
   /* 浅烙黄(qianlaohuang) */
   浅烙黄("浅烙黄","qianlaohuang",0xfff9bd10),
   /* 淡密黄(danmihuang) */
   淡密黄("淡密黄","danmihuang",0xfff9d367),
   /* 芥黄(jiehuang) */
   芥黄("芥黄","jiehuang",0xffd9a40e),
   /* 栀子黄(zhizihuang) */
   栀子黄("栀子黄","zhizihuang",0xffebb10d),
   /* 暗海水绿(anhaishuilv) */
   暗海水绿("暗海水绿","anhaishuilv",0xff584717),
   /* 篾黄(miehuang) */
   篾黄("篾黄","miehuang",0xfff7de98),
   /* 蚌肉白(bangroubai) */
   蚌肉白("蚌肉白","bangroubai",0xfff9f1db),
   /* 炒米黄(chaomihuang) */
   炒米黄("炒米黄","chaomihuang",0xfff4ce69),
   /* 琥珀黄(hupohuang) */
   琥珀黄("琥珀黄","hupohuang",0xfffeba07),
   /* 灰绿(huilv) */
   灰绿("灰绿","huilv",0xff8a6913),
   /* 粽叶绿(zongyelv) */
   粽叶绿("粽叶绿","zongyelv",0xff876818),
   /* 尘灰(chenhui) */
   尘灰("尘灰","chenhui",0xffb6a476),
   /* 鼬黄(youhuang) */
   鼬黄("鼬黄","youhuang",0xfffcb70a),
   /* 象牙黄(xiangyahuang) */
   象牙黄("象牙黄","xiangyahuang",0xfff0d695),
   /* 鲛青(jiaoqing) */
   鲛青("鲛青","jiaoqing",0xff87723e),
   /* 豆汁黄(douzhihuang) */
   豆汁黄("豆汁黄","douzhihuang",0xfff8e8c1),
   /* 土黄(tuhuang) */
   土黄("土黄","tuhuang",0xffd6a01d),
   /* 香水玫瑰黄(xiangshuimeiguihuang) */
   香水玫瑰黄("香水玫瑰黄","xiangshuimeiguihuang",0xfff7da94),
   /* 虎皮黄(hupihuang) */
   虎皮黄("虎皮黄","hupihuang",0xffeaad1a),
   /* 鸡蛋黄(jidanhuang) */
   鸡蛋黄("鸡蛋黄","jidanhuang",0xfffbb612),
   /* 银鼠灰(yinshuhui) */
   银鼠灰("银鼠灰","yinshuhui",0xffb5aa90),
   /* 鱼肚白(yudubai) */
   鱼肚白("鱼肚白","yudubai",0xfff7f4ed),
   /* 初熟杏黄(chushuxinghuang) */
   初熟杏黄("初熟杏黄","chushuxinghuang",0xfff8bc31),
   /* 山鸡黄(shanjihuang) */
   山鸡黄("山鸡黄","shanjihuang",0xffb78b26),
   /* 莲子白(lianzibai) */
   莲子白("莲子白","lianzibai",0xffe5d3aa),
   /* 蟹壳灰(xiekehui) */
   蟹壳灰("蟹壳灰","xiekehui",0xff695e45),
   /* 沙石黄(shashihuang) */
   沙石黄("沙石黄","shashihuang",0xffe5b751),
   /* 甘草黄(gancaohuang) */
   甘草黄("甘草黄","gancaohuang",0xfff3bf4c),
   /* 燕羽灰(yanyuhui) */
   燕羽灰("燕羽灰","yanyuhui",0xff685e48),
   /* 鹅掌黄(ezhanghuang) */
   鹅掌黄("鹅掌黄","ezhanghuang",0xfffbb929),
   /* 麦芽糖黄(maiyatanghuang) */
   麦芽糖黄("麦芽糖黄","maiyatanghuang",0xfff9d27d),
   /* 浅驼色(qiantuose) */
   浅驼色("浅驼色","qiantuose",0xffe2c17c),
   /* 百灵鸟灰(bailingniaohui) */
   百灵鸟灰("百灵鸟灰","bailingniaohui",0xffb4a992),
   /* 酪黄(laohuang) */
   酪黄("酪黄","laohuang",0xfff6dead),
   /* 荔肉白(liroubai) */
   荔肉白("荔肉白","liroubai",0xfff2e6ce),
   /* 淡肉色(danrouse) */
   淡肉色("淡肉色","danrouse",0xfff8e0b0),
   /* 河豚灰(hetunhui) */
   河豚灰("河豚灰","hetunhui",0xff393733),
   /* 蜴蜊绿(yililv) */
   蜴蜊绿("蜴蜊绿","yililv",0xff835e1d),
   /* 汉白玉(hanbaiyu) */
   汉白玉("汉白玉","hanbaiyu",0xfff8f4ed),
   /* 橙皮黄(chengpihuang) */
   橙皮黄("橙皮黄","chengpihuang",0xfffca104),
   /* 莱阳梨黄(laiyanglihuang) */
   莱阳梨黄("莱阳梨黄","laiyanglihuang",0xff815f25),
   /* 枇杷黄(pipahuang) */
   枇杷黄("枇杷黄","pipahuang",0xfffca106),
   /* 金叶黄(jinyehuang) */
   金叶黄("金叶黄","jinyehuang",0xffffa60f),
   /* 苍黄(canghuang) */
   苍黄("苍黄","canghuang",0xff806332),
   /* 粉白(fenbai) */
   粉白("粉白","fenbai",0xfffbf2e3),
   /* 淡橘橙(danjucheng) */
   淡橘橙("淡橘橙","danjucheng",0xfffba414),
   /* 珍珠灰(zhenzhuhui) */
   珍珠灰("珍珠灰","zhenzhuhui",0xffe4dfd7),
   /* 龟背黄(guibeihuang) */
   龟背黄("龟背黄","guibeihuang",0xff826b48),
   /* 浅灰(qianhui) */
   浅灰("浅灰","qianhui",0xffdad4cb),
   /* 铅灰(qianhui) */
   铅灰("铅灰","qianhui",0xffbbb5ac),
   /* 中灰(zhonghui) */
   中灰("中灰","zhonghui",0xffbbb5ac),
   /* 雄黄(xionghuang) */
   雄黄("雄黄","xionghuang",0xffff9900),
   /* 蜜黄(mihuang) */
   蜜黄("蜜黄","mihuang",0xfffbb957),
   /* 风帆黄(fengfanhuang) */
   风帆黄("风帆黄","fengfanhuang",0xffdc9123),
   /* 桂皮淡棕(guipidanzong) */
   桂皮淡棕("桂皮淡棕","guipidanzong",0xffc09351),
   /* 金莺黄(jinyinghuang) */
   金莺黄("金莺黄","jinyinghuang",0xfff4a83a),
   /* 肉色(rouse) */
   肉色("肉色","rouse",0xfff7c173),
   /* 凋叶棕(diaoyezong) */
   凋叶棕("凋叶棕","diaoyezong",0xffe7a23f),
   /* 古铜绿(gutonglv) */
   古铜绿("古铜绿","gutonglv",0xff533c1b),
   /* 落英淡粉(luoyingdanfen) */
   落英淡粉("落英淡粉","luoyingdanfen",0xfff9e8d0),
   /* 软木黄(ruanmuhuang) */
   软木黄("软木黄","ruanmuhuang",0xffde9e44),
   /* 瓜瓤粉(guarangfen) */
   瓜瓤粉("瓜瓤粉","guarangfen",0xfff9cb8b),
   /* 榴萼黄(liuehuang) */
   榴萼黄("榴萼黄","liuehuang",0xfff9a633),
   /* 玳瑁黄(daimaohuang) */
   玳瑁黄("玳瑁黄","daimaohuang",0xffdaa45a),
   /* 焦茶绿(jiaochalv) */
   焦茶绿("焦茶绿","jiaochalv",0xff553b18),
   /* 蟹壳绿(xiekelv) */
   蟹壳绿("蟹壳绿","xiekelv",0xff513c20),
   /* 山鸡褐(shanjihe) */
   山鸡褐("山鸡褐","shanjihe",0xff986524),
   /* 猴毛灰(houmaohui) */
   猴毛灰("猴毛灰","houmaohui",0xff97846c),
   /* 鹿角棕(lujiaozong) */
   鹿角棕("鹿角棕","lujiaozong",0xffe3bd8d),
   /* 淡松烟(dansongyan) */
   淡松烟("淡松烟","dansongyan",0xff4d4030),
   /* 万寿菊黄(wanshoujuhuang) */
   万寿菊黄("万寿菊黄","wanshoujuhuang",0xfffb8b05),
   /* 蛋壳黄(dankehuang) */
   蛋壳黄("蛋壳黄","dankehuang",0xfff8c387),
   /* 杏黄(xinghuang) */
   杏黄("杏黄","xinghuang",0xfff28e16),
   /* 橄榄灰(ganlanhui) */
   橄榄灰("橄榄灰","ganlanhui",0xff503e2a),
   /* 鹤灰(hehui) */
   鹤灰("鹤灰","hehui",0xff4a4035),
   /* 玛瑙灰(manaohui) */
   玛瑙灰("玛瑙灰","manaohui",0xffcfccc9),
   /* 淡银灰(danyinhui) */
   淡银灰("淡银灰","danyinhui",0xffc1b2a3),
   /* 瓦灰(wahui) */
   瓦灰("瓦灰","wahui",0xff867e76),
   /* 夜灰(yehui) */
   夜灰("夜灰","yehui",0xff847c74),
   /* 北瓜黄(beiguahuang) */
   北瓜黄("北瓜黄","beiguahuang",0xfffc8c23),
   /* 荷花白(hehuabai) */
   荷花白("荷花白","hehuabai",0xfffbecde),
   /* 松鼠灰(songshuhui) */
   松鼠灰("松鼠灰","songshuhui",0xff4f4032),
   /* 淡米粉(danmifen) */
   淡米粉("淡米粉","danmifen",0xfffbeee2),
   /* 深灰(shenhui) */
   深灰("深灰","shenhui",0xff81776e),
   /* 海鸥灰(haiouhui) */
   海鸥灰("海鸥灰","haiouhui",0xff9a8878),
   /* 茶褐(chahe) */
   茶褐("茶褐","chahe",0xff5d3d21),
   /* 驼色(tuose) */
   驼色("驼色","tuose",0xff66462a),
   /* 银灰(yinhui) */
   银灰("银灰","yinhui",0xff918072),
   /* 鹿皮褐(lupihe) */
   鹿皮褐("鹿皮褐","lupihe",0xffd99156),
   /* 槟榔综(binglangzong) */
   槟榔综("槟榔综","binglangzong",0xffc1651a),
   /* 晓灰(xiaohui) */
   晓灰("晓灰","xiaohui",0xffd4c4b7),
   /* 淡赭(danzhe) */
   淡赭("淡赭","danzhe",0xffbe7e4a),
   /* 古铜褐(gutonghe) */
   古铜褐("古铜褐","gutonghe",0xff5c3719),
   /* 麂棕(jizong) */
   麂棕("麂棕","jizong",0xffde7622),
   /* 醉瓜肉(zuiguarou) */
   醉瓜肉("醉瓜肉","zuiguarou",0xffdb8540),
   /* 雁灰(yanhui) */
   雁灰("雁灰","yanhui",0xff80766e),
   /* 鲑鱼红(guiyuhong) */
   鲑鱼红("鲑鱼红","guiyuhong",0xfff09c5a),
   /* 橘橙(jucheng) */
   橘橙("橘橙","jucheng",0xfff97d1c),
   /* 金黄(jinhuang) */
   金黄("金黄","jinhuang",0xfff26b1f),
   /* 玫瑰粉(meiguifen) */
   玫瑰粉("玫瑰粉","meiguifen",0xfff8b37f),
   /* 美人焦橙(meirenjiaocheng) */
   美人焦橙("美人焦橙","meirenjiaocheng",0xfffa7e23),
   /* 米色(mise) */
   米色("米色","mise",0xfff9e9cd),
   /* 蛛网灰(zhuwanghui) */
   蛛网灰("蛛网灰","zhuwanghui",0xffb7a091),
   /* 淡咖啡(dankafei) */
   淡咖啡("淡咖啡","dankafei",0xff945833),
   /* 海螺橙(hailuocheng) */
   海螺橙("海螺橙","hailuocheng",0xfff0945d),
   /* 岩石棕(yanshizong) */
   岩石棕("岩石棕","yanshizong",0xff964d22),
   /* 芒果棕(mangguozong) */
   芒果棕("芒果棕","mangguozong",0xff954416),
   /* 陶瓷红(taocihong) */
   陶瓷红("陶瓷红","taocihong",0xffe16723),
   /* 菠萝红(boluohong) */
   菠萝红("菠萝红","boluohong",0xfffc7930),
   /* 余烬红(yujinhong) */
   余烬红("余烬红","yujinhong",0xffcf7543),
   /* 金莲花橙(jinlianhuacheng) */
   金莲花橙("金莲花橙","jinlianhuacheng",0xfff86b1d),
   /* 火砖红(huozhuanhong) */
   火砖红("火砖红","huozhuanhong",0xffcd6227),
   /* 初桃粉红(chutaofenhong) */
   初桃粉红("初桃粉红","chutaofenhong",0xfff6dcce),
   /* 铁棕(tiezong) */
   铁棕("铁棕","tiezong",0xffd85916),
   /* 介壳淡粉红(jieqiaodanfenhong) */
   介壳淡粉红("介壳淡粉红","jieqiaodanfenhong",0xfff7cfba),
   /* 蟹壳红(xiekehong) */
   蟹壳红("蟹壳红","xiekehong",0xfff27635),
   /* 金驼(jintuo) */
   金驼("金驼","jintuo",0xffe46828),
   /* 燕颔红(yanhanhong) */
   燕颔红("燕颔红","yanhanhong",0xfffc6315),
   /* 淡可可棕(dankekezong) */
   淡可可棕("淡可可棕","dankekezong",0xffb7511d),
   /* 晨曦红(chenxihong) */
   晨曦红("晨曦红","chenxihong",0xffea8958),
   /* 玉粉红(yufenhong) */
   玉粉红("玉粉红","yufenhong",0xffe8b49a),
   /* 野蔷薇红(yeqiangweihong) */
   野蔷薇红("野蔷薇红","yeqiangweihong",0xfffb9968),
   /* 藕荷(ouhe) */
   藕荷("藕荷","ouhe",0xffedc3ae),
   /* 长石灰(changshihui) */
   长石灰("长石灰","changshihui",0xff363433),
   /* 中红灰(zhonghonghui) */
   中红灰("中红灰","zhonghonghui",0xff8b614d),
   /* 火泥棕(huonizong) */
   火泥棕("火泥棕","huonizong",0xffaa6a4c),
   /* 绀红(ganhong) */
   绀红("绀红","ganhong",0xffa6522c),
   /* 莓酱红(meijianghong) */
   莓酱红("莓酱红","meijianghong",0xfffa5d19),
   /* 丁香棕(dingxiangzong) */
   丁香棕("丁香棕","dingxiangzong",0xff71361d),
   /* 淡玫瑰灰(danmeiguihui) */
   淡玫瑰灰("淡玫瑰灰","danmeiguihui",0xffb89485),
   /* 瓜瓤红(guaranghong) */
   瓜瓤红("瓜瓤红","guaranghong",0xfff68c60),
   /* 淡藏花红(dancanghuahong) */
   淡藏花红("淡藏花红","dancanghuahong",0xfff6ad8f),
   /* 筍皮棕(sunpizong) */
   筍皮棕("筍皮棕","sunpizong",0xff732e12),
   /* 润红(runhong) */
   润红("润红","runhong",0xfff7cdbc),
   /* 龙睛鱼红(longjingyuhong) */
   龙睛鱼红("龙睛鱼红","longjingyuhong",0xffef632b),
   /* 淡土黄(dantuhuang) */
   淡土黄("淡土黄","dantuhuang",0xff8c4b31),
   /* 珠母灰(zhumuhui) */
   珠母灰("珠母灰","zhumuhui",0xff64483d),
   /* 芙蓉红(furonghong) */
   芙蓉红("芙蓉红","furonghong",0xfff9723d),
   /* 落霞红(luoxiahong) */
   落霞红("落霞红","luoxiahong",0xffcf4813),
   /* 法螺红(faluohong) */
   法螺红("法螺红","faluohong",0xffee8055),
   /* 草珠红(caozhuhong) */
   草珠红("草珠红","caozhuhong",0xfff8ebe6),
   /* 咖啡(kafei) */
   咖啡("咖啡","kafei",0xff753117),
   /* 中灰驼(zhonghuituo) */
   中灰驼("中灰驼","zhonghuituo",0xff603d30),
   /* 椰壳棕(yekezong) */
   椰壳棕("椰壳棕","yekezong",0xff883a1e),
   /* 蟹蝥红(xiemaohong) */
   蟹蝥红("蟹蝥红","xiemaohong",0xffb14b28),
   /* 淡豆沙(dandousha) */
   淡豆沙("淡豆沙","dandousha",0xff873d24),
   /* 淡桃红(dantaohong) */
   淡桃红("淡桃红","dantaohong",0xfff6cec1),
   /* 淡铁灰(dantiehui) */
   淡铁灰("淡铁灰","dantiehui",0xff5b423a),
   /* 石板灰(shibanhui) */
   石板灰("石板灰","shibanhui",0xff624941),
   /* 淡栗棕(danlizong) */
   淡栗棕("淡栗棕","danlizong",0xff673424),
   /* 银朱(yinzhu) */
   银朱("银朱","yinzhu",0xfff43e06),
   /* 草莓红(caomeihong) */
   草莓红("草莓红","caomeihong",0xffef6f48),
   /* 洋水仙红(yangshuixianhong) */
   洋水仙红("洋水仙红","yangshuixianhong",0xfff4c7ba),
   /* 朱红(zhuhong) */
   朱红("朱红","zhuhong",0xffed5126),
   /* 榴花红(liuhuahong) */
   榴花红("榴花红","liuhuahong",0xfff34718),
   /* 柿红(shihong) */
   柿红("柿红","shihong",0xfff2481b),
   /* 可可棕(kekezong) */
   可可棕("可可棕","kekezong",0xff652b1c),
   /* 淡罂粟红(danyingsuhong) */
   淡罂粟红("淡罂粟红","danyingsuhong",0xffeea08c),
   /* 大红(dahong) */
   大红("大红","dahong",0xfff04b22),
   /* 柞叶棕(zhayezong) */
   柞叶棕("柞叶棕","zhayezong",0xff692a1b),
   /* 蜻蜓红(qingtinghong) */
   蜻蜓红("蜻蜓红","qingtinghong",0xfff1441d),
   /* 橡树棕(xiangshuzong) */
   橡树棕("橡树棕","xiangshuzong",0xff773d31),
   /* 颊红(jiahong) */
   颊红("颊红","jiahong",0xffeeaa9c),
   /* 桃红(taohong) */
   桃红("桃红","taohong",0xfff0ada0),
   /* 火岩棕(huoyanzong) */
   火岩棕("火岩棕","huoyanzong",0xff863020),
   /* 淡藤萝紫(dantengluozi) */
   淡藤萝紫("淡藤萝紫","dantengluozi",0xfff2e7e5),
   /* 赭石(zheshi) */
   赭石("赭石","zheshi",0xff862617),
   /* 铁水红(tieshuihong) */
   铁水红("铁水红","tieshuihong",0xfff5391c),
   /* 胭脂红(yanzhihong) */
   胭脂红("胭脂红","yanzhihong",0xfff03f24),
   /* 极光红(jiguanghong) */
   极光红("极光红","jiguanghong",0xfff33b1f),
   /* 红汞红(honggonghong) */
   红汞红("红汞红","honggonghong",0xfff23e23),
   /* 萝卜红(luobohong) */
   萝卜红("萝卜红","luobohong",0xfff13c22),
   /* 曲红(quhong) */
   曲红("曲红","quhong",0xfff05a46),
   /* 谷鞘红(guqiaohong) */
   谷鞘红("谷鞘红","guqiaohong",0xfff17666),
   /* 苹果红(pingguohong) */
   苹果红("苹果红","pingguohong",0xfff15642),
   /* 桂红(guihong) */
   桂红("桂红","guihong",0xfff25a47),
   /* 粉红(fenhong) */
   粉红("粉红","fenhong",0xfff2b9b2),
   /* 暗驼棕(antuozong) */
   暗驼棕("暗驼棕","antuozong",0xff592620),
   /* 夕阳红(xiyanghong) */
   夕阳红("夕阳红","xiyanghong",0xffde2a18),
   /* 樱桃红(yingtaohong) */
   樱桃红("樱桃红","yingtaohong",0xffed3321),
   /* 珊瑚红(shanhuhong) */
   珊瑚红("珊瑚红","shanhuhong",0xfff04a3a),
   /* 火山棕(huoshanzong) */
   火山棕("火山棕","huoshanzong",0xff482522),
   /* 栗棕(lizong) */
   栗棕("栗棕","lizong",0xff5c1e19),
   /* 鹤顶红(hedinghong) */
   鹤顶红("鹤顶红","hedinghong",0xffd42517),
   /* 舌红(shehong) */
   舌红("舌红","shehong",0xfff19790),
   /* 鹅血石红(exueshihong) */
   鹅血石红("鹅血石红","exueshihong",0xffab372f),
   /* 酱棕(jiangzong) */
   酱棕("酱棕","jiangzong",0xff5a1f1b),
   /* 鱼鳃红(yusaihong) */
   鱼鳃红("鱼鳃红","yusaihong",0xffed3b2f),
   /* 芦穗灰(lusuihui) */
   芦穗灰("芦穗灰","lusuihui",0xffbdaead),
   /* 丽春红(lichunhong) */
   丽春红("丽春红","lichunhong",0xffeb261a),
   /* 覆盆子红(fupenzihong) */
   覆盆子红("覆盆子红","fupenzihong",0xffac1f18),
   /* 海报灰(haibaohui) */
   海报灰("海报灰","haibaohui",0xff483332),
   /* 豆沙(dousha) */
   豆沙("豆沙","dousha",0xff481e1c),
   /* 榴子红(liuzihong) */
   榴子红("榴子红","liuzihong",0xfff1908c),
   /* 秋海棠红(qiuhaitanghong) */
   秋海棠红("秋海棠红","qiuhaitanghong",0xffec2b24),
   /* 无花果红(wuhuaguohong) */
   无花果红("无花果红","wuhuaguohong",0xffefafad),
   /* 淡绯(danfei) */
   淡绯("淡绯","danfei",0xfff2cac9),
   /* 玫瑰灰(meiguihui) */
   玫瑰灰("玫瑰灰","meiguihui",0xff4b2e2b),
   /* 淡菽红(danshuhong) */
   淡菽红("淡菽红","danshuhong",0xffed4845),
   /* 枸枢红(goushuhong) */
   枸枢红("枸枢红","goushuhong",0xffed3333),
   /* 貂紫(diaozi) */
   貂紫("貂紫","diaozi",0xff5d3131),
;
}
            