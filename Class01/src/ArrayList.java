public class ArrayList {
	
	private String[] array = null;
	
	public boolean add(String lastval) {
		
		if(this.array != null) {
			String[] backup = this.array;
			this.array = new String[backup.length+1];
			for(int i=0;i<backup.length;i++) {
				this.array[i] = backup[i];
			}
		}else {
			this.array = new String[1];
		}
		this.array[this.array.length-1] = lastval;
		
		return true;
	}
	
	public String get(int index) {
		if(this.array ==null) {
			this.array = new String[1];
		}
		if(index >= this.array.length) {
			throw new IndexOutOfBoundsException();
		}
		return this.array[index];
	}
	
	public String remove(int index) {
		
			String[] backup = this.array;
			if(index<this.array.length) {
				this.array = new String[backup.length-1];
				int new_index = 0;
				//new_index
				for(int i =0;i<backup.length;i++) {
					if(i!=index) {
						this.array[new_index] = backup[i];
						new_index++;
					}
				}
			}
			return backup[index];
		
	}
	
	public int size() {
		return this.array.length;		
	}
	
	@Override
	public String toString() {
		String str = "[";
		if(this.array != null) {
			for(int i =0; i<this.array.length;i++) {
				str+=array[i];
				if(i!=this.array.length-1) {
					str+=",";
				}
				
			}
		}
		str+="]";
		return str;
	}
}
