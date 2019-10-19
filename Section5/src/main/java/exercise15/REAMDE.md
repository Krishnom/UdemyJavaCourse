<div class="instructions--content--1JI0g"><div class="instructions--title--3vSDk" data-purpose="exercise-title">Number Palindrome</div><div class="instructions--description--2Qd_w"><p>Write a method called&nbsp;<strong>isPalindrome</strong>&nbsp;with one&nbsp;<strong>int</strong>&nbsp;parameter called&nbsp;<strong>number</strong>.<br><br>The method needs to&nbsp;<strong>return a&nbsp;boolean</strong>.<br><br>It should return&nbsp;<strong>true</strong>&nbsp;if the&nbsp;number is a&nbsp;palindrome number otherwise it should return&nbsp;<strong>false</strong>.&nbsp;<br><br>Check the tips below for more info about palindromes.</p><p><strong>Example Input/Output</strong></p><ul><li><p><code><strong>isPalindrome(-1221);</strong></code>&nbsp;→ should&nbsp;<strong>return true</strong></p></li></ul><ul><li><p><code><strong>isPalindrome(707);</strong></code>&nbsp;→ should&nbsp;<strong>return true</strong></p></li></ul><ul><li><p><code><strong>isPalindrome(11212);</strong></code>&nbsp;→ should&nbsp;<strong>return false</strong>&nbsp;because reverse is 21211 and that is&nbsp;<strong>not equal</strong>&nbsp;to 11212.</p></li></ul><p><strong>Tip: What is a&nbsp;Palindrome number?</strong>&nbsp; A palindrome number is a&nbsp;number which when&nbsp;<strong>reversed</strong>&nbsp;is equal to the original&nbsp;<strong>number</strong>. For example: 121, 12321, 1001 etc.</p><p><strong>Tip: Logic to check a&nbsp;palindrome number</strong></p><p>Find the&nbsp;the&nbsp;reverse of the given number. Store it in some variable say&nbsp;<strong>reverse</strong>. Compare the&nbsp;<strong>number</strong>&nbsp;with&nbsp;<strong>reverse</strong>.&nbsp;<br><br>If both are the&nbsp;the&nbsp;same then the number&nbsp;<strong>is a&nbsp;palindrome</strong>&nbsp;otherwise&nbsp;<strong>it is&nbsp;not</strong>.</p><p><strong>Tip: Logic to reverse a&nbsp;number</strong></p><p>Declare and initialize another variable to store the&nbsp;reverse of a&nbsp;number, for example&nbsp;<strong>reverse = 0</strong>.&nbsp;<br><br>Extract the&nbsp;last digit of the given number by performing the modulo division (remainder).&nbsp;<br>Store the last digit to some variable say&nbsp;<strong>lastDigit = num % 10</strong>.&nbsp;<br>Increase the place value of reverse by one.<br>To increase place value&nbsp;<strong>multiply</strong>&nbsp;the reverse variable&nbsp;<strong>by 10</strong>&nbsp;e.g.&nbsp;<strong>reverse = reverse * 10.<br>Add&nbsp;lastDigit</strong>&nbsp;to reverse.&nbsp;<br>Since the last digit of the&nbsp;<strong>number</strong>&nbsp;is processed, remove the last digit of num. To remove the last digit&nbsp;<strong>divide&nbsp;number by 10.</strong>&nbsp;<br>Repeat steps until&nbsp;<strong>number</strong>&nbsp;is not&nbsp;<strong>equal to (or greater than)</strong>&nbsp;zero.&nbsp;</p><p>A while loop would be good for this coding exercise.</p><p><br></p><p><strong>Tip:&nbsp;Be careful with negative&nbsp;numbers.&nbsp;</strong>They can also be palindrome numbers.</p><p><strong>Tip:</strong>&nbsp;<strong>Be careful with reversing a&nbsp;number</strong>, you will need a&nbsp;parameter for comparing a&nbsp;reversed number with the&nbsp;starting number (parameter).</p><p><br></p><p><strong>NOTE:</strong>&nbsp;The method&nbsp;<strong>isPalindrome</strong>&nbsp;needs to be defined as&nbsp;public static&nbsp;like we have been doing</p></div></div><div class="instructions--drag-handle--ocDGT"></div>