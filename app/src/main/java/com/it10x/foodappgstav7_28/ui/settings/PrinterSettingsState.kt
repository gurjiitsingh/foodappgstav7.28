package com.it10x.foodappgstav7_28.ui.settings

import com.it10x.foodappgstav7_28.data.PrinterConfig
import com.it10x.foodappgstav7_28.data.PrinterRole

data class PrinterSettingsState(
    val printers: Map<PrinterRole, PrinterConfig> = emptyMap()
)
