# Score Keeper App
<h2>Project Overview:</h2>

This project is a chance for you to combine and practice everything you learned in this section of the Nanodegree program. You will be making an app that allows a user to keep track of points within a game.

The goal is to create an <b>Score Keeper app</b> which gives a user the ability to keep track of the score of two different teams playing a game of your choice.

<h3>Requirements</h3>

<ul>
<li><b>The chosen game has either multiple amounts of points that can be scored, as in american football, or multiple important metrics to track, such as fouls, outs, and innings in baseball.</b></li>
<br>
<li><b>App is divided into two columns, one for each team.</b></li>
<br>
<li><b>Each column contains a large TextView to keep track of the current score for that team.
<br>Optionally, a second TextView to track another important metric such as fouls can be added.</li></b>
<br>
<li><b>Each column contains multiple buttons. The buttons must track either:</b>
  <ul><li>Each track a different kind of scoring</li>
  <li>Each track a different metric (one score, the other fouls, for instance).</li>
</ul></li>
<br>
<li><b>The layout contains a ‘reset’ button.</b></li>
<br>
<li><b>The code adheres to all of the following best practices:</b>
  <ul><li>Text sizes are defined in sp</li>
  <li>Lengths are defined in dp</li>
  <li>Padding and margin is used appropriately, such that the views are not crammed up against each other.</li>
</ul></li>
<br>
<li><b>The code runs without errors.</li></b>
<br>
<li><b>Each score button updates the score TextView in its column by adding the correct number of points.</li></b>
<br>
<li><b>The reset button resets the scores on both of the score TextViews.</li></b>
<br>
<li><b>Any classes are named after the object they represent.All variables are named by their intended contents.
<br>All methods are named by their intended effect or in the style required by a callback interface.</li></b>
<br>
<li><b>There are no unnecessary blank lines.One variable is declared per declaration line.
<br>The code within a method is indented with respect to the method declaration line.</li></b>
</ul>
<br>

# Cross Scoreboard
<h2>Some Cross Game Info:</h2>

The cards
Originally the game was played with the Hungarian playing cards (32 cards), but it can also be played with the normal Poker playing cards (52 cards excluding jokers). There are 4 suits (colors). 
Only 24 cards are used for the Cross game, 6 of each suit.

<ul>
<li> Nine	- 0 points </li>
<li> Jack	- 2 points </li>
<li> Queen - 3 points </li>
<li> King	- 4 points </li>
<li> Ten	- 10 points </li>
<li> Ace	- 11 points </li>
</ul>

Points & Values

A player collects all the cards from the hands he won, and sums up the card points. Additionally, the points awarded for the announcements he made are added to the sum. An announcement is made by a player when he owns a king and a queen of the same suit, leads the hand and plays one of the two cards from the mentioned pair. It doesn’t matter if he wins the hand or not. The awarded points are:
40 points for king & queen, when the suit is trump
20 points for king & queen, when the suit is not the trump

If a player manages to make all the possible announcements(calls), he will get 40 + 20 + 20 +20 = 100 points.

What counts for the game score are the cross points. 1 cross point equals 33 card points. If the number of card points is between the correspondences below, only the complete number of cross points is awarded (for example, for 110 card points only 3 cross points are awarded). Thus the following correspondences:
<ul>
<li>1 cross point = 33 card points</li>
<li>2 cross points = 66 card points</li>
<li>3 cross points = 99 card points</li>
<li>4 cross points = 132 card points</li>
<li>5 cross points = 165 card points</li>
<li>6 cross points = 198 card points</li>
</ul>

<br>
<h2>Screenshots:</h2>

![1](https://cloud.githubusercontent.com/assets/27139870/25824120/e1e17590-3446-11e7-88b5-728ef2a6db38.png)
![2](https://cloud.githubusercontent.com/assets/27139870/25824122/e1e61f00-3446-11e7-8bc1-2a9fe08ccb2c.png)
![3](https://cloud.githubusercontent.com/assets/27139870/25824124/e1ea16d2-3446-11e7-8eba-23a90a0a3dfc.png)
![4](https://cloud.githubusercontent.com/assets/27139870/25824123/e1e69e9e-3446-11e7-8f0b-8cf0b0dc99f6.png)
![5](https://cloud.githubusercontent.com/assets/27139870/25824119/e1e16ac8-3446-11e7-96d5-cd245353c26f.png)
![6](https://cloud.githubusercontent.com/assets/27139870/25824121/e1e538c4-3446-11e7-8c66-b5cb2d3258d1.png)
![7](https://cloud.githubusercontent.com/assets/27139870/25858624/de2eda8e-34e4-11e7-9cb9-754b53a2bf47.png)
