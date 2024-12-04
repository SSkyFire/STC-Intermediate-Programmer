#SSkyFire Pham Viet Anh

**Bài 1.**

Đề bài: Cho một ma trận M x N gồm các số từ 0~200.

In ra số lượng các số lớn nhất trên ma trận theo chiều dọc, ngang.

Ví dụ:

Ở hàng thứ nhất, số lớn nhất là 10

Hàng thứ 2, số lớn nhất là 11

Hàng thứ 3, số lớn nhất là 9

Hàng thứ 4, số lớn nhất là 8

| 5   | 6   | 9   | 10  |
| --- | --- | --- | --- |
| 7   | 2   | 11  | 5   |
| 2   | 1   | 5   | 9   |
| 0   | 2   | 3   | 8   |

Tiếp tục chọn theo cột, chọn ra được:

| 5   | 6   | 9   | 10  |
| --- | --- | --- | --- |
| 7   | 2   | 11  | 5   |
| 2   | 1   | 5   | 9   |
| 0   | 2   | 3   | 8   |

Vậy nhưng mỗi hàng, cột chỉ được phép tồn tại 1 số, vì vậy số 6,7,9,8 sẽ bị loại bỏ

Những số được chọn cuối cùng:

| 5   | 6   | 9   | 10  |
| --- | --- | --- | --- |
| 7   | 2   | 11  | 5   |
| 2   | 1   | 5   | 9   |
| 0   | 2   | 3   | 8   |

Số lượng các số được chọn là 2.

Nếu trên 1 hàng - cột có 2 số lớn nhất là bằng nhau thì giữ lại cả 2 số.

**TESTCASE**

Dòng đầu tiên là số test case T.

Dòng tiếp theo là số hàng (M) và cột (N)

M dòng tiếp theo là M hàng x N cột của ma trận

**Input**

5

4 4

5 6 9 10

7 2 11 5

2 1 5 9

0 2 3 8

6 6

2 3 8 11 1 4

9 8 2 10 2 1

8 5 4 1 8 2

3 4 5 6 7 8

22 11 7 2 4 9

1 10 9 2 3 8

5 6

14 3 22 28 26 3

14 29 24 1 13 7

7 13 14 19 12 0

26 14 24 27 28 19

19 5 13 23 16 20

5 6

21 7 12 12 8 14

10 2 10 29 20 12

16 24 29 14 9 5

21 1 17 9 5 28

18 7 7 13 21 14

5 6

13 28 0 20 3 22

12 5 9 20 22 0

9 6 16 5 3 4

8 27 15 16 8 9

21 29 0 19 13 16

Ex1.

# 1 2

# 2 3

# 3 3

# 4 5

# 5 3

**Bài 2**

Cho một bàn cờ NxN.

Trong bàn cờ có **1** quân mã được đánh số là 2.

Trên bàn cờ có các quân cờ được đánh số là 1.

Các ô không có quân cờ nào được đánh số là 0.

In ra xem tất cả các quân mã đó có thể ăn được bao nhiêu quân trên bàn cờ.

Ví dụ:

| 1   | 1   | 0   | 1   | 0   | 0   | 0   | 1   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 0   | 0   | 0   | 1   | 0   | 0   | 0   | 0   |
| 0   | 0   | 0   | 1   | 0   | 1   | 0   | 0   |
| 0   | 1   | 2   | 0   | 0   | 0   | 0   | 0   |
| 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   |
| 0   | 0   | 0   | 1   | 0   | 0   | 0   | 1   |
| 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   |
| 0   | 1   | 0   | 0   | 0   | 1   | 0   | 0   |

**In ra sẽ là 2.**

**Testcase**

Dòng thứ nhất là số lượng test case

Dòng thứ 2 là số N là kích thước của mảng

N dòng tiếp theo là các giá trị trong mảng biểu thị quân mã, quân bình thường, và ô trống

6

8 8

1 1 0 0 0 0 0 0

0 0 0 0 0 0 0 1

1 1 1 1 1 1 0 1

1 0 1 2 1 1 1 1

1 0 0 0 1 1 0 1

1 0 1 0 1 1 1 1

1 0 0 1 1 0 1 1

0 0 1 1 0 1 1 1

8 8

1 1 1 0 0 0 1 1

0 0 1 0 1 1 0 1

1 1 1 1 0 1 0 1

0 1 0 2 1 1 0 0

1 1 0 0 1 0 1 1

0 1 0 0 0 1 0 1

1 1 1 0 0 1 1 1

0 1 1 0 0 0 1 1

8 8

0 1 0 1 0 1 1 1

1 0 0 0 1 0 1 1

1 0 0 0 0 1 0 1

0 0 0 0 0 0 1 0

1 1 0 0 0 0 0 0

1 0 0 0 2 1 1 1

0 0 0 1 0 0 0 0

0 1 1 1 0 1 1 1

16 16

1 0 0 0 1 0 0 0 1 0 0 1 1 0 0 0

0 0 0 0 0 0 1 1 0 1 1 0 1 1 0 1

0 0 1 1 0 1 1 1 0 0 0 1 0 0 1 0

1 0 1 0 0 0 1 1 1 1 1 1 0 0 0 1

1 0 1 1 0 0 0 1 2 1 1 1 1 1 1 1

1 0 1 0 0 0 0 1 0 0 1 0 1 1 1 1

1 0 0 1 0 0 1 0 0 0 1 0 0 1 1 1

0 0 0 1 0 1 1 0 0 1 1 0 1 1 1 0

1 1 1 1 0 0 0 0 0 1 0 0 1 0 1 0

1 1 0 1 0 0 0 1 1 0 0 1 0 0 0 1

0 1 0 1 1 1 0 1 1 1 1 0 1 1 1 1

1 0 1 1 0 1 0 1 1 0 1 1 1 1 0 1

0 0 0 0 1 0 0 1 1 1 1 0 0 1 1 0

0 1 1 1 1 0 1 0 1 0 0 0 1 0 1 0

1 0 0 0 1 1 1 0 1 0 0 0 1 0 0 1

1 1 0 1 1 0 0 1 0 1 0 1 0 1 1 1

16 16

0 0 1 0 1 0 1 1 0 0 0 1 0 1 0 0

1 0 1 1 1 1 0 0 1 0 0 0 0 1 1 0

0 0 1 1 1 1 1 1 0 1 1 0 1 0 1 1

1 1 0 1 0 0 0 1 2 1 0 0 1 0 1 0

0 1 0 0 0 0 0 1 0 1 1 1 0 1 0 0

0 0 0 0 1 0 0 1 0 1 0 0 1 1 1 1

1 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0

0 0 0 1 0 1 0 1 1 1 1 1 1 1 0 1

1 1 0 0 1 1 1 1 1 1 1 0 0 0 0 1

0 0 0 1 0 0 1 0 1 1 0 0 0 0 0 1

1 1 1 1 0 0 0 1 1 1 0 0 1 1 0 0

1 0 1 0 0 1 0 0 0 0 0 1 1 1 1 0

0 1 0 0 1 0 1 1 0 1 0 1 1 1 0 1

1 0 1 0 1 0 0 1 1 0 1 0 1 1 0 0

1 1 0 1 1 1 1 1 1 0 1 1 1 1 1 0

0 0 0 1 1 0 1 0 1 0 1 0 0 0 0 1

16 16

0 0 0 0 1 1 1 0 0 0 1 0 1 0 0 0

1 0 1 1 0 0 1 0 1 1 0 0 1 0 1 0

1 0 0 0 0 1 1 1 0 1 1 0 1 0 1 0

0 0 0 1 0 1 1 0 1 1 1 1 0 0 0 0

0 0 1 1 0 0 0 1 0 1 0 1 1 1 1 1

0 0 0 1 1 1 1 1 1 1 0 0 0 0 1 1

0 1 0 0 1 1 1 1 1 1 1 1 0 0 1 1

1 1 0 1 1 0 0 1 1 1 0 0 0 0 0 1

0 0 0 1 1 1 1 0 0 0 0 0 0 1 1 1

0 0 0 1 1 0 1 0 1 0 2 0 1 0 1 0

1 0 0 0 0 0 1 1 0 1 0 0 1 0 0 0

1 1 0 1 1 0 0 0 0 0 0 1 0 1 1 0

1 1 0 1 1 1 0 0 0 1 0 0 1 1 1 0

0 0 0 0 0 0 0 1 1 0 1 1 0 1 1 1

0 0 0 0 1 1 1 1 0 1 0 0 1 1 1 0

1 1 1 0 1 1 0 0 1 0 1 1 0 1 0 0

# 1 5

# 2 5

# 3 2

# 4 4

# 5 5

# 6 3

**Bài 3**

Bài này giống bài 2, chỉ khác có nhiều quân mã

Cho một bàn cờ NxN.

Trong bàn cờ có các quân mã được đánh số là 2.

Trên bàn cờ có các quân cờ được đánh số là 1.

Các ô không có quân cờ nào được đánh số là 0.

In ra xem tất cả các quân mã đó có thể ăn được bao nhiêu quân trên bàn cờ.

Ví dụ:

| 1   | 1   | 0   | 1   | 0   | 0   | 0   | 1   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   |
| 0   | 0   | 0   | 1   | 0   | 1   | 0   | 0   |
| 0   | 1   | 2   | 0   | 0   | 0   | 2   | 0   |
| 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   |
| 1   | 0   | 0   | 1   | 0   | 0   | 0   | 1   |
| 0   | 0   | 2   | 0   | 0   | 0   | 0   | 0   |
| 0   | 1   | 0   | 0   | 0   | 1   | 0   | 0   |

**Màu đỏ là vị trí của các quân mã**

**Màu vàng là các quân có thể ăn được**

**Các quân mã không ăn được nhau**

**Với testcase này in ra 3 là đáp án đúng**

**  
Testcase**

Dòng thứ nhất là số lượng test case

Dòng thứ 2 là số N là kích thước của mảng

N dòng tiếp theo là các giá trị trong mảng biểu thị quân mã, quân bình thường, và ô trống

5

8 8  
1 1 0 1 1 0 2 1  
1 0 0 0 1 0 0 1  
0 0 0 0 1 1 0 0  
1 1 0 2 0 0 1 0  
0 0 0 0 1 1 0 0  
0 1 0 1 1 1 1 0  
0 2 0 1 1 0 1 1  
1 0 0 1 0 1 0 1  
<br/>8 8  
0 0 1 1 1 0 1 1  
0 2 0 1 1 0 0 0  
0 0 1 1 1 2 0 1  
1 1 1 0 1 0 0 0  
0 0 1 1 1 0 1 0  
1 2 1 1 1 1 1 0  
0 1 0 1 1 1 0 1  
0 1 0 0 1 2 1 1  
<br/>8 8  
1 1 0 0 0 0 1 0  
1 1 0 2 0 0 0 1  
0 0 1 0 0 1 1 1  
0 0 1 1 0 2 0 0  
0 0 1 0 1 1 1 1  
0 2 0 0 0 1 1 0  
1 0 1 0 1 1 1 1  
1 1 1 2 1 1 1 0

15 15

0 0 0 1 1 1 0 0 1 0 0 0 1 2 1

1 1 1 1 0 1 1 1 1 0 1 0 0 0 1

0 1 1 1 2 0 0 1 0 0 0 0 0 0 1

1 1 0 0 1 0 1 0 0 0 1 1 0 0 1

1 0 1 1 0 1 1 1 0 0 0 0 0 0 0

1 1 0 1 1 0 0 2 0 0 1 1 1 1 0

1 1 1 1 0 0 0 0 0 0 1 1 0 0 0

1 0 0 1 1 1 0 0 1 1 1 0 0 1 0

1 1 0 1 0 0 0 0 1 0 1 1 1 1 0

0 1 0 0 0 1 0 1 0 0 1 0 1 0 0

2 0 1 0 0 0 1 0 1 1 1 0 0 1 0

0 0 0 0 1 1 0 1 0 1 1 1 0 1 1

0 1 1 2 1 1 1 0 1 0 1 0 1 1 1

0 0 0 1 1 1 0 0 0 1 1 1 1 1 1

0 1 1 0 1 1 0 0 1 1 2 1 1 1 0

15 15

1 0 1 0 0 1 1 2 1 1 0 0 0 0 0

1 0 1 1 1 0 1 1 1 1 0 0 1 0 0

0 0 1 1 0 0 1 0 1 0 0 1 1 1 0

1 0 1 0 0 0 1 0 0 1 1 1 0 1 0

1 1 0 0 0 1 1 0 0 2 0 0 0 0 1

1 1 1 1 1 1 1 0 1 1 0 0 1 1 1

2 1 0 1 0 1 0 0 0 1 1 0 1 0 0

1 1 0 1 0 1 1 1 0 1 1 1 0 1 1

1 1 1 0 0 1 1 1 1 0 0 0 0 1 1

0 1 1 0 1 1 1 1 1 1 0 0 0 1 1

1 0 1 0 0 0 0 1 0 0 1 1 0 0 0

0 1 0 1 1 0 0 0 0 0 1 1 1 1 1

0 0 1 0 1 0 1 0 1 0 0 1 1 1 1

1 0 1 1 0 1 1 1 0 0 0 0 1 1 0

1 0 0 0 0 1 2 0 0 1 1 0 1 0 0

# 1 6

# 2 14

# 3 9

# 4 17

# 5 8  

**Bài 4**

Tại một số quốc gia, có một số các số được coi là số đẹp hơn các số khác.

Ví dụ tại đất nước A, số 5 và số 7 là số đẹp.

Samsung muốn bán được nhiều sản phẩm nhất tại nước A, nhưng người nước A chỉ mua sản phẩm khi sản phẩm đó được đánh số trong đó có n số đẹp.

Ví dụ:

Các sản phẩm được đánh số từ x - y, (x,y < 100 000) ví dụ trong trường hợp này là từ

0 <= mã sp <= 1000, muốn bán được sản phẩm cần phải chứa ít nhất 2 số đẹp trong đó (là 5 và 7).

Vậy nên các số như 55 , 77, 57, 75, 55x, 77x, 57x, 75x… được coi là những sản phẩm có số đẹp và bán được.

Yêu cầu in ra tổng các số thỏa mãn các yêu cầu trên.

Ví dụ như trên có đáp án là : 55 + 77 + 57 + 75 + 77x + 55x + 57x + 75x + 7x7 + 5x5 + 7x5 + 5x7 + x55 + x57 + x75 + x77 = 4 + 8\*10 + 4\*9 = 120 số.

**Test case:**

Dòng đầu tiên là số lượng test case

3 dòng tiếp theo

Dòng thứ 1là số lượng các số đẹp (n số), số lượng các số đẹp yêu cầu có trong mã sản phẩm ( m số)

Dòng thứ 2 là n số đẹp liên tiếp nhau

Dòng thứ 3 là 2 số x,y. (số chọn nằm trong khoảng x <= số <= y)

**Output:**

In ra số lượng các số thỏa mãn

**Input:**

4

2 3

2 0

15 900

3 2

1 2 3

1 99

3 3

4 8 9

123 9921

3 3

2 7 3

1199 22132

Ex4.

# 1 4

# 2 9

# 3 792

# 4 2149

**Bài 5**

**Có 4 loại tam giác đánh số 1,2,3,4 như hình vẽ. Cho ma trận cấp N\*N... vs các phần tử 0 và 1. Y/c: Đếm số lượng các tam giác xuất hiện trong ma trận.**

**![](data:image/png;base64,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)**

**Lưu ý: Một số có thể dùng nhiều lần để vẽ tam giác.**

**Ví dụ:**

**![](data:image/png;base64,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)**

**Số 1 ở giữa có thể được dùng 2 lần để vẽ ra 2 tam giác.**

**Đếm số tam giác xuất hiện.**

**Testcase:**

**Dòng đầu tiên là số lượng testcase**

**Dòng tiếp theo là N, kích cỡ của ma trận NxN**

**N dòng tiếp theo là ma trận chứa 0 - 1.**

**5**

**10 10**

**0 0 0 0 0 1 0 1 0 0**

**1 0 1 0 1 1 1 1 0 0**

**0 0 0 0 0 0 0 1 1 0**

**0 1 1 0 1 0 0 1 1 1**

**1 1 1 1 1 1 0 1 0 1**

**1 0 1 1 1 0 0 0 1 1**

**1 1 0 1 0 1 0 1 0 0**

**0 1 0 1 1 1 1 0 1 1**

**1 1 1 0 0 1 1 0 1 1**

**1 0 1 1 0 1 1 1 1 1**

**10 10**

**1 1 0 1 1 0 1 0 1 0**

**1 1 0 1 0 1 0 1 1 0**

**0 0 1 1 1 0 1 0 0 0**

**1 1 0 0 0 1 1 1 0 0**

**1 1 0 0 0 1 1 0 1 0**

**0 0 0 0 1 0 0 1 1 0**

**0 0 0 0 1 0 0 0 1 0**

**0 0 0 0 0 0 1 1 1 1**

**0 1 1 0 0 1 1 1 1 1**

**1 1 1 1 1 0 0 0 0 0**

**10 10**

**1 1 1 0 1 1 0 1 1 0**

**0 0 1 1 0 1 1 1 0 0**

**1 1 1 0 0 1 0 0 1 1**

**0 1 1 1 0 0 1 0 1 0**

**0 0 1 1 1 0 0 1 1 0**

**0 0 0 1 1 1 0 0 0 1**

**0 1 1 1 1 0 0 1 1 1**

**0 0 0 1 0 0 0 0 1 1**

**0 1 1 0 1 1 1 1 1 0**

**0 1 0 1 1 0 0 1 1 1**

**10 10**

**0 1 1 1 1 0 1 1 0 0**

**1 1 0 0 0 1 0 0 1 1**

**1 0 0 0 0 0 1 1 0 0**

**1 1 0 0 0 0 1 0 1 0**

**1 0 0 0 0 0 1 0 0 0**

**0 1 1 1 1 0 1 0 0 1**

**0 0 1 1 0 0 1 0 0 1**

**1 0 1 1 1 1 1 0 1 1**

**0 0 0 0 1 0 0 0 0 0**

**1 0 0 1 0 1 0 1 1 1**

**10 10**

**0 0 0 1 0 1 0 1 1 1**

**0 0 1 1 0 1 1 1 0 1**

**1 1 0 1 1 1 0 1 0 1**

**0 0 0 1 0 0 1 1 0 0**

**0 0 0 1 1 1 1 0 1 0**

**1 0 1 1 1 1 1 1 0 1**

**0 0 1 1 1 0 0 1 1 0**

**1 1 1 0 1 0 1 0 0 1**

**0 1 0 1 1 1 1 0 0 0**

**0 1 0 1 0 1 0 0 1 1**

**Ex5.**

**#1 63**

**#2 42**

**#3 54**

**#4 21**

**#5 51**

**Bài 6**

**cho ma trận kích thước n \* n gồm các ký tự 0 và 1 ,ví dụ n = 3**

**TH1,**

**100**

**100**

**111**

**Th2,**

**111**

**010**

**010**

**TH3,**

**101**

**101**

**010**

**TH4**

**101**

**111**

**101**

**3 trường hợp trên lần lượt là**

**\+ 1 chữ L,0 chữ T,0 chữ U, 0 chữ H**

**+0 chữ L ,1 chữ T,0 chữ U, 0 chữ H**

**+0 chữ L,0 chữ T,1 chữ U, 0 chữ H**

**+0 chữ L,0 chữ T,0 chữ U, 1 chữ H**

**N <= 100 các chữ cách nhau và luôn có nghĩa**

**Mỗi chữ nằm trong 1 block 3x3 và được bao bọc tối thiểu bởi 1 dãy số 0**

**Các chữ có thể xoay 90-180-270 độ**

**Test case:**

**Dòng đầu số test case, dòng 2 kích thước ma trận vuông N x N**

**N dòng tiếp theo là các ký tự trong mảng**

**3**

**10 10**

**1 0 0 0 0 0 1 1 0 0**

**1 0 0 0 0 0 0 0 0 0**

**1 1 1 0 0 0 1 0 1 0**

**0 0 0 0 0 0 1 0 1 0**

**1 1 1 0 0 0 0 1 0 0**

**0 1 0 0 0 0 0 0 0 0**

**0 0 0 0 0 0 0 1 0 0**

**0 0 1 0 0 0 0 1 0 0**

**0 0 1 0 0 0 0 1 1 1**

**0 1 1 1 0 0 0 0 0 0**

**10 10**

**1 1 1 0 1 0 0 0 0 0**

**0 0 0 0 1 0 0 0 0 0**

**1 1 1 0 1 1 1 0 0 0**

**0 1 0 0 0 0 0 0 0 0**

**1 1 1 0 1 1 1 0 0 0**

**0 0 0 0 0 0 1 0 0 0**

**0 0 0 0 0 0 1 0 0 0**

**0 0 0 1 0 0 0 0 1 0**

**0 0 1 0 1 0 0 0 1 0**

**0 0 1 0 1 0 0 0 1 0**

**10 10**

**0 0 0 1 0 0 0 0 0 0**

**0 1 0 0 0 0 0 0 0 0**

**1 0 1 0 1 1 0 0 0 0**

**1 0 1 0 0 0 1 0 0 0**

**0 0 0 0 1 1 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 0 1 0 0 0 0 1 1 1**

**1 1 1 0 0 0 0 1 0 0**

**0 0 1 0 0 0 0 1 0 0**

**Output**

**In ra 4 số theo thứ tự là số lượng chữ H, T, L, U đếm được**

**Ex6.**

**#1 0 1 2 1**

**#2 1 0 2 1**

**#3 0 1 1 2**

**Bài 7**

**Người ta muốn tìm một đường trượt băng trên một khu vực núi.**

**N: là số điểm**

**H: là chiều cao so với mặt đất tại điểm đó**

**F: là lực để di chuyển. Biết khi F < 0 thì k thể trượt được. F = 0 sẽ trượt sang trái hoặc phải nếu bên đó thấp hơn điểm đang đứng.**

**Khi di chuyển từ cao (H1)-> thấp(H2) : F = 1 đơn vị lực x ( H1 - H2).**

**Khi di chuyển từ thấp(H1)-> cao (H2): F = -3 đơn vị lực x ( H1 - H2).**

**Tìm đoạn lớn nhất có thể làm sân trượt tuyết.( khoảng cách 2 đỉnh )**

**ví dụ:**

**Số đầu là test case**

**N: 10**

**H(1->10):** [**5 20 18 15 10 7 6 1**](https://www.facebook.com/#) **10 0**

**Đáp án: 6 ( đi từ 20 -> 1)**

**Đi từ 20 xuống 1 được 19 lực, đi từ 1 lên 10 mất 9\*3 = 27 lực, ko đi được.**

**H(1->10):** [**5 20 15 10**](https://www.facebook.com/#) **5** [**0 2 1 6**](https://www.facebook.com/#) **7**

**Đáp án: 4 Từ 20 -> 0 hoặc từ 7->0**

**Đi từ 20 xuống 0 được 20 lực, đi từ 0 lên 2 mất 6 lực, còn 14**

**Đi từ 2 xuống 1 được thêm 1 là 15**

**Từ 1 lên 6 mất 15 lực là còn 0 lực.**

**Vật đang ở 6 chỗ cao, sau khi lên được sẽ lăn lại xuống 1 là được 5 lực**

**Lăn tiếp từ 1 lên 2 mất 3 lực, còn 2 lực**

**Lăn từ 2 xuống 0 được 2 lực, là 4 lực**

**Lăn từ 0 lên 5 mất 15 lực, ko đủ nên vật dừng lại.**

**Đường trượt tuyết được chỉ được tính đến lúc dừng lại, vì vậy chỉ đc tính từ 20-0**

**Test:**

**5**

**10**

**5 9 4 1 0 3 2 5 2 0**

**20**

**9 8 1 2 8 2 0 8 1 0 1 4 8 5 4 1 0 1 4 9**

**9**

**9 1 0 11 2 9 20 1 8**

**20**

**23 7 18 20 2 8 22 15 19 24 1 3 13 19 6 0 0 13 11 11**

**20**

**7 11 8 9 14 7 19 23 13 4 2 2 3 5 23 18 11 17 20 12**

**Ex7. Output chuẩn**

**#1 5**

**#2 4**

**#3 2**

**#4 3**

**#5 3**

**Bài 8**

Giả sử có một trò chơi xếp hình như sau:

|     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |

Các block màu vàng là các khối hình 2x1

Sau đó, các khối hình rơi xuống dưới thành hình dạng như sau:

|     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |
|     |     |     |     |     |     |

3 1 2 1 2 2

Khối 2x1 bôi đỏ sau khi rơi xuống 1 đầu bị khối bên dưới giữ lại nên đầu còn lại ko rơi được xuống như hình.

Nhiệm vụ: In ra chiều cao cao nhất ở mỗi hàng sau khi tất cả các block rơi xuống, như trong ví dụ trên là: 3 1 2 1 2 2

Biết rằng các khối luôn tách biệt nhau và ko dính vào nhau để loại trừ trường hợp không biết block 2x1 là dọc hay ngang như sau đây:

|     |     |     |     |
| --- | --- | --- | --- |
|     |     |     |     |
|     |     |     |     |
|     |     |     |     |

**Testcase**

**Dòng 1 là số lượng test case**

**Dòng tiếp theo là số hàng và cột ( bài này luôn là 10 hàng - 10 cột)**

**10 dòng tiếp theo là input, 0 là vị trí trống, 1 là vị trí có gạch**

**Các block luôn là 2x1**

**5**

**10 10**

**1 0 0 0 1 1 0 0 0 0**

**1 0 0 0 0 0 0 0 0 0**

**0 0 1 1 0 0 0 0 0 0**

**1 1 0 0 0 0 0 0 0 0**

**0 0 0 1 0 0 1 1 0 0**

**0 0 0 1 0 0 0 0 0 0**

**0 0 0 0 0 0 0 1 1 0**

**0 1 0 1 1 0 0 0 0 1**

**0 1 0 0 0 0 0 0 0 1**

**0 0 0 0 0 0 0 0 0 0**

**10 10**

**0 0 1 0 0 1 1 0 0 0**

**0 0 1 0 0 0 0 0 0 1**

**0 0 0 0 1 1 0 0 0 1**

**0 1 0 0 0 0 0 0 0 0**

**0 1 0 0 0 0 0 0 0 0**

**0 0 0 0 0 0 0 0 0 1**

**0 1 1 0 1 1 0 0 0 1**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 1 0 0 0 0 0 0**

**0 0 0 1 0 1 1 0 0 0**

**10 10**

**0 0 0 0 0 0 1 0 0 0**

**0 1 1 0 0 0 1 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**1 0 0 0 0 0 1 0 0 0**

**1 0 1 1 0 0 1 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 1 0 0 0 0 0 0 0 0**

**0 1 0 0 0 0 1 0 0 0**

**0 0 0 1 1 0 1 0 0 0**

**0 0 0 0 0 0 0 0 1 1**

**10 10**

**0 0 0 0 1 1 0 0 0 1**

**0 0 0 0 0 0 0 0 0 1**

**1 1 0 0 0 0 0 0 0 0**

**0 0 0 1 0 1 0 0 0 0**

**0 0 0 1 0 1 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 1 1 0 0 1 0 0**

**0 0 0 0 0 0 0 1 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 1 1 0 1 1 0 0 0 0**

**10 10**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 0 0 1 0 0 0 0**

**0 0 0 0 0 1 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**1 1 0 0 0 1 0 0 0 0**

**0 0 0 0 0 1 0 0 0 0**

**0 0 0 0 0 0 0 0 0 0**

**0 0 0 0 0 1 1 0 0 0**

**0 0 1 1 0 0 0 0 1 1**

**Ex8.**

**#1 5 3 4 4 2 2 2 2 1 2**

**#2 0 3 3 2 3 4 4 0 0 4**

**#3 2 3 3 2 1 0 6 0 1 1**

**#4 2 2 1 4 4 4 0 2 0 2**

**#5 1 1 1 1 0 5 1 0 1 1**

**Bài 9**

**Có n quốc gia cạnh nhau và sắp xếp như một mảng một chiều, mỗi quốc gia có quân đội bảo vệ lãnh thổ của mình, số lượng của binh sĩ trong quân đội nằm trong mỗi ô như hình dưới:**

| **20** | **8** | **16** | **9** | **35** | **7** |
| --- | --- | --- | --- | --- | --- |

**A B C D E F**

**Giả sử đất nước A muốn mở rộng lãnh thổ nên tấn công theo hướng bên phải sang nước B.**

**Trong trận chiến giữa các đất nước, khi đất nước bị tấn công cảm thấy binh lực bên mình chỉ &lt;= ½ binh lực đội quân tấn công, đất nước đó sẽ đầu hàng và toàn bộ binh lực bị nước tấn công thâu tóm. Còn nếu binh lực &gt; 1/2 , 2 nước sẽ chiến đấu với nhau theo tỉ lệ thiệt hại 1-1,đất nước nào còn quân sẽ chiến thắng.**

**Giả sử khi tấn công chỉ được tấn công theo 1 hướng từ trái qua phải hoặc từ phải qua trái mà không được quay lại. Đất nước nào tấn cống sẽ tấn công cho đến khi hết binh. Đất nước được chọn khi tấn công kể cả khi binh lực ít hơn cũng vẫn tấn công theo tỉ lệ 1-1 mà không sáp nhập vào đất nước khác.**

**In ra số lượng quân tối đa mà một đất nước có thể đánh bại, số quân đánh bại tính cả số quân thu phục về nước mình.**

**Ví dụ đất nước A tấn công sang bên phải, mỗi bước sẽ là :**

| **20** | **8** | **16** | **9** | **35** | **7** |
| --- | --- | --- | --- | --- | --- |

**A B C D E F**

**20/2 > 8, sẽ thu phục được 8 lính để thành 28 quân**

|     | **28** | **12** | **4** | **35** | **7** |
| --- | --- | --- | --- | --- | --- |

**A B C D E F**

**28/2 < 16, sau khi đánh nước C sẽ chỉ còn 12 quân**

**12/2 < 9, sau khi đánh nước D sẽ chỉ còn 3 quân**

**Và tiếp tục đánh nước E sẽ hết quân.**

**Vậy tổng số quân mà nước A đánh bại là: 8 + 16+ 9 + 3 = 36 quân.**

**Tiếp tục tính toán cho đất nước B,C,D,E,F và in ra số lớn nhất mà 1 đất nước đánh bại được.**

**Testcase:**

**Dòng đầu là số lượng test**

**Mỗi test trên 2 dòng**

**Dòng 1 là số lượng đất nước (N)**

**Dòng tiếp theo là N số biểu thị quân mỗi nước**

**5**

**10**

**689 767 390 36 938 916 165 459 503 508**

**10**

**591 330 154 9 94 189 653 259 419 485**

**10**

**220 454 763 840 909 384 108 739 880 570**

**20**

**47 144 103 10 177 1 199 30 113 4 60 134 126 134 181 88 51 71 23 174**

**20**

**6 24 148 48 60 141 89 125 177 111 195 114 147 116 147 99 95 91 24 54**

Ex9.

# 1 689 839 462 36 1790 1635 165 789 503 508

# 2 609 1222 172 9 112 207 1367 259 419 485

# 3 220 454 763 840 1893 600 108 1723 880 570

# 4 47 164 123 10 197 1 1189 30 173 4 68 322 126 134 407 88 51 117 23 1696

# 5 [6 24](https://www.facebook.com/#) 364 48 60 286 89 125 177 111 195 114 147 116 147 99 95 91 24 102

**Bài 10**

**Nhân dịp đến quê hương Bắc Giang tham gia thi chọn học sinh giỏi Trại hè Hùng Vương, Hà đến thăm trang trại trồng vải thiều của bác Thuấn. Trang trại gồm n cây thẳng hàng và cách đều nhau (khoảng cách từ gốc cây i đến gốc cây i+1 là 3 mét với mọi i = 1, 2, 3, ..., n-1).**

**Năm nay là năm được mùa nên cây nào cũng sai quả, cây thứ i có số lượng quả vải là ai quả. Bác Thuấn rất lo lắng vì tuổi già rồi làm sao có thể hái được hết số vải thiều này, Hà đang nghĩ cách giúp bác Thuấn thì đột nhiên có một ông tiên hiện ra trước mắt Hà và nói: “Ta cho cháu một chiếc túi thần, cháu hãy chọn một chỗ đứng ở một gốc cây trong n cây rồi hô to câu thần chú \[_Vải ơi chui vào đây_\], khi đó tất cả quả ở các cây có khoảng cách tính từ gốc đến chỗ cháu đứng không vượt quá H (mét) sẽ từ từ rời khỏi cành và bay vào túi thần này.”**

### Yêu cầu

**Hãy cho biết Hà có thể thu hoạch giúp bác Thuấn được tối đa bao nhiêu quả vải nếu lời nói của ông tiên là hiện thực.**

### Input

**Đầu vào có dạng: Số testcase đầu tiên**

- **Dòng đầu chứa hai số nguyên dương n, H (n ≤ 100; H ≤ 109)**
- **Dòng thứ hai chứa n số nguyên a1 , a2 , . . ., an trong đó ai (ai ≤ 109 ; i = 1, 2, 3, . . ., n) là số lượng quả của cây vải thứ i.**

**Hai số liên tiếp trên cùng dòng được ghi cách nhau bởi dấu cách.**

### Output

**Gồm một số nguyên duy nhất là tổng số lượng quả vải nhiều nhất mà Hà có thể thu hoạch giúp bác Thuấn.**

**6**

**5 6**

**5 53 7 13 78**

**5 7**

**72 21 49 61 63**

**5 11**

**1 53 35 57 2**

**15 14**

**1 57 97 34 8 97 70 51 12 69 56 95 80 38 79**

**15 22**

**8 67 4 7 50 9 37 37 67 67 65 40 69 68 88**

**15 25**

**20 78 63 12 98 53 7 41 49 51 65 13 75 61 14**

**Ex10.**

**#1 156**

**#2 266**

**#3 148**

**#4 568**

**#5 683**

**#6 700**

**Bài 11**

**Cho một bộ test cast gồm:**

**Dòng đầu tiên là số lượng testcase, mỗi testcase gồm 2 dòng**

**Dòng đầu tiên gồm 2 số là n và m trong đó n là số lượng các số, m là tổng yêu cầu của n số trên.**

**Dòng tiếp theo là n số đó.**

**Biết rằng trong n số là các số từ 1 tới 9 và không lặp lại nhau.**

**Sẽ có 2 số ở mỗi dòng chưa được gán giá trị được gọi là x và y và được biểu thị là 0.**

**Yêu cầu in ra số cách có thể điền 2 số đó. Nếu không có in ra 0**

**Ví dụ:**

**5 20**

**2 3 0 0 8**

**Ta thấy có 2 số cần điền gọi là x và y. 2 + 3 + x + y + 8 = 20 -> x + y = 7**

**Vì các số là từ 1 tới 9 và không trùng nhau, vậy x và y có thể là:**

**x = 6 , y = 1 hoặc x = 1, y = 6. (không thể là 2 5 do đã có số 2)**

**Tổng cộng có 2 cách có thể điền x và y.**

**Testcase**

**5**

**4 15**

**1 2 0 0**

**5 14**

**1 2 0 9 0**

**5 22**

**1 9 8 0 0**

**5 25**

**2 8 4 0 0**

**5 30**

**9 8 7 0 0**

**Output**

**#1 6**

**#2 0**

**#3 0**

**#4 2**

**#5 4**
