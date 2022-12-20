public static int kthSmallest(int[] arr, int l,int h, int k)
{

int partition = partition(arr, l, h);

if (partition == k - 1)
    return arr[partition];

  else if (partition < k - 1)
    return kthSmallest(arr, partition + 1, h, k);

  else
    return kthSmallest(arr, l, partition - 1, k);
}