-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Апр 27 2013 г., 18:29
-- Версия сервера: 5.5.25
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `musicapp`
--

-- --------------------------------------------------------

--
-- Структура таблицы `song`
--

CREATE TABLE IF NOT EXISTS `song` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(32) NOT NULL,
  `text` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Дамп данных таблицы `song`
--

INSERT INTO `song` (`id`, `name`, `text`) VALUES
(1, 'Black Dog', 'Should I fall out of love, my fire in the night,\r\nto chase a feather in the wind;\r\nwithin the glow that weaves a cloak of delight\r\nthere moves a thread that has no end.\r\n\r\nFor many hours and days that pass ever soon,\r\nthe tides have caused the flame to dim.\r\nAt last the arm is straight, the hand to the loom.\r\nIs this to end or just begin?\r\n\r\nChorus:\r\nAll of my love, all of my love, oh,\r\nall of my love to you, now.\r\nAll of my love, all of my love,\r\nall of my love to you, now.\r\n\r\nThe cup is raised, the toast is maade yet again;\r\none voice is clear above the din.\r\nProud Arian one word, my will to sustain.\r\nFor me, the cloth once more to spin. Oh.\r\n\r\nrepeat chorus\r\n\r\nYours is the cloth, mine is the hand that sews time,\r\nhis is the force that lies within.\r\nOurs is the fire, all the warmth we can find.\r\nHe is a feather in the wind. Oh.\r\n\r\nrepeat chorus and fade'),
(2, 'All My Love', 'Hey, hey, mama, said the way you move\r\nGonna make you sweat, gonna make you groove.\r\nOh, oh, child, way you shake that thing\r\nGonna make you burn, gonna make you sting.\r\nHey, hey, baby, when you walk that way\r\nWatch your honey drip, can''t keap away.\r\n\r\n*Ah yeah, ah yeah, ah, ah, ah.\r\nAh yeah, ah yeah, ah, ah, ah.\r\n\r\nI gotta roll, can''t stand still,\r\nGot a flame in my heart, can''t get my fill,\r\nEyes that shine burning red,\r\nDreams of you all thru my head.\r\n\r\nAh ah ah ah ah ah ah ah ah ah ah ah ah.\r\n\r\nHey, baby, oh, baby, pretty baby,\r\nLa la la la la la la.\r\n(Repeat)\r\n\r\nDidn''t take too long ''fore I found out\r\nWhat people mean my down and out.\r\nSpent my money, took my car,\r\nStarted tellin'' her friends she wants to be a star.\r\nI don''t know but I been told\r\nA big legged woman ain''t got no soul.\r\n\r\n* Chorus\r\n\r\nAll I ask for when I pray,\r\nSteady rollin'' woman gonna come my way.\r\nNeed a woman gonna hold my hand\r\nAnd tell me no lies, make me a happy man.'),
(3, 'Black Country Woman', '(Shall we roll it, Jimmy? We''re rolling on what, one?)\r\n(No, one again)\r\n(Got to get this airplane on)\r\n(Naw, leave it, yeah)\r\n\r\nHey, hey, mama, what''s the matter here\r\nHey, hey, mama, what''s the matter here\r\nYou didn''t have to tell me that you love me so\r\nDidn''t have to love me, mama, let me go\r\nHey, hey, mama, what''s the matter here\r\nYou didn''t have to make me a total disgrace\r\nDidn''t have to leave me with that beer in my face\r\nHey, hey, mama, what''s the matter here\r\nOh, that''s all right, it awful doggone clear\r\n\r\nHey, hey, baby, why you treat me mean\r\nOh oh, baby, why you treat me mean\r\nYou didn''t have to crucify me like you did\r\nYou didn''t have to tell me I was just your kid\r\nHey, hey, mama, why''d you treat me mean\r\nYou didn''t have to say you''d always be by my side\r\nDidn''t have to tell me you''d be my blushing bride\r\nHey, hey, baby, why you treat me mean\r\nBut that''s all right, I know your sister, too\r\n\r\nYou didn''t have to tell me that you love me so\r\nYou didn''t have to leave me, mama, let me go\r\nHey, hey, mama, what is wrong with you\r\nYou didn''t have to leave me like a total disgrace\r\nYou didn''t have to leave me with that beer on my face\r\nHey, hey, mama, what is wrong with you\r\nOh, but that''s all right, I''d be the same way, too, oh yeah\r\n\r\nNow, my baby, you didn''t have to crucify me like you did\r\nYou didn''t have to tell me I was just your kid\r\nHey, hey, mama, what''s the matter here\r\nYou didn''t have to tell me you would be my own\r\nYou didn''t have to tell me, baby, let me go\r\nHey, hey, mama, what is wrong with you\r\nOh, that''s all right, I know your sister, too\r\nOh yeah, yeah, oh yeah\r\nWhat''s the matter with you, mama'),
(4, 'Bron-Y-Aur Stomp', 'Ah caught you smiling at me, That''s the way it should be,\r\nLike a leaf is to a tree, so fine.\r\n\r\nAh all the good times we had, I sang love songs so glad\r\nAlways smiling, never sad, so fine.\r\n\r\n* As we walk down the country lanes, I''ll be singing a song,\r\nHear me calling your name.\r\nHear the wind within the trees, Telling Mother Nature ''bout you and me.\r\n\r\nWell if the sunshines so bright, Or on our way it''s darkest night\r\nThe road we choose is always right, so fine. \r\n\r\nAh can your love be so strong When so many loves go wrong\r\nWill our love go on and on…\r\n\r\n* Chorus\r\n\r\nMy, my la de la come on now it ain''t too far,\r\nTell your friends all around the world,\r\nAin''t no companion like a blue eyed merle.\r\nCome on now well let me tell you,\r\nWhat you''re missing, missing, ''round them brick walls.\r\n\r\nSo of one thing I am sure, It''s a friendship so pure,\r\nAngels singing all around My dog is so fine.\r\nYeah, ain''t but one thing to do Spend my nat''ral life with you,\r\nYou''re the finest dog I knew, so fine. \r\n\r\nWhen you''re old and your eyes are dim, There ain''t no old Shep gonna happen again,\r\nWe''ll still go walking down country lanes, I''ll sing the same old songs,\r\nHear me call your name.'),
(5, 'Candy Store Rock', 'Well… Oh baby baby. Don''t you want a man like me?\r\nOh baby baby, I''m just as sweet as anybody could be\r\nOh baby baby, I want to look to your eyes, of blue\r\nOh baby baby, It''s more than anybody else could do\r\n\r\nWell… Oh baby baby. You know when I see you walkin down the street\r\nOh baby baby, Well you lookin good enough to eat\r\nOh baby baby, I dont believe I''ve tasted this before\r\nOh baby baby, I want it now\r\nAnd every mouthfull more of you.\r\n\r\nTalk about you, Yeah.\r\n\r\nOh baby baby, You know that I wanted it more\r\nOh baby baby, I''m about to kiss goodbye to this store\r\nOh baby baby, It ain''t the wrapping that sells the goods\r\nOh baby baby, I got a sweet tooth when my mouth is full of you.\r\n\r\nOoh baby oh baby its alright, its alright\r\nOhh baby its alright…its alright\r\n\r\nOh baby baby, Well now you sting me like a bee\r\noh baby baby, I like your honey; it sure does me\r\nOh baby baby, I got the spoon inside your jar\r\nOh baby baby, Dont give me too much, don''t make me starve\r\n\r\nOh baby baby, Sugar sittin on a silver plate \r\nOh baby baby, I''ll eat ''em up, I just cant wait you know\r\nOh baby baby, You see me shakin my head\r\nOh baby baby, Dont give me (clover?) ''cause it tastes so bad\r\nTastes so bad…\r\n\r\nOh baby it''s alright, oh it''s alright\r\nIt''s alright… (repeat)'),
(6, 'Carouselambra', 'Sisters of the way-side bide their time in quiet peace,\r\nAwait their place within the ring of calm;\r\nStill stand to turn in seconds of release,\r\nAwait the call they know may never come.\r\nIn times of lightness, no intruder dared upon\r\nTo jeopardize the course, upset the run;\r\nAnd all was joy and hands were raised toward the sun\r\nAs love in the halls of plenty overrun.\r\n\r\nStill in their bliss unchallenged mighty feast,\r\nUnending dances shadowed on the day.\r\nWithin their walls, their daunting formless keep,\r\nPreserved their joy and kept their doubts at bay.\r\nFaceless legions stood in readiness to weep,\r\nJust turn a coin, bring order to the fray;\r\nAnd everything is soon no sooner thought than deed,\r\nBut no one seemed to question in anyway.\r\n\r\nHow keen the storied hunter''s eye prevails upon the land\r\nTo seek the unsuspecting and the weak;\r\nAnd powerless the fabled sat, too smug to lift a hand\r\nToward the foe that threatened from the deep.\r\nWho cares to dry the cheeks of those who saddened stand\r\nAdrift upon a sea of futile speech?\r\nAnd to fall to fate and make the ''status plan''\r\nWhere was your word, where did you go?\r\nWhere was your helping, where was your bow? Bow.\r\nDull is the armour, cold is the day.\r\nHard was the journey, dark was the way. Way.\r\nI heard the word; I couldn''t stay. Oh.\r\nI couldn''t stand it another day, another day,\r\nAnother day, another day.\r\n\r\nTouched by the timely coming,\r\nRoused from the keeper''s sleep,\r\nRelease the grip, throw down the key.\r\n\r\nHeld now within the knowing,\r\nRest now within the peace.\r\nTake of the fruit, but guard the seed.\r\n\r\nThey had to stay!\r\n\r\nHeld now within the knowing,\r\nRest now within the beat.\r\nTake of the fruit, but guard the seed…'),
(7, 'Celebration Day', '\r\nHer face is cracked from smiling, all the fears that she''s been hiding,\r\nAnd it seems pretty soon everybody''s gonna know.\r\nAnd her voice is sore from shouting, cheering winners who are losing,\r\nAnd she worries if their days are few and soon they''ll have to go.\r\n\r\n* My, my, my, I''m so happy, I''m gonna join the band,\r\nWe are gonna dance and sing in celebration, We are in the promised land.\r\n\r\nShe hears them talk of new ways to protect the home she lives in,\r\nThen she wonders what it''s all about when they break down the door.\r\n\r\nHer name is Brown or White or Black, you know her very well,\r\nYou hear her cries of mercy as the winners toll the bell.\r\n\r\n* Chorus\r\nThere is a train that leaves the station heading for your destination,\r\nBut the price you pay to nowhere has increased a dollar more.\r\nYes, it has!\r\nAnd if you walk you''re gonna get there though it takes a little longer,\r\nAnd when you see it in the distance you will wring your hands and moan.');

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL,
  `name` char(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `name`) VALUES
(12343, 'Sorokin'),
(12344, 'Kokoshin'),
(12345, 'Lashin');

-- --------------------------------------------------------

--
-- Структура таблицы `usersong`
--

CREATE TABLE IF NOT EXISTS `usersong` (
  `id_song` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  UNIQUE KEY `id_song` (`id_song`),
  KEY `id_user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `usersong`
--

INSERT INTO `usersong` (`id_song`, `id_user`) VALUES
(1, 12345),
(2, 12345),
(3, 12345),
(4, 12345),
(5, 12345);

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `usersong`
--
ALTER TABLE `usersong`
  ADD CONSTRAINT `usersong_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `usersong_ibfk_3` FOREIGN KEY (`id_song`) REFERENCES `song` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
