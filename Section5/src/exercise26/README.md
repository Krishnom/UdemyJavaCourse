<div class="instructions--content--1JI0g"><div class="instructions--title--3vSDk" data-purpose="exercise-title">Diagonal Star</div><div class="instructions--description--2Qd_w"><p>Write a method named&nbsp;<strong>printSquareStar&nbsp;</strong>with one parameter of type&nbsp;<strong>int&nbsp;</strong>named<strong>&nbsp;</strong>number.&nbsp;</p><p>If&nbsp;<strong>number is &lt; 5</strong>, the&nbsp;method should&nbsp;<strong>print "Invalid Value"</strong>.</p><p>The method&nbsp;<strong>should print</strong>&nbsp;diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by&nbsp;using loops&nbsp;(<strong>see examples below</strong>).</p><p><br></p><p><strong>EXAMPLE INPUT/OUTPUT:</strong></p><p><strong>EXAMPLE 1</strong></p><p><strong>printSquareStar(5);&nbsp;should</strong>&nbsp;<strong>print the following:</strong></p><p><strong>→ NOTE: For text in Code Blocks below, use code icon&nbsp;{...}&nbsp; on Udemy</strong></p><div class="ud-component--base-components--code-block" ng-non-bindable=""><div><pre class="prettyprint linenums prettyprinted" role="presentation" style=""><ol class="linenums"><li class="L0"><span class="pun">*****</span></li><li class="L1"><span class="pun">**</span><span class="pln"> </span><span class="pun">**</span></li><li class="L2"><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span></li><li class="L3"><span class="pun">**</span><span class="pln"> </span><span class="pun">**</span></li><li class="L4"><span class="pun">*****</span></li></ol></pre></div></div><p><strong><br>Explanation:</strong></p><div class="ud-component--base-components--code-block" ng-non-bindable=""><div><pre class="prettyprint linenums prettyprinted" role="presentation" style=""><ol class="linenums"><li class="L0"><span class="pun">*****</span><span class="pln">&nbsp;&nbsp;&nbsp;</span><span class="lit">5</span><span class="pln">&nbsp;stars</span></li><li class="L1"><span class="pun">**</span><span class="pln"> </span><span class="pun">**</span><span class="pln">&nbsp;&nbsp;&nbsp;</span><span class="lit">2</span><span class="pln">&nbsp;stars space&nbsp;</span><span class="lit">2</span><span class="pln">&nbsp;stars</span></li><li class="L2"><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span><span class="pln">&nbsp;&nbsp;&nbsp;</span><span class="lit">1</span><span class="pln">&nbsp;star space&nbsp;</span><span class="lit">1</span><span class="pln">&nbsp;star space&nbsp;</span><span class="lit">1</span><span class="pln">&nbsp;star</span></li><li class="L3"><span class="pun">**</span><span class="pln"> </span><span class="pun">**</span><span class="pln">&nbsp;&nbsp;&nbsp;</span><span class="lit">2</span><span class="pln">&nbsp;stars space&nbsp;</span><span class="lit">2</span><span class="pln">&nbsp;stars</span></li><li class="L4"><span class="pun">*****</span><span class="pln">&nbsp;&nbsp;&nbsp;</span><span class="lit">5</span><span class="pln">&nbsp;stars</span></li></ol></pre></div></div><p><br></p><p><strong>EXAMPLE 2</strong></p><p><strong>printSquareStar(8);&nbsp;should print the following:</strong></p><div class="ud-component--base-components--code-block" ng-non-bindable=""><div><pre class="prettyprint linenums prettyprinted" role="presentation" style=""><ol class="linenums"><li class="L0"><span class="pun">********</span></li><li class="L1"><span class="pun">**</span><span class="pln">&nbsp;&nbsp;&nbsp; </span><span class="pun">**</span></li><li class="L2"><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span><span class="pln">&nbsp; </span><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span></li><li class="L3"><span class="pun">*</span><span class="pln">&nbsp; </span><span class="pun">**</span><span class="pln">&nbsp; </span><span class="pun">*</span></li><li class="L4"><span class="pun">*</span><span class="pln">&nbsp; </span><span class="pun">**</span><span class="pln">&nbsp; </span><span class="pun">*</span></li><li class="L5"><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span><span class="pln">&nbsp; </span><span class="pun">*</span><span class="pln"> </span><span class="pun">*</span></li><li class="L6"><span class="pun">**</span><span class="pln">&nbsp;&nbsp;&nbsp; </span><span class="pun">**</span></li><li class="L7"><span class="pun">********</span></li></ol></pre></div></div><p><br></p><p>The patterns above&nbsp;consist of a&nbsp;<strong>number of rows and columns</strong>&nbsp;(where&nbsp;<strong>number&nbsp;</strong>is the&nbsp;<strong>number of rows</strong>&nbsp;to print). For each row or column, stars are printed based on four conditions (<strong>Read them carefully</strong>):</p><ul><li><p><strong>In the first or last row</strong></p></li><li><p><strong>In the first or last column</strong></p></li><li><p><strong>When the row number equals the column number</strong></p></li><li><p><strong>When the column number equals rowCount - currentRow + 1</strong><code><strong>&nbsp;</strong></code><strong>(where currentRow is current row number)</strong></p></li></ul><p><br></p><p><strong>HINT:</strong>&nbsp;Use a&nbsp;<strong>nested</strong>&nbsp;loop (a loop inside of a loop).</p><p><strong>HINT:</strong>&nbsp;To print on the same line, use the&nbsp;<strong>print</strong>&nbsp;method&nbsp;instead of&nbsp;<strong>println</strong>, e.g.<strong>&nbsp;</strong>System.out.print(" ");&nbsp;prints a space and&nbsp;<strong>does not "move" to another line</strong>.</p><p><strong>HINT:&nbsp;</strong>To "<strong>move" to another line</strong>, you can use an empty&nbsp;<strong>println</strong>&nbsp;call, e.g.&nbsp;<strong>System.out.println(); .</strong></p><p><strong>NOTE:</strong>&nbsp;The method&nbsp;<strong>printSquareStar&nbsp;​</strong>should be defined as<strong>&nbsp;public static&nbsp;</strong>like we have been doing so far in the course.</p><p><strong>NOTE:</strong>&nbsp;Do not add a&nbsp;<strong>main&nbsp;</strong>method to the solution code.</p></div></div><div class="instructions--drag-handle--ocDGT"></div>