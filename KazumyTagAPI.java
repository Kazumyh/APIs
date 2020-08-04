package main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class KazumyTagAPI {

	public static Scoreboard score;

	/*
	 * Usar na sua onEnable o seguinte:
	 * 
	 * KazumyTagAPI.score = Bukkit.getScoreboardManager().getMainScoreboard();
	 * KazumyTagAPI.tagHead();
	 * 
	 */
	public static void tagHead() {

		if (score.getTeam("Dono") != null) {
			score.getTeam("Dono").unregister();
		}

		Team d = score.registerNewTeam("Dono");
		d.setPrefix("§4§lDONO §4");

		if (score.getTeam("Gerente") != null) {
			score.getTeam("Gerente").unregister();
		}

		Team g = score.registerNewTeam("Gerente");
		g.setPrefix("§4§lGERENTE §4");

		if (score.getTeam("Admin") != null) {
			score.getTeam("Admin").unregister();
		}

		Team a = score.registerNewTeam("Admin");
		a.setPrefix("§c§lAdmin §c");

		if (score.getTeam("Mod") != null) {
			score.getTeam("Mod").unregister();
		}

		Team m = score.registerNewTeam("Mod");
		m.setPrefix("§2§lMOD §2");

		if (score.getTeam("Ajudante") != null) {
			score.getTeam("Ajudante").unregister();
		}

		Team aj = score.registerNewTeam("Ajudante");
		aj.setPrefix("§e§lAJUDANTE §e");

		if (score.getTeam("Membro") != null) {
			score.getTeam("Membro").unregister();
		}

		Team mb = score.registerNewTeam("Membro");
		mb.setPrefix("§7");

	}
	
	/*
	 * Use este método para seu comando de setar tags de outros jogadores, se for para o comando de setar sua própria tag,
	 * utilize o método tag();
	 * Basta ter um conhecimento básico para não fazer bosta, obrigado por me ler ^^
	 * 
	 * -Kazumyh^^#9361
	 * 
	 */

	@SuppressWarnings("deprecation")
	public static void setTag(Player p, String Tag) {
		if (Tag.equalsIgnoreCase("dono")) {
			p.setPlayerListName("§4§lDONO §4" + p.getName());
			p.setCustomName("§4§lDONO §4" + p.getName());
			p.setDisplayName("§4§lDONO §4" + p.getName());
			score.getTeam("Dono").addPlayer(p);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Dono");
		}

		if (Tag.equalsIgnoreCase("gerente")) {
			p.setPlayerListName("§4§lGERENTE §4" + p.getName());
			p.setCustomName("§4§lGERENTE §4" + p.getName());
			p.setDisplayName("§4§lGERENTE §4" + p.getName());
			score.getTeam("Gerente").addPlayer(p);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Gerente");
		}

		if (Tag.equalsIgnoreCase("admin")) {
			p.setPlayerListName("§c§lADMIN §c" + p.getName());
			p.setCustomName("§c§lADMIN §c" + p.getName());
			p.setDisplayName("§c§lADMIN §c" + p.getName());
			score.getTeam("Admin").addPlayer(p);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Admin");
		}

		if (Tag.equalsIgnoreCase("mod")) {
			p.setPlayerListName("§2§lMOD §2" + p.getName());
			p.setCustomName("§2§lMOD §2" + p.getName());
			p.setDisplayName("§2§lMOD §2" + p.getName());
			score.getTeam("Membro").addPlayer(p);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Mod");
		}

		if (Tag.equalsIgnoreCase("ajudante")) {
			p.setPlayerListName("§e§lAJUDANTE §e" + p.getName());
			p.setCustomName("§e§lAJUDANTE §e" + p.getName());
			p.setDisplayName("§e§lAJUDANTE §e" + p.getName());
			score.getTeam("Ajudante").addPlayer(p);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Ajudante");
		}

	}

	@SuppressWarnings("deprecation")
	public static void removeTag(Player p) {
		p.setPlayerListName("§7§lMEMBRO §7" + p.getName());
		p.setCustomName("§7§lMEMBRO §7" + p.getName());
		p.setDisplayName("§7§lMEMBRO §7" + p.getName());
		score.getTeam("Membro").addPlayer(p);
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Membro");
	}
	
	/*
	 * Não use este método para seu comando de setar tags (/settag), apenas use para um comando de tag normal (tag <tag>)
	 * Para o comando setar tags, utilize o método setTag();
	 * Basta ter um conhecimento básico pra não fazer bosta, obrigado por me ler ^^
	 * 
	 * -Kazumyh^^#9361
	 * 
	 */

	@SuppressWarnings("deprecation")
	public static void tag(Player p, String tag) {

		if (tag.equalsIgnoreCase("dono")) {
			p.setPlayerListName("§4§lDONO §4" + p.getName());
			p.setCustomName("§4§lDONO §4" + p.getName());
			p.setDisplayName("§4§lDONO §4" + p.getName());
			score.getTeam("Dono").addPlayer(p);
		}

		if (tag.equalsIgnoreCase("gerente")) {
			p.setPlayerListName("§4§lGERENTE §4" + p.getName());
			p.setCustomName("§4§lGERENTE §4" + p.getName());
			p.setDisplayName("§4§lGERENTE §4" + p.getName());
			score.getTeam("Gerente").addPlayer(p);
		}

		if (tag.equalsIgnoreCase("admin")) {
			p.setPlayerListName("§c§lADMIN §c" + p.getName());
			p.setCustomName("§c§lADMIN §c" + p.getName());
			p.setDisplayName("§c§lADMIN §c" + p.getName());
			score.getTeam("Admin").addPlayer(p);
		}

		if (tag.equalsIgnoreCase("mod")) {
			p.setPlayerListName("§2§lMOD §2" + p.getName());
			p.setCustomName("§2§lMOD §2" + p.getName());
			p.setDisplayName("§2§lMOD §2" + p.getName());
			score.getTeam("Membro").addPlayer(p);
		}

		if (tag.equalsIgnoreCase("ajudante")) {
			p.setPlayerListName("§e§lAJUDANTE §e" + p.getName());
			p.setCustomName("§e§lAJUDANTE §e" + p.getName());
			p.setDisplayName("§e§lAJUDANTE §e" + p.getName());
			score.getTeam("Ajudante").addPlayer(p);
		}

		if (tag.equalsIgnoreCase("membro")) {
			p.setPlayerListName("§e§lAJUDANTE §e" + p.getName());
			p.setCustomName("§e§lAJUDANTE §e" + p.getName());
			p.setDisplayName("§e§lAJUDANTE §e" + p.getName());
			score.getTeam("Ajudante").addPlayer(p);
		}

	}

}
