SELECT * FROM board;
SELECT * FROM attach;

DESC attach;

SELECT * FROM board b
INNER JOIN attach a
ON b.num=a.board_num;

SELECT * FROM board b
INNER JOIN attach a
ON b.num=a.board_num
WHERE b.num = 7;

SELECT * FROM board b
LEFT OUTER JOIN attach a
ON b.num=a.board_num;

SELECT * FROM board b
LEFT OUTER JOIN attach a
ON b.num=a.board_num
WHERE b.num = 3;