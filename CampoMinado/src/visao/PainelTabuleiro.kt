package visao

import java.awt.GridLayout
import javax.swing.JPanel
import Tabuleiro

class PainelTabuleiro(tabuleiro: Tabuleiro) : JPanel() {

    init {
        layout = GridLayout(tabuleiro.qtdeLinhas, tabuleiro.qtdeColunas)
        tabuleiro.forEachCampo { campo ->
            val botao = BotaoCampo(campo)
            add(botao)
        }
    }
}