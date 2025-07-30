/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : tianfu

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 13/09/2023 16:53:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '电话',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '地址',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '头像',
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'user', '123', 'user', '10-0251-4055', 'zhona5@outlook.com', '朝阳区三里屯路791号', NULL, '用户');
INSERT INTO `user` VALUES (2, '向安琪', 'HZtRL4kHIH', '向安琪', '10-9208-7022', 'anqi1203@gmail.com', '西城区西長安街421号', NULL, '用户');
INSERT INTO `user` VALUES (3, '程子异', 'GCQn28UQNb', '程子异', '190-0433-6961', 'cheng1105@yahoo.com', '罗湖区清水河一路262号', NULL, '用户');
INSERT INTO `user` VALUES (4, '萧睿', '9L7qRDsNhO', '萧睿', '28-3470-9428', 'xrui8@hotmail.com', '锦江区人民南路四段285号', NULL, '用户');
INSERT INTO `user` VALUES (5, '姜璐', '8UYQL9mLad', '姜璐', '137-0505-2273', 'luj@yahoo.com', '锦江区人民南路四段790号', NULL, '用户');
INSERT INTO `user` VALUES (6, '董子韬', 'GypeuCmxwE', '董子韬', '10-177-5551', 'zitao13@outlook.com', '延庆区028县道522号', NULL, '用户');
INSERT INTO `user` VALUES (7, '萧嘉伦', 'iFx89Upi6a', '萧嘉伦', '21-8142-1798', 'jxia@outlook.com', '闵行区宾川路723号', NULL, '用户');
INSERT INTO `user` VALUES (10, '彭睿', 'FiSMGgeXmj', '彭睿', '10-844-3038', 'penr@icloud.com', '延庆区028县道202号', NULL, '用户');
INSERT INTO `user` VALUES (11, '孔安琪', '6iUH1Vfuwv', '孔安琪', '184-5888-5263', 'konga6@outlook.com', '浦东新区健祥路348号', NULL, '用户');
INSERT INTO `user` VALUES (12, '金詩涵', 'D8mrliIPDU', '金詩涵', '769-776-6033', 'jsh@yahoo.com', '东泰五街28号', NULL, '用户');
INSERT INTO `user` VALUES (13, '谢子韬', 'YwKKnuHoDF', '谢子韬', '135-9676-1018', 'zitao1@icloud.com', '福田区深南大道812号', NULL, '用户');
INSERT INTO `user` VALUES (14, '叶杰宏', 'PmIpjds41e', '叶杰宏', '21-057-9892', 'yj2010@outlook.com', '浦东新区健祥路549号', NULL, '用户');
INSERT INTO `user` VALUES (15, '林子韬', 'oMl4Wu3b3y', '林子韬', '177-3528-2257', 'lizitao6@yahoo.com', '西城区复兴门内大街322号', NULL, '用户');
INSERT INTO `user` VALUES (16, '杨晓明', '1VRSCrLe4I', '杨晓明', '21-697-8408', 'xiaomingya@hotmail.com', '徐汇区虹桥路83号', NULL, '用户');
INSERT INTO `user` VALUES (17, '林岚', 'lgmd5eSrUr', '林岚', '20-7487-7275', 'lan305@yahoo.com', '越秀区中山二路970号', NULL, '用户');
INSERT INTO `user` VALUES (18, '吕杰宏', 'IPaNkUbmGh', '吕杰宏', '20-6492-5326', 'jiehong905@hotmail.com', '海珠区江南西路685号', NULL, '用户');
INSERT INTO `user` VALUES (19, '丁子韬', 'MNcvOv3fw3', '丁子韬', '154-5561-2353', 'ding1015@yahoo.com', '福田区深南大道800号', NULL, '用户');
INSERT INTO `user` VALUES (20, '雷嘉伦', 'JjKZJ36ic9', '雷嘉伦', '186-6710-6088', 'leijialun88@icloud.com', '环区南街二巷374号', NULL, '用户');
INSERT INTO `user` VALUES (21, '于致远', 'Nm56aFZgCI', '于致远', '10-3485-1056', 'yzhiy1@gmail.com', '東城区東直門內大街896号', NULL, '用户');
INSERT INTO `user` VALUES (22, '吴安琪', 'OSi0KYt6if', '吴安琪', '755-027-7516', 'wua@icloud.com', '龙岗区学园一巷286号', NULL, '用户');
INSERT INTO `user` VALUES (23, '尹睿', '5Fggt9KNRJ', '尹睿', '186-9899-5421', 'yru@icloud.com', '浦东新区健祥路824号', NULL, '用户');
INSERT INTO `user` VALUES (24, '韦睿', '0Rq9yQSVtI', '韦睿', '760-3442-2173', 'wrui@outlook.com', '天河区大信商圈大信南路331号', NULL, '用户');
INSERT INTO `user` VALUES (25, '武杰宏', 'Srloq7hNNf', '武杰宏', '10-331-7336', 'wujiehong6@gmail.com', '朝阳区三里屯路978号', NULL, '用户');
INSERT INTO `user` VALUES (26, '邹晓明', 'nFpnYAzxH7', '邹晓明', '151-4610-2397', 'xiaomingzo81@icloud.com', '紫马岭商圈中山五路430号', NULL, '用户');
INSERT INTO `user` VALUES (27, '邹秀英', 'DrrgM4SkG4', '邹秀英', '760-9516-4033', 'zou105@outlook.com', '京华商圈华夏街42号', NULL, '用户');
INSERT INTO `user` VALUES (28, '钱子韬', 'jQSACQQT1e', '钱子韬', '28-909-5411', 'zitaoqian@gmail.com', '锦江区人民南路四段208号', NULL, '用户');
INSERT INTO `user` VALUES (29, '孟嘉伦', 'If28WnfpZp', '孟嘉伦', '184-5748-9065', 'mengjia3@hotmail.com', '东泰五街719号', NULL, '用户');
INSERT INTO `user` VALUES (30, '吕晓明', 'uHvmwmrfJC', '吕晓明', '131-8609-6726', 'lu00@icloud.com', '成华区双庆路829号', NULL, '用户');
INSERT INTO `user` VALUES (31, '袁岚', '5D7JAi834U', '袁岚', '173-8495-8393', 'lan6@gmail.com', '福田区景田东一街232号', NULL, '用户');
INSERT INTO `user` VALUES (32, '沈致远', 'WiV8xWV60S', '沈致远', '10-8431-2643', 'zhiyuansh@hotmail.com', '东城区东单王府井东街96号', NULL, '用户');
INSERT INTO `user` VALUES (33, '田震南', '8uBuhtO8lV', '田震南', '150-3318-1334', 'tizhennan@hotmail.com', '海淀区清河中街68号378号', NULL, '用户');
INSERT INTO `user` VALUES (34, '韩子异', 'xcBzbTW6Ms', '韩子异', '189-8719-9331', 'han8@gmail.com', '黄浦区淮海中路431号', NULL, '用户');
INSERT INTO `user` VALUES (35, '阎子异', '6EXqkJyqKD', '阎子异', '20-391-0597', 'yanziy@outlook.com', '白云区机场路棠苑街五巷787号', NULL, '用户');
INSERT INTO `user` VALUES (36, '尹璐', 'LVZMU67qLr', '尹璐', '156-1679-3024', 'ylu@hotmail.com', '越秀区中山二路881号', NULL, '用户');
INSERT INTO `user` VALUES (37, '戴致远', '6i31M5l5w6', '戴致远', '140-5078-0721', 'zhiyuandai7@gmail.com', '环区南街二巷894号', NULL, '用户');
INSERT INTO `user` VALUES (38, '刘睿', 'OwrcFVUIJQ', '刘睿', '10-156-6442', 'ruliu@icloud.com', '房山区岳琉路477号', NULL, '用户');
INSERT INTO `user` VALUES (39, '萧晓明', 'QkEzqjaZ4f', '萧晓明', '177-4106-4886', 'xiaoxiao13@mail.com', '乐丰六路853号', NULL, '用户');
INSERT INTO `user` VALUES (40, '贾詩涵', 'FUjtcFghX1', '贾詩涵', '150-7178-5552', 'jiashihan@yahoo.com', '天河区大信商圈大信南路980号', NULL, '用户');
INSERT INTO `user` VALUES (41, '何秀英', 'ZGrhV5pLWA', '何秀英', '173-2238-7779', 'xh7@icloud.com', '福田区景田东一街737号', NULL, '用户');
INSERT INTO `user` VALUES (42, '董致远', 'SmeSaS1tDi', '董致远', '21-8819-3809', 'dongzhiyuan724@gmail.com', '浦东新区橄榄路824号', NULL, '用户');
INSERT INTO `user` VALUES (43, '于嘉伦', 'XEYlkALuZ9', '于嘉伦', '755-046-6747', 'jiayu@hotmail.com', '福田区景田东一街699号', NULL, '用户');
INSERT INTO `user` VALUES (44, '江岚', 'tBN5zdh2W8', '江岚', '10-1438-5180', 'lanji@yahoo.com', '海淀区清河中街68号598号', NULL, '用户');
INSERT INTO `user` VALUES (45, '邹致远', 'ErAnf62gpj', '邹致远', '192-8231-2425', 'zhiyzou@outlook.com', '天河区大信商圈大信南路824号', NULL, '用户');
INSERT INTO `user` VALUES (46, '徐宇宁', 'DmII5PTeaP', '徐宇宁', '20-0433-8627', 'yuningxu86@yahoo.com', '越秀区中山二路239号', NULL, '用户');
INSERT INTO `user` VALUES (47, '方秀英', 'MxCSNGne7f', '方秀英', '198-6317-4784', 'xifang929@yahoo.com', '黄浦区淮海中路92号', NULL, '用户');
INSERT INTO `user` VALUES (48, '卢岚', 'poxZfds7AI', '卢岚', '755-166-5773', 'lanlu7@gmail.com', '龙岗区布吉镇西环路189号', 'http://localhost:9090/file/download/4a288dbeb50472dc9bb808244f118d56.JPG', '用户');
INSERT INTO `user` VALUES (49, '唐詩涵', 'hucwB4KNok', '唐詩涵', '21-1803-4727', 'tashi@outlook.com', '浦东新区橄榄路759号', 'http://localhost:9090/file/download/2d0803e05589d6b897679f686bd1dd87.JPG', '用户');
INSERT INTO `user` VALUES (51, 'admin', '123', 'admin', '13730085271', 'admin1@qq.com', '河北省邯郸市', 'http://localhost:9090/file/download/1694590448395_熊猫.png', '管理员');
INSERT INTO `user` VALUES (52, 'gcc', 'gcc', 'gcc', '13525975541', '3474@qq.com', '荷兰', 'http://localhost:9090/file/download/7882b48379c2eff2209bb2c666a92c82.JPG', '用户');
INSERT INTO `user` VALUES (53, '123', '123', '123', NULL, NULL, NULL, 'http://localhost:9090/file/download/1694351942000_logo1.png', '用户');
INSERT INTO `user` VALUES (54, 'admin2', NULL, 'admin2', NULL, NULL, NULL, 'http://localhost:9090/file/download/1694410276734_熊猫.png', '管理员');
INSERT INTO `user` VALUES (66, '1234', '123', '阿瓦达', NULL, NULL, NULL, 'http://localhost:9090/file/download/1694570007713_1.JPG', '用户');
INSERT INTO `user` VALUES (67, '000', '000', '000', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
