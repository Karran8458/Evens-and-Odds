function EvensAndOdds(arr)
{
	for (var i = 0; i < arr.length-2; i++)
	{
		if ((arr[i]%2==1)&&(arr[i+1]%2==1)&&(arr[i+2]%2==1))
		{
			console.log("How odd!");
		}
		if ((arr[i]%2==0)&&(arr[i+1]%2==0)&&(arr[i+2]%2==0))
		{
			console.log("Even more so!");
		}
	}
}
