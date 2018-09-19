package i_introduction._5_String_Templates

import util.TODO
import util.doc5

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask5(): Nothing = TODO(
    """
        Task 5.
        Copy the body of 'getPattern()' to the 'task5()' function below
        and rewrite it in such a way that it matches format: '13 JUN 1992'.
        Use the 'month' variable.
    """,
    documentation = doc5(),
    references = { getPattern(); month })

fun task5() = """\d{2} $month \d{4}"""
