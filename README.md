# HackerRank Regex
For **Java** use `\\.` instead of `\.`
 
## Introduction
### Easy
| Problem | Regex |
| ------- | ----- |
| [Matching Specific String](https://www.hackerrank.com/challenges/matching-specific-string/problem) | hackerrank |
| [Matching Anything But a Newline](https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem) | ((.){3}\\.?){4}$ |
| [Matching Digits & Non-Digit Characters](https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem) | (\d){2}\D(\d){2}\D(\d){4} |
| [Matching Whitespace & Non-Whitespace Character](https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem) | ((\S){2}\s?){3} |
| [Matching Word & Non-Word Character](https://www.hackerrank.com/challenges/matching-word-non-word/problem) | (\w){3}\W(\w){10}\W(\w){3} |
| [Matching Start & End](https://www.hackerrank.com/challenges/matching-start-end/problem) | ^\d(\w){4}\.$ |

## Character Class
### Easy
| Problem | Regex |
| ------- | ----- |
| [Excluding Specific Characters](https://www.hackerrank.com/challenges/excluding-specific-characters/problem) | ^[^0-9][^aeiou][^bcDF][\S][^AEIOU][^.,]$ |
| [Matching Specific Characters](https://www.hackerrank.com/challenges/matching-specific-characters/problem) | ^[1-3][0-2][xs0][30aA][xsu][.,]$ |
| [Matching Character Ranges](https://www.hackerrank.com/challenges/matching-range-of-characters/problem) | ^[a-z][1-9][^a-z][^A-Z][A-Z].* |

