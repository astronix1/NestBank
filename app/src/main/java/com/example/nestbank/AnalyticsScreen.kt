package com.example.nestbank

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material.icons.rounded.TrendingUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnalyticsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Title
        Text(
            text = "Analytics Overview",
            style = MaterialTheme.typography.headlineSmall.copy(fontSize = 24.sp),
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Income & Expenses Summary
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            AnalyticsCard(
                title = "Income",
                amount = "₹12,450",
                icon = Icons.Rounded.ArrowUpward,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.weight(1f)
            )
            AnalyticsCard(
                title = "Expenses",
                amount = "₹7,320",
                icon = Icons.Rounded.ArrowDownward,
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Bar Graph (Stubbed UI)
        Text(
            text = "Spending Breakdown",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        SpendingBarGraph(
            values = listOf(30f, 50f, 80f, 40f, 60f, 100f, 70f)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Pie Chart Highlight
        Text(
            text = "Category Distribution",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(8.dp))

        PieChartPreview()

        Spacer(modifier = Modifier.height(24.dp))

        // Trends
        TrendCard(
            title = "Monthly Trend",
            subtitle = "Income increased by 12% from last month",
            icon = Icons.Rounded.TrendingUp,
            color = MaterialTheme.colorScheme.secondaryContainer
        )
    }
}

@Composable
fun AnalyticsCard(title: String,
                  amount: String,
                  icon: androidx.compose.ui.graphics.vector.ImageVector,
                  color: Color,
                  modifier: Modifier = Modifier
) {


    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier
            .padding(4.dp)
            .height(120.dp)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = color
            )
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = amount,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Composable
fun SpendingBarGraph(values: List<Float>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        values.forEach { height ->
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .fillMaxHeight(fraction = height / 100f)
                    .clip(RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                    .background(MaterialTheme.colorScheme.primary)
            )
        }
    }
}

@Composable
fun PieChartPreview() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    )
    {Canvas(
        modifier = Modifier
            .size(160.dp)
    ) {
        drawArc(
            color = Color(0xFF4CAF50),
            startAngle = 0f,
            sweepAngle = 120f,
            useCenter = true
        )
        drawArc(
            color = Color(0xFF2196F3),
            startAngle = 120f,
            sweepAngle = 90f,
            useCenter = true
        )
        drawArc(
            color = Color(0xFFFF9800),
            startAngle = 210f,
            sweepAngle = 150f,
            useCenter = true
        )
    }}
}

@Composable
fun TrendCard(title: String, subtitle: String, icon: androidx.compose.ui.graphics.vector.ImageVector, color: Color) {
    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnalyticsScreenPreview() {
    AnalyticsScreen()
}
