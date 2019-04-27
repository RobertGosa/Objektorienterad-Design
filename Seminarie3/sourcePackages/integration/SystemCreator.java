package integration;

public class SystemCreator {
	private AccountingSystem accountingSystem = new AccountingSystem();
	private InventorySystem inventorySystem = new InventorySystem();
	
	public AccountingSystem getAccountingSystem() {
		return this.accountingSystem;
	}
	
	public InventorySystem getInventorygSystem() {
		return this.inventorySystem;
	}
}
