package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billSum=bill.sum()
        val annaBill=(billSum-bill[k])/2
        return it (annaBill==b) {
            "Bon Appetite"
        } else {
            if (annaBill>=b) {
                "${annaBill-b}"
            } else {
                "${b-annaBill}"
            }
        }
    }
}
