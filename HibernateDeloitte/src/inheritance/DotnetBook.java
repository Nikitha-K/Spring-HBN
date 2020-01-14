package inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@DiscriminatorValue(value = "")

public class DotnetBook extends Book {


		
		private int cds;

		public int getCds() {
			return cds;
		}

		public void setCds(int cds) {
			this.cds = cds;
		}
		

	}


