public class Sound1 
{
	/** the array of values in this sound; guaranteed not to be null*/
	private int[] samples;
	/** Changes those values in this sound taht have an ampliutde greater than limit.
	 * Values greater than limit are changed to limit.
	 * Values less than -limit are changed to -limit.
	 * @param limit the amplitude limit
	 * Precondition: limit >= 0
	 * @return the number of values in this sound that this methond changed. 
	 */
	
	public int limitAmplitude(int limit)
	{
		/* to be implemted in part(a) */
		int changes = 0;
		for(int i = 0; i < this.samples.length; ++i)
		{
			if(this.samples[i] < -limit)
			{
				this.samples[i] = -limit;
				++changes;
			}
			if(this.samples[i] > limit)
			{
				this.samples[i] = limit;
				++changes;
			}
		}
		return changes;
	}
	/** Removes all silence from the beginning of this sound.
	 * Silence is represented by a vlaue of 0.
	 * Precondition: smaples contains at lease one nonzero value
	 * Postcondtion: the lenght of samples refelcts the removal of starting silence
	 */
	public void trimSilenceFromBeginning()
	{
		/* to be implemented in part (b) */
		int i = 0; 
		while(this.samples[i] == 0)
		{
			++i;
		}
		int[] newSamples = new int[this.samples.length - 1];
		for(int j = 0; j < newSamples.length; ++j)
		{
			newSamples [j] = this.samples[j+i];
		}
		this.samples = newSamples;
	}
	
	// There may be instance variable, constructors, and methods that are not shown. 


}
