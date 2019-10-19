<div class="instructions--content--1JI0g"><div class="instructions--title--3vSDk" data-purpose="exercise-title">Sum Odd</div><div class="instructions--description--2Qd_w"><p>Write a method called <strong>isOdd</strong> with an <strong>int</strong> parameter and call it number. The method needs to return a boolean.<br><br>Check that number<strong> is &gt; 0</strong>, if it is not return <strong>false</strong>.</p><p>If number<strong> is odd</strong> return <strong>true</strong>, <strong>otherwise </strong>return<strong> false</strong>.</p><p>Write a second method called <strong>sumOdd</strong> that has <strong>2 int</strong> parameters <strong>start</strong> and <strong>end</strong>, which represent a range of numbers.<br><br>The method should use a<strong> for loop</strong> to sum all odd numbers in that range <strong>including</strong> the <strong>end</strong> and <strong>return</strong> the <strong>sum</strong>.<br><br>It should call the method i<strong>sOdd</strong> to check if each number is <strong>odd</strong>.</p><p>The parameter <strong>end</strong> needs to be <strong>greater than or equal to start</strong> and both <strong>start</strong> and <strong>end</strong> parameters have to be<strong> greater than 0</strong>.<br><br>If those conditions are not satisfied return <strong>-1</strong> from the method to indicate invalid input.</p><p><br></p><p><strong>Example input/output</strong>:</p><ul><li><p><code><strong>sumOdd(1, 100);</strong></code> → should <strong>return</strong> 2500</p></li></ul><ul><li><p><code><strong>sumOdd(-1, 100);</strong></code> → should <strong>return</strong> -1</p></li></ul><ul><li><p><code><strong>sumOdd(100, 100);</strong></code> → should <strong>return </strong>0</p></li></ul><ul><li><p><code><strong>sumOdd(13, 13);</strong></code> → should <strong>return </strong>13 (This set contains one number, 13, and it is odd)</p></li></ul><ul><li><p><code><strong>sumOdd(100, -100);</strong></code> → should <strong>return</strong> -1</p></li></ul><ul><li><p><code><strong>sumOdd(100, 1000);</strong></code> → should <strong>return</strong> 247500</p></li></ul><p><br></p><p><strong>TIP:</strong> use the remainder operator to check if the number is odd</p><p><strong>NOTE: Both methods </strong>needs to be defined as<strong> public static </strong>like we have been doing so far in the course. <strong><br>NOTE:</strong> Do not add a <strong>main </strong>method to solution code.</p></div></div><div class="instructions--drag-handle--ocDGT"></div>