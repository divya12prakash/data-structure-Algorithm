package com.dp.basicalgorithms.binarysearch;


/**
 * We construct the a two dimensional table. The first row contains all the values
 * of the original array being passed.
 * We construct the next set of rows based on the values of the previous row by using the following formula.
 *
 *
 *   dp[i][j] = min(dp[i-1][j], dp[i-1][j + 2 (to the power)( i -1))
 *
 *
 *    To LOOKUP for a value, we need to find the ranges in the following manner.
 *     Lets say we want to find the minimum for the range, [l,r].
 *     First calculate p =  floor(log2(r - l + 1)).
 *     And then k = 2 to the power p.
 *
 *     lookup = min(t[p][l], t[p][r - k + 1])
 *
 *
 */
public class SparseTable {


}
