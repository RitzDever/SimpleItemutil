import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemUtil {
	public static void giveAndEquipItem(Player p, ItemStack itm) {
		if (ItemUtil.isHelmet(itm.getType())
				&& ItemUtil.isEmpty(p.getInventory().getHelmet())) {
			p.getInventory().setHelmet(itm);
		} else if (ItemUtil.isChestplate(itm.getType())
				&& ItemUtil.isEmpty(p.getInventory().getChestplate())) {
			p.getInventory().setChestplate(itm);
		} else if (ItemUtil.isLeggings(itm.getType())
				&& ItemUtil.isEmpty(p.getInventory().getLeggings())) {
			p.getInventory().setLeggings(itm);
		} else if (ItemUtil.isBoots(itm.getType())
				&& ItemUtil.isEmpty(p.getInventory().getBoots())) {
			p.getInventory().setBoots(itm);
		} else {
			if (p.getInventory().getItemInHand() == null
					|| p.getInventory().getItemInHand().getType() == Material.AIR) {
				p.getInventory().setItemInHand(itm);
			} else {
				p.getInventory().addItem(itm);
			}
		}
	}

	public static final boolean isEmpty(ItemStack m) {
		return m == null || m.getType() == Material.AIR || m.getAmount() <= 0;
	}

	public static final boolean isHelmet(Material m) {
		return m == Material.SKULL_ITEM || m == Material.LEATHER_HELMET
				|| m == Material.IRON_HELMET || m == Material.GOLD_HELMET
				|| m == Material.DIAMOND_HELMET;
	}

	public static final boolean isChestplate(Material m) {
		return m == Material.LEATHER_CHESTPLATE
				|| m == Material.IRON_CHESTPLATE
				|| m == Material.GOLD_CHESTPLATE
				|| m == Material.DIAMOND_CHESTPLATE;
	}

	public static final boolean isBoots(Material m) {
		return m == Material.LEATHER_BOOTS || m == Material.IRON_BOOTS
				|| m == Material.GOLD_BOOTS || m == Material.DIAMOND_BOOTS;
	}

	public static final boolean isLeggings(Material m) {
		return m == Material.LEATHER_LEGGINGS || m == Material.IRON_LEGGINGS
				|| m == Material.GOLD_LEGGINGS
				|| m == Material.DIAMOND_LEGGINGS;
	}
}