# HackerRank Regex
For **Java** use `\\` instead of single `\`
 
## Introduction
| Problem | Regex |
| ------- | ----- |
| [Matching Specific String](https://www.hackerrank.com/challenges/matching-specific-string/problem) | `hackerrank` |
| [Matching Anything But a Newline](https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem) | `((.){3}\\.?){4}$` |
| [Matching Digits & Non-Digit Characters](https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem) | `(\d){2}\D(\d){2}\D(\d){4}` |
| [Matching Whitespace & Non-Whitespace Character](https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem) | `((\S){2}\s?){3}` |
| [Matching Word & Non-Word Character](https://www.hackerrank.com/challenges/matching-word-non-word/problem) | `(\w){3}\W(\w){10}\W(\w){3}` |
| [Matching Start & End](https://www.hackerrank.com/challenges/matching-start-end/problem) | `^\d(\w){4}\.$` |

## Character Class
| Problem | Regex |
| ------- | ----- |
| [Excluding Specific Characters](https://www.hackerrank.com/challenges/excluding-specific-characters/problem) | `^[^0-9][^aeiou][^bcDF][\S][^AEIOU][^.,]$` |
| [Matching Specific Characters](https://www.hackerrank.com/challenges/matching-specific-characters/problem) | `^[1-3][0-2][xs0][30aA][xsu][.,]$` |
| [Matching Character Ranges](https://www.hackerrank.com/challenges/matching-range-of-characters/problem) | `^[a-z][1-9][^a-z][^A-Z][A-Z].*` |

## Repetitions
| Problem | Regex |
| ------- | ----- |
| [Matching {x} Repetitions](https://www.hackerrank.com/challenges/matching-x-repetitions/problem) | `^[02468a-zA-Z]{40}[13579\s]{5}$` |
| [Matching {x, y} Repetitions](https://www.hackerrank.com/challenges/matching-x-y-repetitions/problem) | `^[\d]{1,3}[a-zA-Z]{3,}[.]{0,3}$` |
| [Matching Zero Or More Repetitions](https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/problem) | `^[\d]{2,}[a-z]*[A-Z]*$` |
| [Matching One Or More Repetitions](https://www.hackerrank.com/challenges/matching-one-or-more-repititions/problem) | `^[\d]+[A-Z]+[a-z]+$` |
| [Matching Ending Items](https://www.hackerrank.com/challenges/matching-ending-items/problem) | `^[a-zA-Z]*s$` |

## Grouping and Capturing

<table>
    <thead>
        <tr>
            <th>Problem</th>
            <th>Regex</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <a href="https://www.hackerrank.com/challenges/matching-word-boundaries/problem">
                    Matching Word Boundaries
                </a>
            </td>
            <td>
                <code>
                    .*\b[aeiouAEIOU]+[a-zA-z]*\b.*
                </code>
            </td>
        </tr>
        <tr>
            <td>
                <a href="https://www.hackerrank.com/challenges/capturing-non-capturing-groups/problem">
                    Capturing & Non-Capturing Groups
                </a>
            </td>
            <td>
                <code>
                    ^.*(ok){3,}+.*$
                </code>
            </td>
        </tr>
        <tr>
            <td>
                <a href="https://www.hackerrank.com/challenges/alternative-matching/problem">
                    Alternative Matching
                </a>
            </td>
            <td>
                <code>
                    ^(Mr|Mr|Ms|Dr|Er)\.[a-zA-Z]+$
                </code>
            </td>
        </tr>
    </tbody>
</table>

## Backreferences
- [Matching Same Text Again & Again](https://www.hackerrank.com/challenges/matching-same-text-again-again/problem) - `^([a-z])(\w)(\s)(\W)(\d)(\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\S)\1\2\3\4\5\6\7\8\9\10$`
- [Backreferences To Failed Groups](https://www.hackerrank.com/challenges/backreferences-to-failed-groups/problem) - `^\d\d(-?)\d\d\1\d\d\1\d\d$`
- [Branch Reset Groups](https://www.hackerrank.com/challenges/branch-reset-groups/problem) - `^\d\d((-)|(---)|(.)|(:))\d\d\1\d\d\1\d\d$`
- [Forward References](https://www.hackerrank.com/challenges/forward-references/problem) - `^((tactac)+tic)+(tac|(tac)+tic)*$`

## Assertions
- [Positive Lookahead](https://www.hackerrank.com/challenges/positive-lookahead/problem) - `o(?=oo)`