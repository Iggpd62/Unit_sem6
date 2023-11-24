# Unit_sem6
Отчет Checkstyle:

<module name="Checker">
<module name="TreeWalker">
<module name="Indentation">
<property name="basicOffset" value="4"/>
<property name="braceAdjustment" value="0"/>
<property name="caseIndent" value="4"/>
<property name="throwsIndent" value="4"/>
<property name="arrayInitIndent" value="4"/>
</module>
<module name="RegexpSingleJavaCheck">
<property name="format" value="^[a-z][a-zA-Z0-9]*$"/>
<property name="ignoreModifiers" value="true"/>
</module>
<module name="JavadocStyle"/>
</module>
</module>


Отчет о покрытии тестами:

Element	Missed Instructions	Cov.	Missed Branches	Cov.	Missed	Cxty	Missed	Lines	Missed	Methods	Missed	Classes
Total	7 of 64	89 %	1 of 10	90 %	3	10	3	18	2	5	1	2
default	57	100 %	19	90 %	1	8	0	15	0	3	0	1
org.example	7	0 %		n/a	2	2	3	3	2	2	1	1


Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии:

1. `testCompareLists_bothListsEmpty`: Оба списка пусты. Метод `compareLists` вернет сообщение "Средние значения равны".

2. `testCompareLists_firstListEmpty`: Первый список пуст, а второй содержит элементы. "Второй список имеет большее среднее значение".

3. `testCompareLists_secondListEmpty`: Второй список пуст, а первый содержит элементы. "Первый список имеет большее среднее значение".

4. `testCompareLists_bothListsHaveSingleNumber_sameValue`: Оба списка содержат только один элемент с одинаковым значением. "Средние значения равны".

5. `testCompareLists_bothListsHaveSingleNumber_differentValue`: Оба списка содержат только один элемент, но с разными значениями. "Второй список имеет большее среднее значение".

6. `testCompareLists_bothListsHaveMultipleNumbers`: Оба списка содержат несколько элементов. "Второй список имеет большее среднее значение".

7. `testCompareLists_bothListsHaveDifferentSizes`: Оба списка имеют разные размеры. Ожидается, что метод `compareLists` вызовет исключение `AssertionError` с сообщением "Списки имеют разные размеры".
